package com.heinzelman.connector.futureIcon;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PictoParam")

@Getter
@Setter

@IdClass( keyPictoData.class )
public class PictoParam {


    @Column(name = "codeId")
    @Id private Long codeId;

    @Column(name = "pictoId")
    @Id private Long pictoId;

    @Column(name = "dimensionId")
    private String dimensionId;

    @Column(name = "unit")
    private Long unit;

    // paramNameId name by lang
    // table
    //
    //                          <-- paramId <--( lang , unit )
    //  codeId -->     XXX
    //                          <-- valueId
    //

}
