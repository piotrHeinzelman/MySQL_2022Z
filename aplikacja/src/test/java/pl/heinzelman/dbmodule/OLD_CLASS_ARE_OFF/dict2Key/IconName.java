package pl.heinzelman.dbmodule.dict2Key;

import jakarta.persistence.*;
import pl.heinzelman.dbmodule.Enums.Lang;

@Entity(name = "icon_name")
@Table(name = "icon_name")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class IconName extends AbsDoubleDict {

    @Column( name = "name")
    private String name;

    public IconName() {}

    public IconName(Long id, Lang lang, String name) {
        super(id, lang);
        this.name = name;
    }
}


