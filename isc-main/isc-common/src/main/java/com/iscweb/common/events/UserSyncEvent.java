package com.iscweb.common.events;

import com.iscweb.common.annotations.EventPath;
import com.iscweb.common.events.payload.UserSyncPayload;
import com.iscweb.common.model.EntityType;
import com.iscweb.common.service.integration.IUserSyncService;
import com.iscweb.common.util.EventUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * External user sync event.
 *
 * Generated by implementation of <code>IUserSyncService</code> usually located in correspondent integration module.
 * The sync process is triggered by core <code>SyncScheduler</code> component.
 *
 * @see IUserSyncService
 */
@Data
@EqualsAndHashCode(callSuper = true)
@EventPath(path = UserSyncEvent.PATH)
public class UserSyncEvent extends BaseExternalEntityRawEvent<UserSyncPayload> {
    public static final String PATH = "user.sync";

    @Getter
    @Setter
    private String externalEntityId;

    public UserSyncEvent() {
        setEntityType(EntityType.USER);
    }

    @Override
    public String getEventPath() {
        return EventUtils.generatePath(UserSyncEvent.PATH, super.getEventPath());
    }
}
