package com.iscweb.persistence.repositories.impl;

import com.google.common.collect.Sets;
import com.iscweb.common.model.entity.ISpeaker;
import com.iscweb.common.model.metadata.SpeakerStatus;
import com.iscweb.common.util.StringUtils;
import com.iscweb.persistence.model.jpa.SpeakerJpa;
import com.iscweb.persistence.model.jpa.SpeakerTagJpa;
import com.iscweb.persistence.model.jpa.TagJpa;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Set;

@Slf4j
@Repository
public class SpeakerJpaRepositoryCustomImpl extends BaseJpaCompositeEntityRepositoryImpl<ISpeaker, SpeakerJpa> implements SpeakerJpaRepositoryCustom {

    private static final Set<String> IGNORED_PROPERTIES = Sets.newHashSet("tags", "regions");

    @Getter
    @Setter(onMethod = @__({@Autowired}))
    private SpeakerTagJpaRepository speakerTagJpaRepository;

    @Getter
    @Setter(onMethod = @__({@Autowired}))
    private TagJpaRepository tagJpaRepository;

    public SpeakerJpaRepositoryCustomImpl() {
        super(SpeakerJpa.class);
    }

    @Override
    protected String mapPropertyName(String propertyName) {
        String result = null;
        // exclude tags column from DB query
        if (!IGNORED_PROPERTIES.contains(propertyName)) {
            result = super.mapPropertyName(propertyName);
        }

        return result;
    }

    @Override
    protected Predicate createTagsFilter(Root<SpeakerJpa> root, CriteriaBuilder builder, List<String> tags) {
        List<TagJpa> tagsList = getTagJpaRepository().findAllByNameIn(tags);
        List<SpeakerTagJpa> doorTags = getSpeakerTagJpaRepository().findAllByTagIn(tagsList);

        CriteriaBuilder.In<Long> inClause = builder.in(root.get("id"));
        for (SpeakerTagJpa doorTag : doorTags) {
            inClause.value(doorTag.getEntity().getId());
        }

        return inClause;
    }

    @Override
    protected Predicate createPredicate(Root<SpeakerJpa> root, CriteriaBuilder builder, String fieldName, String fieldValue) {
        Predicate predicate;
        if ("region".equalsIgnoreCase(fieldName)) {
            predicate = createRegionsFilter(root, builder, fieldValue);
        } else if ("status".equalsIgnoreCase(fieldName) && !StringUtils.isBlank(fieldValue)) {
            SpeakerStatus status;
            try {
                status = SpeakerStatus.valueOf(fieldValue.toUpperCase());
            } catch (IllegalArgumentException e) {
                log.trace("Unable to parse status from string: {}", fieldValue, e);
                status = SpeakerStatus.UNKNOWN;
            }

            predicate = builder.equal(root.get(fieldName), status);
        } else if ("name".equalsIgnoreCase(fieldName) && !StringUtils.isBlank(fieldValue)) {
            predicate = builder.or(
                    builder.like(
                            builder.lower(root.get(fieldName)),
                            builder.lower(builder.literal("%" + fieldValue + "%"))
                    ),
                    builder.like(
                            builder.lower(root.get("guid")),
                            builder.lower(builder.literal("%" + fieldValue + "%"))
                    )
            );
        } else {
            predicate = super.createPredicate(root, builder, fieldName, fieldValue);
        }

        return predicate;
    }
}
