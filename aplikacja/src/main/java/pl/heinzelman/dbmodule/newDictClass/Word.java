package pl.heinzelman.dbmodule.newDictClass;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity(name = "par_word")
@Table(name = "par_word")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )

public class Word extends SimpleEnt {


    @Column( name = "id_dictionary" )
    protected Long id_dictionary; // -> FK par_dictionary.id

    public Word() { super(); }
    public Word( String sysName ) { super(sysName); }
    public Word( Long id_dictionary ) {
        this.id_dictionary = id_dictionary;
    }
}
/*
@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
@PrimaryKeyJoinColumn

 */

/*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
 */

/*
    @OneToOne(mappedBy = "address")
 */

/*



 */