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

        String name="Młotki";
        Category hammer = new Category( name );
            categoryService.save( hammer );
        Long ID=hammer.getId();

        Long len = categoryService.count();
// [ OK ]     System.out.println(  );
// [ OK ]     System.out.println( categoryService.findById( ID ));
// [ OK ]     System.out.println( categoryService.existsById( ID ));
// [ OK ]     System.out.println( categoryService.findAllByName( name ));
// [ OK ]     System.out.println( categoryService.existsByNameAndActiveTrue( name ));
// [ OK ]    System.out.println( categoryService.findAll());

        Assertions.assertTrue(  categoryService.findById( ID ).isPresent()  );
        Assertions.assertTrue(  categoryService.existsById( ID )  );
        Assertions.assertTrue(  categoryService.findAllByName( name ).isPresent());
        Assertions.assertTrue(  categoryService.existsByNameAndActiveTrue( name )  );

        hammer.setActive( false );
        categoryService.save( hammer );

        Assertions.assertTrue( len-1== categoryService.count() );
        Assertions.assertTrue(  categoryService.findById( ID ).isEmpty()  );
        Assertions.assertFalse(  categoryService.existsById( ID )   );
        Assertions.assertTrue(  categoryService.findAllByName( name ).isEmpty() );
        Assertions.assertFalse(  categoryService.existsByNameAndActiveTrue( name )  );

    }
}