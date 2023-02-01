package pl.heinzelman.dbmodule.newDictClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StringService extends SimpleEntService<Strings, StringRepo> {

    @Autowired StringRepo repo;
    public StringService(StringRepo repo ) { super(repo); }

}

