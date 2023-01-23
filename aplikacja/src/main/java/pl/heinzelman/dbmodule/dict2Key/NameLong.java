package pl.heinzelman.dbmodule.dict2Key;

import jakarta.persistence.*;
import lombok.ToString;
import pl.heinzelman.dbmodule.Enums.Lang;

@ToString
@Entity(name = "name_long")
@Table(name = "name_long")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class NameLong extends AbsDoubleDict {


    @Column(name = "name_long")
    private String nameLong;

    @Column(name = "name_accept")
    private Long nameAccept;

    @Lob
    @Column(name = "description_long")
    private String descriptionLong;

    @Column(name = "description_accept")
    private Long descriptionAccept;


    public NameLong() {}
    public NameLong(Long id, Lang lang, String nameLong) {
        super(id, lang);
        this.nameLong = nameLong;
    }
}


