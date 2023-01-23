package pl.heinzelman.dbmodule.keyLogic;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class IdCL implements Serializable {

    private Long codeId;
    private Long langId;

    public IdCL() { }
    public IdCL( Long codeId, Long langId ) {
        this.codeId = codeId;
        this.langId = langId;
    }

    /*
        private static Logger logger = Logger.getLogger("IdCLi");
    */

    @Override
    public String toString() {
        return ""+codeId+":"+langId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdCL idCL = (IdCL) o;
        return codeId.equals( idCL.codeId ) && langId.equals( idCL.langId );
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeId, langId);
    }
}






