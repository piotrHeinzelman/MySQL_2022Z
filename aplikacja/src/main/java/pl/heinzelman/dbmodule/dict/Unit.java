package pl.heinzelman.dbmodule.dict;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity(name = "unit")
@Table(name = "unit")
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class Unit extends AbsSimpleDict {


    @Column( name = "id_unit_type")
    private Long idUnitType;

    @Column( name = "suffix")
    private String suffix;

    @Column( name = "multi")
    private Double multi = 1.0;

    @Column( name = "next_unit_id")
    private Long next_unit_ID;

    @Column( name = "separator")
    private String separator;

    public Unit() {}

    public Unit(String name, Long idUnitType, String suffix, Double multi) {
        super(name);
        this.idUnitType = idUnitType;
        this.suffix = suffix;
        this.multi = multi;
    }
}
