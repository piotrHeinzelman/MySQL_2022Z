package pl.heinzelman.dbmodule.EntityN;

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
@IdClass( Key2LongLang.class )
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class LangEnt implements Serializable {

    @Id
    @Column( name = "fk_id" )
    protected Long fk_id;

    @Id
    @Column ( name = "id_lang" )
    protected Long id_lang;

    @Column ( name = "lang_name" )
    protected String lang_name;

    @Transient protected  Map<String, Method> _getters;
    @Transient protected  Map<String, Method> _setters;

    public LangEnt() {}
    public LangEnt(Long fk_id, Long id_lang) {
        this.fk_id = fk_id;
        this.id_lang = id_lang;
    }

    public LangEnt(Long fk_id, Long id_lang, String lang_name) {
        this.fk_id = fk_id;
        this.id_lang = id_lang;
        this.lang_name = lang_name;
    }

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
