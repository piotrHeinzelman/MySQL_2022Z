package pl.heinzelman.dbmodule.dict;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString

@Entity(name = "icon_family")
@Table(name = "icon_family")
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class IconFamily extends AbsSimpleDict {

    public IconFamily() {}
    public IconFamily(String name) { super(name); }

}
