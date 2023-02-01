package pl.heinzelman.dbmodule.dict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitTypeService extends AbsSimpleDictService<UnitType, UnitTypeRepo> {

    @Autowired UnitTypeRepo repo;

    public UnitTypeService(UnitTypeRepo repo) {
        super(repo);
    }
}

