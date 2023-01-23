package com.heinzelman.connector.futureIcon;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Picto")

@Getter
@Setter

public class Picto {

    @Id
    @Column(name = "pictoId")
    private Long iconId;

    @Column(name = "fileName")
    private String fileName;

    @Column(name = "libName")
    private String libName;

    @Column(name = "weight")
    private Long weight;

}
