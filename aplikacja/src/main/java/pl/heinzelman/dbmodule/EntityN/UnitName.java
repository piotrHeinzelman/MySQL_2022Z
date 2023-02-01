package pl.heinzelman.dbmodule.EntityN;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity(name = "parn_unit_name")
@Table(name = "parn_unit_name")
public class UnitName extends LangEnt{

    public UnitName() {}
    public UnitName(Long fk_id, Long id_lang, String lang_name) {
        super(fk_id, id_lang, lang_name);
    }

}
