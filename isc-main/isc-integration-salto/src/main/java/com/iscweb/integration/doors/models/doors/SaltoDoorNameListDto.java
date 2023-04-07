package com.iscweb.integration.doors.models.doors;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.iscweb.integration.doors.models.ISaltoDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaltoDoorNameListDto implements ISaltoDto {

    @JsonProperty("DoorID")
    private List<String> doorIds;
}
