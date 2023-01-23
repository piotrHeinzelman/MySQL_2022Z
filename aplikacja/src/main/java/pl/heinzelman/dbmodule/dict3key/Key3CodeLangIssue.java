package pl.heinzelman.dbmodule.dict3key;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@ToString
@Getter
@Setter
public class Key3CodeLangIssue implements Serializable {

    private Long id;
    private Long id_lang;
    private Long id_issue;

    public Key3CodeLangIssue() {}

    public Key3CodeLangIssue(Long id, Long id_lang, Long id_issue) {
        this.id = id;
        this.id_lang = id_lang;
        this.id_issue = id_issue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key3CodeLangIssue that = (Key3CodeLangIssue) o;
        return Objects.equals(id, that.id) && Objects.equals(id_lang, that.id_lang) && Objects.equals(id_issue, that.id_issue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_lang, id_issue);
    }
}






