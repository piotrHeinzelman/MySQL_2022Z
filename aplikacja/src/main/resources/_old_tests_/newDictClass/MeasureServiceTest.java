package pl.heinzelman.dbmodule.newDictClass;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class MeasureServiceTest {

    @Autowired
    private MeasureService measureService;

    @Test
    static void measureServiceGlobalTest() {
        measureService.count();

    }
}