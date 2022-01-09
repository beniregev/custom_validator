package com.beniregev.customvalidator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FieldTripForm {
    private String name;
    private int age;
    private String guardian;
}
