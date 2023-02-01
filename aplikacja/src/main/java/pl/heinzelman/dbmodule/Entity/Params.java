package pl.heinzelman.dbmodule.Entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
@Entity(name = "par_param")
@Table(name = "par_param")


public class Params {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Long id;

    @Column ( name = "id_code" )
    private Long id_code;

    @Column ( name = "id_icon" )
    private Long id_icon;

    @Column ( name = "id_unit" )
    private Long id_unit;

    @Column ( name = "num_value" )
    private Double num_value;

    @Column ( name = "id_word" )
    private Long id_word;

    @Column ( name = "id_strings" )
    private Long id_strings;

    @Column ( name = "priority" )
    private Long priority;

    /*
    @Lob
    @Column ( name = "LONG" , columnDefinition="NVARCHAR(max)")
    protected String LONG;
    */

    public Params() {}

    public Params( Long id_code, Long id_icon, Long id_unit, Double num_value ) {
        this.id_code = id_code;
        this.id_icon = id_icon;
        this.id_unit = id_unit;
        this.num_value = num_value;
    }

    public Params( Long id_code, Long id_icon, Long id_word ) {
        this.id_code = id_code;
        this.id_icon = id_icon;
        this.id_word = id_word;
    }




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
















