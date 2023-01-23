package pl.heinzelman.dbmodule.dict3key;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.heinzelman.dbmodule.Enums.Lang;

import java.io.Serializable;

@Getter
@Setter
@Entity(name = "price")
@Table(name = "price")
@IdClass( Key3CodeLangIssue.class )
public class Price {


    @Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
    public class AbsDoubleDict implements Serializable {

        @Column(name = "id")
        @Id
        protected Long id;

        @Column(name = "id_lang")
        @Id
        protected Long id_lang;

        @Column(name = "id_issue")
        @Id
        protected Long id_issue;

        @Column(name = "price")
        protected Double price;

        @Column(name = "promo")
        protected Double promo;

        public AbsDoubleDict() { }

        public AbsDoubleDict(Long id, Long id_lang, Long id_issue, Double price, Double promo) {
            this.id = id;
            this.id_lang = id_lang;
            this.id_issue = id_issue;
            this.price = price;
            this.promo = promo;
        }
    }

}
