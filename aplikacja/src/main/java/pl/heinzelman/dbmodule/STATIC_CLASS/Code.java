package pl.heinzelman.dbmodule.STATIC_CLASS;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter

@Entity(name = "code")
@Table(name = "code")

public class Code implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "code_id")
    private Long codeId;

    @Column(name = "code_string", unique = true)
    private String codeString;

    @Column(name = "ean", nullable = true )
    private String EAN;

    @Column(name = "exact_id")
    private Long ExactId;

    @Column(name = "active")
    private boolean active;

    public Code() {}
    public Code( String codeString ) {
        this.setCodeString( codeString );
        this.active = true;
    }

    /*
    public Code(Map<String, String> map ) {
        this.codeString = isNotEmpty( map.get("codeString").trim().toUpperCase());
        this.EAN = isNotEmpty( map.get("EAN") );
        this.ExactId = isNotEmpty( Long.parseLong( map.get("ExactId")));
        this.active = true;
    }
    */
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
        return Objects.equals(codeId, code.codeId);
    }

    @Override
    public int hashCode() {
        if ( codeId!=null  ) return Objects.hash( codeId );
        return Objects.hash( "" + codeString );
    }


    @Override
    public String toString() {
        return "Code{" +
                "<codeId>" + codeId + "</codeId>" +
                "<codeString>" + codeString + "</codeString>" +
                "<EAN>" + EAN + "</EAN>" +
                "<ExactId>" + ExactId + "</ExactId>" +
                "<active>" + active + "</active>}"
                ;
    }
}
