package com.CRUDProject.Plasmin01.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class AddDonorRequest {
    private long Id;
    private String name;
    private String phone;
    private String bloodGroup;
    private String releaseDate;
    private String Area;

}
