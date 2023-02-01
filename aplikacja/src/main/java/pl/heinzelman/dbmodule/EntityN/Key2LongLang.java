package pl.heinzelman.dbmodule.EntityN;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class Key2LongLang implements Serializable {

    @Column( name = "fk_id")
    @Id protected Long fk_id;

    @Column( name = "id_lang")
    @Id protected Long id_lang;


    public Key2LongLang() {}
    public Key2LongLang(Long id, Long id_lang) {
        this.fk_id = id;
        this.id_lang = id_lang;
    }

    @Override  public String toString() { return "Id{id=" + fk_id + ", lang=" + id_lang + '}'; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key2LongLang idLang = (Key2LongLang) o;
        return fk_id.equals(idLang.fk_id) && id_lang.equals(idLang.id_lang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fk_id, id_lang);
    }
}






