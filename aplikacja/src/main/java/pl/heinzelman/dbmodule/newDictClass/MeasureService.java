package pl.heinzelman.dbmodule.newDictClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeasureService extends SimpleEntService<Measure, MeasureRepo> {

    @Autowired MeasureRepo repo;
    public MeasureService(MeasureRepo repo ) { super(repo); }

}

