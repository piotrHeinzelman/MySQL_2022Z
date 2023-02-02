package pl.heinzelman.dbmodule.EntityN;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity(name = "parn_icon_name")
@Table(name = "parn_icon_name")
public class IconName extends LangEnt{

    public IconName() {}
    public IconName( Long fk_id, Long id_lang, String lang_name ) {
        super( fk_id, id_lang, lang_name );
    }

}
