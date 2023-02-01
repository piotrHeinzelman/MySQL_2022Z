package pl.heinzelman.dbmodule.newDictClass;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity(name = "par_strings")
@Table(name = "par_strings")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )

public class Strings extends SimpleEnt {

    public Strings() { super(); }
    public Strings(String sysName ) { super(sysName); }

}
