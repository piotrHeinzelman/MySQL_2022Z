package pl.heinzelman.dbmodule.EntityN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.heinzelman.dbmodule.newDictClass.SimpleEntService;

@Service
public class IconNameService extends LangEntService<IconName, IconNameRepo> {

    @Autowired private IconNameRepo repo;

    public IconNameService( IconNameRepo repo ) { super(repo); }
}


/*


@Service
public class InddMasterService extends AbsSimpleDictService<InddMaster, InddMasterRepo> {

    @Autowired InddMasterRepo repo;
    public InddMasterService(InddMasterRepo repo) { super(repo); }
}


 */