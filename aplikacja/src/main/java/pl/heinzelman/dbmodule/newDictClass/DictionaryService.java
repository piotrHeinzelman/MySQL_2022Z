package pl.heinzelman.dbmodule.newDictClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService extends SimpleEntService<Dictionary, DictionaryRepo> {

    @Autowired DictionaryRepo repo;

    public DictionaryService(DictionaryRepo repo ) { super(repo); }
}


/*


@Service
public class InddMasterService extends AbsSimpleDictService<InddMaster, InddMasterRepo> {

    @Autowired InddMasterRepo repo;
    public InddMasterService(InddMasterRepo repo) { super(repo); }
}


 */