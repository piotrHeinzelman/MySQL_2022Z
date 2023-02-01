package pl.heinzelman.dbmodule.newDictClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LayoutTargetService extends SimpleEntService<LayoutTarget, LayoutTargetRepo> {

    @Autowired private LayoutTargetRepo repo;

    public LayoutTargetService(LayoutTargetRepo repo ) { super(repo); }
}


/*


@Service
public class InddMasterService extends AbsSimpleDictService<InddMaster, InddMasterRepo> {

    @Autowired InddMasterRepo repo;
    public InddMasterService(InddMasterRepo repo) { super(repo); }
}


 */