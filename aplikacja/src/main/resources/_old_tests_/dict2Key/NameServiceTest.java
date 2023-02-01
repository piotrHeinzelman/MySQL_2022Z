package pl.heinzelman.dbmodule.dict2Key;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.heinzelman.dbmodule.Enums.Lang;
import pl.heinzelman.dbmodule.keyLogic.Code;
import pl.heinzelman.dbmodule.keyLogic.CodeService;

import java.util.Optional;

import static pl.heinzelman.dbmodule.Enums.Lang.PL;

@SpringBootTest
class NameServiceTest {

    @Autowired private CodeService codeService;
    @Autowired private NameService nameService;

    @Test
    void nameTest() {
        String codeString = "DED123Test";
        String name = "Klucz SAS 18V";
        Lang lng = PL;

        Code code = codeService.findByCodeString(codeString).orElse( new Code( codeString.trim().toUpperCase() ));
        if ( code.getID_code()==null ) codeService.save( code );

        Long codeId = code.getID_code();

        Name kluczName = nameService.save( new Name ( codeId , PL , name ));
        System.out.println( code.toString() );
        System.out.println( kluczName.toString() );

    }
}