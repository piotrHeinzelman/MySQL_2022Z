package pl.heinzelman.dbmodule.dict2Key;

import jakarta.persistence.*;
import lombok.ToString;
import pl.heinzelman.dbmodule.Enums.Lang;

@ToString
@Entity(name = "name_short")
@Table(name = "name_short")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class NameShort extends AbsDoubleDict {


    @Column(name = "name_short")
    private String nameShort;

    @Column(name = "name_accept")
    private Long nameAccept;

    @Lob
    @Column(name = "description_short")
    private String descriptionShort;

    @Column(name = "description_accept")
    private Long descriptionAccept;




    public NameShort() {}
    public NameShort(Long id, Lang lang, String nameShort) {
        super(id, lang);
        this.nameShort = nameShort;
    }
}


