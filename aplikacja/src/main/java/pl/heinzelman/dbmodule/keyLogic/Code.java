package pl.heinzelman.dbmodule.keyLogic;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString

@Entity(name = "code")
@Table(name = "code")

public class Code implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_code")
    private Long ID_code;

    @Column( name = "code_string", unique=true)
    private String codeString;

    @Column( name="EAN")
    private String EAN;

    @Column (name = "exact_id")
    private Long ExactId;

    @Column (name = "category")
    private Long category;

    @Column(name="active")
    private boolean active;

    public Code() {}
    public Code( String codeString ) {
        this.setCodeString( codeString );
        this.active = true;
    }

    public void setCodeString( String codeString ) {
        if ( codeString == null || codeString.trim().equals("") || codeString.trim().length()<3 ) {
            System.out.println(" throw new RuntimeException( \"codeString == null\" ) "); return;
        }
        this.codeString = codeString.trim().toUpperCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code = (Code) o;
        return Objects.equals(ID_code, code.ID_code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_code);
    }
}
