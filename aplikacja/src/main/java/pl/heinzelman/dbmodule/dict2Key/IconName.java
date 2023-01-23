package pl.heinzelman.dbmodule.dict2Key;

import jakarta.persistence.*;
import pl.heinzelman.dbmodule.dict.AbsSimpleDict;
import pl.heinzelman.dbmodule.keyLogic.Lang;

@Entity(name = "icon_name")
@Table(name = "icon_name")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class IconName extends AbsDoubleDict {

    @Column( name = "name")
    private String name;

    public IconName() {}
    public IconName(Long id, Long id_lang) { super(id, id_lang); }
    public IconName(IdLang idLang) { super(idLang); }
    public IconName(IdLang idLang, String name) { super(idLang); this.name = name; }

    public IconName(Long id, Lang lng , String name) {
        super(id, lng.getID_lang());
        this.name = name;
    }
}


