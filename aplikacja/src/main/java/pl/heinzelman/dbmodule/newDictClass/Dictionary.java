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
@Entity(name = "par_dictionary")
@Table(name = "par_dictionary")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )

public class Dictionary extends SimpleEnt {

    public Dictionary() { super(); }
    public Dictionary(String sysName ) { super(sysName); }

}
