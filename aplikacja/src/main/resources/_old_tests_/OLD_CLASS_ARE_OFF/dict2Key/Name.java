package pl.heinzelman.dbmodule.dict2Key;

import jakarta.persistence.*;
import lombok.ToString;
import pl.heinzelman.dbmodule.Enums.Lang;

@ToString
@Entity(name = "name")
@Table(name = "name")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class Name extends AbsDoubleDict {


    @Column(name = "name")
    private String name;

    @Column(name = "name_accept")
    private Long nameAccept;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "description_accept")
    private Long descriptionAccept;

    @Column(name = "name_need_translate")
    private Boolean nameNeedTranslate;

    @Column(name = "description_need_translate")
    private Boolean descriptionNeedTranslate;


    @Lob
    @Column(name = "name_in_table")
    private String nameInTable; // OK

    @Column(name = "table_header")
    private String tableHeader; // not now!

    @Lob
    @Column(name = "indd_inline_description")
    private String inddInlineDescription; // OK


    public Name() {}
    public Name(Long id, Lang lang, String name) {
        super(id, lang);
        this.name = name;
    }

}


