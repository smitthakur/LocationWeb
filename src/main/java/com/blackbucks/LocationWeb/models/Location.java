package com.blackbucks.LocationWeb.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "locations")
public class Location {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String code;
    private  String name;
    private  String type;
}
