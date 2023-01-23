package pl.heinzelman.dbmodule.keyLogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pl.heinzelman.dbmodule.keyLogic.Lang.*;

class LangTest {

    @Test
    void getPrecision() {

        Lang lng = PL;
        System.out.println( PL +" : "+ PL.getID_lang());
        System.out.println( EN.getCurrency() );
        System.out.println( FR.getComplementaryHeader());

    }
}