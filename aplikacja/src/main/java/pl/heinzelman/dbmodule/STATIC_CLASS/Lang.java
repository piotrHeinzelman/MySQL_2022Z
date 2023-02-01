package pl.heinzelman.dbmodule.STATIC_CLASS;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "lang")
@Table(name = "lang")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Lang extends AbstractDict {

    @Column(name = "currency" )
    private String currency;

    @Column(name = "table_header" )
    private String tableHeader;

    @Column(name = "compl_header" )
    private String complementaryHeader;

    @Column(name = "precision" )
    private Long precision = 2L;

    public Lang() {}
    public Lang(String myName ) {
        super();
        setName( myName );
    }

    @Override
    public void setName( String name ) {
        super.setName( name.trim().toUpperCase() );
    }

}
