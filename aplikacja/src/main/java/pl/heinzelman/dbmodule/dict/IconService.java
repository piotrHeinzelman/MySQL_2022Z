package pl.heinzelman.dbmodule.dict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IconService  extends AbsSimpleDictService<Icon, IconRepo> {

    @Autowired IconRepo repo;
    public IconService( IconRepo repo) {super(repo); }
}

