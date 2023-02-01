package pl.heinzelman.dbmodule.newDictClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService extends SimpleEntService<Word, WordRepo> {

    @Autowired WordRepo repo;
    public WordService( WordRepo repo ) { super(repo); }

}

