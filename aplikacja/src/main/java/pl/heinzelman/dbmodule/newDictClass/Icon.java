package pl.heinzelman.dbmodule.newDictClass;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity(name = "par_icon")
@Table(name = "par_icon")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )

public class Icon extends SimpleEnt {

    @Column( name = "id_measure" )
    protected Long id_measure;

    @Column( name = "id_dictionary" )
    protected Long id_dictionary;

    @Column( name = "id_icon_group" )
    protected Long id_icon_group;

    @Column( name = "layout_target" )
    protected Long layout_target;

    @Column( name = "is_tech" ) protected boolean is_tech;
    @Column( name = "is_promo" ) protected boolean is_promo;

    @Column( name = "in_paper" ) protected boolean in_paper;
    @Column( name = "in_catalog" ) protected boolean in_catalog;
    @Column( name = "in_shipping" ) protected boolean in_shipping;
    @Column( name = "in_rack" ) protected boolean in_rack;

    @Column( name = "in_fish_top" ) protected boolean in_fish_top;
    @Column( name = "in_fish_bottom" ) protected boolean in_fish_bottom;
    @Column( name = "in_t_znamionowa" ) protected boolean in_t_znamionowa;
    @Column( name = "in_t_ostrzerzen" ) protected boolean in_t_ostrzerzen;

    @Column( name = "in_opak_jedn" ) protected boolean in_opak_jedn;
    @Column( name = "in_opak_zbiorcze" ) protected boolean in_opak_zbiorcze;
    @Column( name = "in_instrukcja" ) protected boolean in_instrukcja;

    public Icon() { super(); }
    public Icon(String sysName ) { super(sysName); }

}
