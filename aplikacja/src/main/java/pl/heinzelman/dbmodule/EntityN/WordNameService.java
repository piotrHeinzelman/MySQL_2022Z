package pl.heinzelman.dbmodule.EntityN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordNameService extends LangEntService<WordName, WordNameRepo> {

    @Autowired private WordNameRepo repo;

    public WordNameService(WordNameRepo repo ) { super(repo); }
}


/*


@Service
public class InddMasterService extends AbsSimpleDictService<InddMaster, InddMasterRepo> {

    @Autowired InddMasterRepo repo;
    public InddMasterService(InddMasterRepo repo) { super(repo); }
}


 */