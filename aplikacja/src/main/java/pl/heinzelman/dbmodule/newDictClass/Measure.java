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
@Entity(name = "par_measure")
@Table(name = "par_measure")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )

public class Measure extends SimpleEnt {

    public Measure() { super(); }
    public Measure( String sysName ) { super(sysName); }

    @Override
    public String toString() {
        return "Measure{" +
                "id=" + id +
                ", sysName='" + sysName + '\'' +
                '}';
    }
}
