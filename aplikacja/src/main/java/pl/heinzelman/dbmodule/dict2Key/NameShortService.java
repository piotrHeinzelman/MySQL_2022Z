package pl.heinzelman.dbmodule.dict2Key;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameShortService extends AbsDoubleDictService<NameShort, NameShortRepo> {

    @Autowired IconNameRepo repo;
    public NameShortService(NameShortRepo repo) {
        super(repo);
    }

}