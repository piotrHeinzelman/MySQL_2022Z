package pl.heinzelman.dbmodule.dict2Key;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class IdLang implements Serializable {

    private Long id;
    private Long id_lang;

    public IdLang() {}
    public IdLang(Long id, Long id_lang) {
        this.id = id;
        this.id_lang = id_lang;
    }

    @Override  public String toString() { return "Id{id=" + id + ", lang=" + id_lang + '}'; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdLang idLang = (IdLang) o;
        return id.equals(idLang.id) && id_lang.equals(idLang.id_lang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_lang);
    }
}






