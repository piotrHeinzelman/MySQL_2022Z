package pl.heinzelman.dbmodule.dict;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString

@Entity(name = "unit_type")
@Table(name = "unit_type")
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class UnitType extends AbsSimpleDict {

    public UnitType() {}
    public UnitType(String name) { super(name); }


}
