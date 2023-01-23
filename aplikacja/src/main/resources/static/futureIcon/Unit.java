package com.heinzelman.connector.futureIcon;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Unit {

    @Column(name = "unit_id")
    @Id Long unitId;

    @Column(name = "unit_name")
    private String unitName;

}
