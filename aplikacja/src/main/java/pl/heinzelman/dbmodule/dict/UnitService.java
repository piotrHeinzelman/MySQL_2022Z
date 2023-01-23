package pl.heinzelman.dbmodule.dict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitService extends AbsSimpleDictService<Unit, UnitRepo> {

    @Autowired UnitRepo repo;

    public UnitService(UnitRepo repo) { super(repo); }
}
