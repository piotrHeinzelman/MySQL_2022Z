package pl.heinzelman.dbmodule.newDictClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterService extends SimpleEntService<Master, MasterRepo> {

    @Autowired private MasterRepo repo;
    public MasterService(MasterRepo repo ) { super(repo); }

}

