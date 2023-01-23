package pl.heinzelman.dbmodule.dict;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString

@Entity(name = "icon")
@Table(name = "icon")
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class Icon extends AbsSimpleDict {

    @Column( name = "id_unit_type")
    private Long idUnitType;

    @Column( name = "id_icon_family")
    private Long idIconFamily;

    @Column( name = "is_tech")
    private Boolean isTech;

    @Column( name = "is_promo")
    private Boolean isPromo;

    @Column( name = "in_paper")
    private Boolean inPaper;

    @Column( name = "in_catalog")
    private Boolean inCatalog;

    @Column( name = "in_shipping")
    private Boolean inShipping;

    @Column( name = "in_rack")
    private Boolean inRack;

    @Column( name = "in_fish_top")
    private Boolean inFishTop;

    @Column( name = "in_fish_bottom")
    private Boolean inFishBottom;

    @Column( name = "in_t_znamionowa")
    private Boolean inTabZnamionowa;

    @Column( name = "in_t_ostrzerzen")
    private Boolean inTabOstrzerzen;

    @Column( name = "in_opak_jedn")
    private Boolean inOpakJedn;

    @Column( name = "in_opak_zbiorcze")
    private Boolean inOpakZbiorcze;

    @Column( name = "in_instrukcja")
    private Boolean inInstrukcja;

    public Icon() {}
    public Icon(String name, Long idUnitType, Long idIconFamily) {
        super(name);
        this.idUnitType = idUnitType;
        this.idIconFamily = idIconFamily;
    }
}
