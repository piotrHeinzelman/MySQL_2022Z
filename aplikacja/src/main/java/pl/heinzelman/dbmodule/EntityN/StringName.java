package pl.heinzelman.dbmodule.EntityN;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity(name = "parn_string_name")
@Table(name = "parn_string_name")
public class StringName extends LangEnt{

    public StringName() {}
    public StringName(Long fk_id, Long id_lang, String lang_name) {
        super(fk_id, id_lang, lang_name);
    }

}
