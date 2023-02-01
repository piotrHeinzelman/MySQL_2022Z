package pl.heinzelman.dbmodule.dict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IconFamilyService extends AbsSimpleDictService<IconFamily, IconFamilyRepo> {

    @Autowired IconFamilyRepo repo;
    public IconFamilyService(IconFamilyRepo repo) { super(repo);}

}


