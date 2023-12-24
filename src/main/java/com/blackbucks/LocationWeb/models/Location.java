package com.blackbucks.LocationWeb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Location {
    @Id
    private int id;
    private  String code;
    private  String name;
    private  String type;
}
