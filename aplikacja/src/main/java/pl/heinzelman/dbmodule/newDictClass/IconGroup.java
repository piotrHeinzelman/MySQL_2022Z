package pl.heinzelman.dbmodule.newDictClass;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity(name = "par_icon_group")
@Table(name = "par_icon_group")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )

public class IconGroup extends SimpleEnt {

}
