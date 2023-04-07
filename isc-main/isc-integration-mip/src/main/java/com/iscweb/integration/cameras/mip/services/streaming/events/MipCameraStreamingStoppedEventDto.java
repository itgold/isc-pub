package com.iscweb.integration.cameras.mip.services.streaming.events;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MipCameraStreamingStoppedEventDto implements MipCameraEventDto {
    private String type = MipCameraStreamingStoppedEventDto.class.getSimpleName();
}
