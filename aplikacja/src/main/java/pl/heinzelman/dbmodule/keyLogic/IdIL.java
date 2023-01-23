package pl.heinzelman.dbmodule.keyLogic;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class IdIL implements Serializable {

    private Long ID_icon;
    private Long ID_lang;

    public IdIL() { }
    public IdIL(Long ID_icon, Long ID_lang ) {
        this.ID_icon = ID_icon;
        this.ID_lang = ID_lang;
    }

    /*
        private static Logger logger = Logger.getLogger("IdCLi");
    */

    @Override
    public String toString() {
        return ""+ID_icon+":"+ID_lang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdIL idCL = (IdIL) o;
        return ID_icon.equals( idCL.ID_icon ) && ID_lang.equals( idCL.ID_lang );
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_icon, ID_lang);
    }
}






