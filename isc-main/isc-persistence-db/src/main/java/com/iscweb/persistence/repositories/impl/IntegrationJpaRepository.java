package com.iscweb.persistence.repositories.impl;

import com.iscweb.persistence.model.jpa.IntegrationJpa;
import com.iscweb.persistence.model.jpa.SchoolDistrictJpa;
import com.iscweb.persistence.repositories.IPersistenceRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository for {@link SchoolDistrictJpa} objects.
 */
@Repository
@Transactional(propagation = Propagation.REQUIRED, transactionManager = "jpaTransactionManager")
public interface IntegrationJpaRepository extends IPersistenceRepository<IntegrationJpa> {

    IntegrationJpa findByGuid(String guid);
}
