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
@Entity(name = "par_word")
@Table(name = "par_word")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )

public class Word extends SimpleEnt {

    public Word() { super(); }
    public Word( String sysName ) { super(sysName); }

}
