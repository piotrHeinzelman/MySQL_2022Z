package pl.heinzelman.dbmodule.dict;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity(name = "issue")
@Table(name = "issue")
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class Issue extends AbsSimpleDict {

    public Issue() {}
    public Issue( String name ) { super( name.trim().toUpperCase() ); }
}
