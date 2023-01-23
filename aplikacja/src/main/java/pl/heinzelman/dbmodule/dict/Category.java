package pl.heinzelman.dbmodule.dict;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name = "category")
@Table(name = "category")
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class Category extends AbsSimpleDict {

    @Column( name = "category_parent")
    private Long category_parent;

    @Column (name = "exact_id")
    private Long ExactId;

    public Category() {}
    public Category( String name ) { super(name); }

}
