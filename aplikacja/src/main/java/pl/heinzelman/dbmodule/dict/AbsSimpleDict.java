package pl.heinzelman.dbmodule.dict;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Getter
@Setter
@MappedSuperclass
public class AbsSimpleDict implements Serializable {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    protected Long id;

    @Column ( name = "name" )
    protected String name;


    @Transient protected  Map<String, Method> _getters;
    @Transient protected  Map<String, Method> _setters;

    public AbsSimpleDict () {}
    public AbsSimpleDict ( String name ) { this.setName( name ); }
    public void setName  ( String name ) { if ( name!=null ) { this.name = name.trim(); }  this.name = name; }


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






    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "{" +
                "<id>" + id + "</id>"+
                "<name>" + name + "<name>" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbsSimpleDict absSimpleDict = (AbsSimpleDict) o;
        return Objects.equals(id, absSimpleDict.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
