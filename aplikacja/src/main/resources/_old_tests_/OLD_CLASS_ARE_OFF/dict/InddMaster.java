package pl.heinzelman.dbmodule.dict;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString

@Entity(name = "indd_master")
@Table(name = "indd_master")
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class InddMaster extends AbsSimpleDict  {

    public InddMaster() {}
    public InddMaster(String name) { super(name); }

}
