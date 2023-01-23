package com.heinzelman.connector.futureIcon;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Setter
@Getter
public class keyPictoData implements Serializable {

    private Long codeId;
    private Long iconId;

}
