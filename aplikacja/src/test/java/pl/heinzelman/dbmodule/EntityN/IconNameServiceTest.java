package pl.heinzelman.dbmodule.EntityN;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IconNameServiceTest {

    @Autowired IconNameService iconNameService;

    @Test
    public void beforeAll() {

        IconName in = iconNameService.save(new IconName(1L, 1L,"pierwszy !"));


    }
}