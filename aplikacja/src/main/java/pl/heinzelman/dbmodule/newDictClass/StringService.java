package pl.heinzelman.dbmodule.newDictClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.heinzelman.dbmodule.EntityN.StringName;
import pl.heinzelman.dbmodule.EntityN.StringNameService;

@Service
public class StringService extends SimpleEntService<Strings, StringRepo> {

    @Autowired private StringRepo repo;
    @Autowired private final StringNameService stringNameService;

    public StringService(StringRepo repo, StringNameService stringNameService) {
        super(repo);
        this.repo = repo;
        this.stringNameService = stringNameService;
    }

    public Strings addString(  String string_PL ){
        Strings S = save( new Strings() );
        stringNameService.save( new StringName( S.getId() , 1L , string_PL ));
        return S;
    }

}

/*

DECLARE @akumulator BIGINT;  INSERT INTO [dbo].strings (sys_name) VALUES (NULL) ; SET @akumulator = SCOPE_IDENTITY();
    INSERT INTO [dbo].strings_name (id_strings, id_lang, lang_name ) VALUES ( @akumulator, 1, 'DED7034, DED7035, DED6936, DED6937' );

*/