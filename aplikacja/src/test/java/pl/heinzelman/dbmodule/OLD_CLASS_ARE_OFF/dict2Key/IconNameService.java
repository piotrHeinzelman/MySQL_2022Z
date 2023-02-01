package pl.heinzelman.dbmodule.dict2Key;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IconNameService extends AbsDoubleDictService<IconName, IconNameRepo> {

    @Autowired
    IconNameRepo repo;

    public IconNameService(IconNameRepo repo) {
        super(repo);
    }
}