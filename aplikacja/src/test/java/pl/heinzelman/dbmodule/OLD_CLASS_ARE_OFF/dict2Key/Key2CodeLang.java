package pl.heinzelman.dbmodule.dict2Key;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class Key2CodeLang implements Serializable {

    private Long id;
    private Long id_lang;

    public Key2CodeLang() {}
    public Key2CodeLang(Long id, Long id_lang) {
        this.id = id;
        this.id_lang = id_lang;
    }

    @Override  public String toString() { return "Id{id=" + id + ", lang=" + id_lang + '}'; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key2CodeLang idLang = (Key2CodeLang) o;
        return id.equals(idLang.id) && id_lang.equals(idLang.id_lang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_lang);
    }
}






