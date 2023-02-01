package pl.heinzelman.dbmodule.Entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity(name = "par_comments")
@Table(name = "par_comments")
public class Comm {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Long id;

    @Column( name = "code_id" )
    private Long code_id;

    @Column ( name = "comm" )
    private String comm;

    public Comm() {}
    public Comm(Long code_id, String comm) {
        this.code_id = code_id;
        this.comm = comm;
    }
}
















