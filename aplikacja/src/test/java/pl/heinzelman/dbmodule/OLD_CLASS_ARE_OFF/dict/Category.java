package pl.heinzelman.dbmodule.dict;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity(name = "category")
@Table(name = "category")
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class Category extends AbsSimpleDict {

    @Column( name = "category_parent")
    private Long category_parent;

    @Column (name = "exact_id")
    private Long ExactId;

    @Column (name = "exact_name")
    private String exactName;


    public Category() {}
    public Category( String name ) { super(name); }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", _getters=" + _getters +
                ", _setters=" + _setters +
                ", category_parent=" + category_parent +
                ", ExactId=" + ExactId +
                ", exactName=" + exactName +
                '}';
    }
}
