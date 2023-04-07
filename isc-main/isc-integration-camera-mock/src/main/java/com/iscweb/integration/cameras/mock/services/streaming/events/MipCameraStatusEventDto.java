package com.iscweb.integration.cameras.mock.services.streaming.events;

import com.iscweb.common.model.event.ITypedPayload;
import com.iscweb.integration.cameras.mock.events.MipCameraDeviceEvent;
import com.iscweb.integration.cameras.mock.services.streaming.dto.LiveStatusItem;
import lombok.Data;

import java.util.List;

@Data
public class MipCameraStatusEventDto implements MipCameraEventDto, ITypedPayload {

    private long statusTime;

    private List<LiveStatusItem> status;

    @Override
    public String getType() {
        return MipCameraDeviceEvent.PATH;
    }
}
