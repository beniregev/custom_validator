package com.beniregev.customvalidator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "field_trip")
public class FieldTrip {
    @Id
    private long id;
    private String name;
    private int age;
    private String guardian;
}
