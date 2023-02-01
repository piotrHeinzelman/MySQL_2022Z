package pl.heinzelman.dbmodule.STATIC_CLASS;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractDict implements Serializable {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    protected Long id;

    @Column ( name = "name" , unique = true )
    protected String name;

    @Lob
    @Column ( name = "description" , columnDefinition="NVARCHAR(max)")
    protected String description;

    @Column ( name = "active")
    protected Boolean active;

    @Column(name = "exact_string")
    protected String ExactString;

    @Transient protected  Map<String, Method> _gfields;
    @Transient protected  Map<String, Method> _sfields;

    public AbstractDict() { this.active = true; }
    public AbstractDict( String name ) { this.setName( name ); this.active = true; }
    public void setName( String name ) { this.name = name.trim().toUpperCase(); }



    public  Map<String, Method> gFields() {
        if ( _gfields == null ) {
             _gfields = new HashMap<>( 9 );
            //_gfields = new LinkedHashMap<>( 9 , .7f , true );
             for ( Method m : this.getClass().getMethods() ) {
                if ( !m.getName().startsWith("get") ) continue;
                if ( m.getName().equals("getClass") ) continue;
                 if ( m.getName().equals("getId") ) continue;
                 if ( m.getName().equals("getName") ) continue;
                 if ( m.getName().equals("getDescription") ) continue;
                 if ( m.getName().equals("getActive") ) continue;
                 if ( m.getName().equals("getExactId") ) continue;
                if ( m.getName().startsWith("get_") ) continue;

                _gfields.put( m.getName().substring(3,4).toLowerCase()+""+m.getName().substring(4) , m );
             }
         }
        return _gfields;
    }

    public Map<String, Method> sFields() {
        if ( _sfields == null ) {
            _sfields = new HashMap<>( 9 );
            for (Method m : this.getClass().getMethods()) {
                if (!m.getName().startsWith("set")) continue;
                if (m.getName().startsWith("set_")) continue;
                if (m.getName().equals("setId")) continue;
                if (m.getName().equals("setName")) continue;
                if (m.getName().equals("setDescription")) continue;
                if (m.getName().equals("setActive")) continue;
                if (m.getName().equals("setExactId")) continue;
                _sfields.put(m.getName().substring(3,4).toLowerCase()+""+m.getName().substring(4), m);
            }
        }
        return _sfields;
    }






    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "{" +
                "<id>" + id + "</id>"+
                "<name>" + name + "<name>" +
                "<description>" + description + "</description>" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractDict abstractDict = (AbstractDict) o;
        return Objects.equals(id, abstractDict.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
