package pl.heinzelman.dbmodule.EntityN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitNameService extends LangEntService<UnitName, UnitNameRepo> {

    @Autowired private UnitNameRepo repo;
    public UnitNameService(UnitNameRepo repo ) { super(repo); }
}


/*


@Service
public class InddMasterService extends AbsSimpleDictService<InddMaster, InddMasterRepo> {

    @Autowired InddMasterRepo repo;
    public InddMasterService(InddMasterRepo repo) { super(repo); }
}


 */