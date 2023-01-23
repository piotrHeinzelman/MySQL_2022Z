package pl.heinzelman.dbmodule.oldDict;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.heinzelman.dbmodule.dict.Category;
import pl.heinzelman.dbmodule.dict.CategoryService;

@SpringBootTest
class CategoryTest {

    @Autowired private CategoryService categoryService;

    @Test
    void testToString() {

        String name = "Mlotki";
        Category hammer = new Category(name);
        categoryService.save(hammer);
        Long ID = hammer.getId();
        System.out.println(hammer);

        Long len = categoryService.count();

        Assertions.assertTrue(categoryService.findById(ID).isPresent());
        Assertions.assertTrue(categoryService.existsById(ID));
        Assertions.assertTrue(categoryService.findAllByName(name).isPresent());

    }
}