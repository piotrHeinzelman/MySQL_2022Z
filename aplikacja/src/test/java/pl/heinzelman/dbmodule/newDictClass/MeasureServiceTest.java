package pl.heinzelman.dbmodule.newDictClass;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class MeasureServiceTest {

    @Autowired
    private MeasureService measureService;

    @Test
    public void measureServiceGlobalTest() {
        String sys_name = " dlugosc ";
        Measure meas_dlugosc = new Measure();
                meas_dlugosc.setSysName( sys_name );

        Measure meas_dlugosc2 = new Measure( sys_name );

        measureService.save( meas_dlugosc );

        System.out.println( measureService.count() );
        System.out.println( measureService.findAllBySysName( sys_name ) );
        System.out.println( meas_dlugosc );

    }
}


