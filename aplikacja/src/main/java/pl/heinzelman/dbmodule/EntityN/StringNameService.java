package pl.heinzelman.dbmodule.EntityN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StringNameService extends LangEntService<StringName, StringNameRepo> {

    @Autowired private StringNameRepo repo;

    public StringNameService( StringNameRepo repo ) { super(repo); }
}


/*


@Service
public class InddMasterService extends AbsSimpleDictService<InddMaster, InddMasterRepo> {

    @Autowired InddMasterRepo repo;
    public InddMasterService(InddMasterRepo repo) { super(repo); }
}


 */