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
@Entity(name = "par_layout_target")
@Table(name = "par_layout_target")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )

public class LayoutTarget extends SimpleEnt {

    public LayoutTarget() { super(); }
    public LayoutTarget(String sysName ) { super(sysName); }

}
