package pl.heinzelman.dbmodule.dict;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString

@Entity(name = "unit")
@Table(name = "unit")
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class Unit extends AbsSimpleDict {

    @Column( name = "type")
    private Long type;

    @Column( name = "suffix")
    private String suffix;

    @Column( name = "multi")
    private Double mutli = 1.0;

    @Column( name = "next_unit_id")
    private Long next_unit_ID;

    @Column( name = "separator")
    private String separator;

    public Unit() {}
    public Unit(String name) { super(name); }
    public Unit(String name, Long type, String suffix, Double mutli) {
        super(name);
        this.type = type;
        this.suffix = suffix;
        this.mutli = mutli;
    }

}
