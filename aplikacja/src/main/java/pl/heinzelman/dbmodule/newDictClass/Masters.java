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
@Entity(name = "par_masters")
@Table(name = "par_masters")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )

public class Masters extends SimpleEnt {

    public Masters() { super(); }
    public Masters( String sysName ) { super(sysName); }

}
