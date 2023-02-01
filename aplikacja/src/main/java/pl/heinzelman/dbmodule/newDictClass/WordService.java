package pl.heinzelman.dbmodule.newDictClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.heinzelman.dbmodule.EntityN.WordNameService;

@Service
public class WordService extends SimpleEntService<Word, WordRepo> {

    @Autowired private final WordRepo repo;
    @Autowired private final WordNameService wordNameService;

    public WordService( WordRepo repo, WordNameService wordNameService ) {
        super(repo);
        this.repo=repo;
        this.wordNameService = wordNameService;
    }

    /*
    DECLARE @Glazura BIGINT;  INSERT INTO [dbo].word ( id_dictionary ) VALUES ( @DICT_przeznaczenie_ciecie_plytki  ); SET @Glazura = SCOPE_IDENTITY();
    DECLARE @Gres BIGINT;     INSERT INTO [dbo].word ( id_dictionary ) VALUES ( @DICT_przeznaczenie_ciecie_plytki  ); SET @Gres = SCOPE_IDENTITY();
    DECLARE @Glazura_i_gres BIGINT;  INSERT INTO [dbo].word ( id_dictionary ) VALUES ( @DICT_przeznaczenie_ciecie_plytki  ); SET @Glazura_i_gres = SCOPE_IDENTITY();

    INSERT INTO [dbo].word_name (id_word, id_lang, lang_name ) VALUES ( @Glazura, 1, 'glazura' );
*/
}

