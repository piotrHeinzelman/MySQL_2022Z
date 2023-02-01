package pl.heinzelman.dbmodule.newDictClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeasureService extends SimpleEntService<Measure, MeasureRepo> {

    @Autowired private MeasureRepo repo;
    public MeasureService(MeasureRepo repo ) { super(repo); }


    public Measure addMeasure( String sys_name ){
        return repo.save( new Measure( sys_name ));
    }

}

