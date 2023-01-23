package pl.heinzelman.dbmodule.keyLogic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static pl.heinzelman.dbmodule.keyLogic.Lang.PL;

@SpringBootTest
class LangServiceTest {

    @Autowired
    private LangService langService;

    @Test
    void count() {

        System.out.println( PL );
        System.out.println( Lang.getById( 2L ) );
        System.out.println( Lang.getByCode("UA") );
        System.out.println( Lang.getByCode("XX") );

        System.out.println( langService.count() );
        System.out.println( langService.findAll() );
        System.out.println( langService.findById( 2L ) );
        Assertions.assertThrows( Throwable.class ,  ()->langService.findById( 233L ) );
        System.out.println( langService.findByCode( "LV" ) );
        Assertions.assertThrows( Throwable.class ,  ()->langService.findByCode( null ) );
        Assertions.assertThrows( Throwable.class ,  ()->langService.findByCode( "XY" ) );


    }
}