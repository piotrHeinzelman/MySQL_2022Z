package pl.heinzelman.dbmodule.dict3key;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@ToString
@Getter
@Setter
public class Key2CodeIssue implements Serializable {

    private Long id;
    private Long id_issue;

    public Key2CodeIssue() {}
    public Key2CodeIssue(Long id, Long id_issue) {
        this.id = id;
        this.id_issue = id_issue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key2CodeIssue that = (Key2CodeIssue) o;
        return Objects.equals(id, that.id) && Objects.equals(id_issue, that.id_issue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_issue);
    }
}






