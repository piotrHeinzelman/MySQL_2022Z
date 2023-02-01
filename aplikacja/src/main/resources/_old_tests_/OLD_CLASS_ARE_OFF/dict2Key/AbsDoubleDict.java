package pl.heinzelman.dbmodule.dict2Key;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.heinzelman.dbmodule.Enums.Lang;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@MappedSuperclass
@IdClass( Key2CodeLang.class )
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class AbsDoubleDict implements Serializable {

    @Column( name = "id")
    @Id protected Long id;

    @Column( name = "id_lang")
    @Id protected Long id_lang;


    @Transient protected  Map<String, Method> _getters;
    @Transient protected  Map<String, Method> _setters;

    public  Map<String, Method> gFields() {
        if ( _getters == null ) {
             _getters = new HashMap<>( 9 );

             for ( Method m : this.getClass().getMethods() ) {
                if ( !m.getName().startsWith("get") ) continue;
                 if ( m.getName().equals("getClass") ) continue;
                 if ( m.getName().equals("getId") ) continue;
                 if ( m.getName().equals("getId_lang") ) continue;
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
                if (m.getName().equals("getId_lang")) continue;
                _setters.put(m.getName().substring(3,4).toLowerCase()+""+m.getName().substring(4), m);
            }
        }
        return _setters;
    }


    public AbsDoubleDict() {}
    public AbsDoubleDict( Long id, Lang lang ) {
        this.id = id;
        this.id_lang = lang.getID_lang();
    }

}
