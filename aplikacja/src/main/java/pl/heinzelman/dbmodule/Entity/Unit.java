package pl.heinzelman.dbmodule.Entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pl.heinzelman.dbmodule.newDictClass.SimpleEnt;

import javax.persistence.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
@Entity(name = "par_unit")
@Table(name = "par_unit")


public class Unit  {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Long id;

    @Column ( name = "sys_name" )
    private String sysName;

    @Column ( name = "id_measure" )
    private Long idMeasure;

    @Column ( name = "suffix" )
    private String suffix;

    @Column ( name = "multi" )
    private Double multi;

    @Column ( name = "next_id_measure" )
    private Long next_id_measure;

    @Column ( name = "separator" )
    private String separator;

    public Unit() {}

    public Unit(String sysName, Long idMeasure, String suffix, Double multi) {
        this.sysName = sysName;
        this.idMeasure = idMeasure;
        this.suffix = suffix;
        this.multi = multi;
    }
    /*

CREATE TABLE dbo.unit (
    id       bigint       NOT NULL IDENTITY ,
    sys_name     varchar(255) NOT NULL,
    id_measure BIGINT FOREIGN KEY REFERENCES dbo.measure ( id ),
    suffix varchar(255) NULL,
    multi DECIMAL(32,16),
    next_id_measure BIGINT NULL,
    separator varchar(255) NULL,
    PRIMARY KEY( id )
);

 */

    /*
    @Lob
    @Column ( name = "LONG" , columnDefinition="NVARCHAR(max)")
    protected String LONG;
    */





    @Transient protected Map<String, Method> _getters;
    @Transient protected  Map<String, Method> _setters;

    public  Map<String, Method> gFields() {
        if ( _getters == null ) {
            _getters = new HashMap<>( 9 );

            for ( Method m : this.getClass().getMethods() ) {
                if ( !m.getName().startsWith("get") ) continue;
                if ( m.getName().equals("getClass") ) continue;
                if ( m.getName().equals("getId") ) continue;
                if ( m.getName().equals("getName") ) continue;
                if ( m.getName().startsWith("get_") ) continue;

                _getters.put( m.getName().substring(3,4).toLowerCase()+""+m.getName().substring(4) , m );
            }
        }
        return _getters;
    }

    public Map<String, Method> sFields() {
        if ( _setters == null ) {
            _setters = new HashMap<>( 9 );
            for (Method m : this.getClass().getMethods()) {
                if (!m.getName().startsWith("set")) continue;
                if (m.getName().startsWith("set_")) continue;
                if (m.getName().equals("setId")) continue;
                if (m.getName().equals("setName")) continue;
                if (m.getName().equals("setActive")) continue;
                _setters.put(m.getName().substring(3,4).toLowerCase()+""+m.getName().substring(4), m);
            }
        }
        return _setters;
    }




}
















