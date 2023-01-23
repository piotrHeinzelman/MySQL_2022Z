package pl.heinzelman.dbmodule.dict3key;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.heinzelman.dbmodule.Enums.Lang;

import java.io.Serializable;

@Getter
@Setter
@IdClass( Key2CodeIssue.class )
@Entity(name = "product_lst")
@Table(name = "product_lst")
public class ProductLst {

     @Column(name = "id")
     @Id private Long id;

     @Column(name = "id_lang")
     @Id private Long id_lang;

     @Column(name = "id_issue")
     @Id private Long id_issue;

     @Column(name = "page_num")
     Long pageNum;

     @Column(name = "my_order")
     private Long MyOrder;

    public ProductLst() {}

    public ProductLst(Long id, Lang lng, Long id_issue, Long pageNum) {
        this.id = id;
        this.id_lang = lng.getID_lang();
        this.id_issue = id_issue;
        this.pageNum = pageNum;
    }
}
