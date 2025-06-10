package org.scoula.ex03.dto;

import lombok.Data;

import java.util.*;

@Data
public class SampleDTOList {
    private List<SampleDTO> List;

    public SampleDTOList() {
        List = new ArrayList<>();
    }
}
