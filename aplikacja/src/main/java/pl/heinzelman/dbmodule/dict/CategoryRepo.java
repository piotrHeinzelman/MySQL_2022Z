package pl.heinzelman.dbmodule.dict;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends AbsSimpleDictRepo<Category> {

    @Query( value = "SELECT * from category WHERE name LIKE :str " , nativeQuery = true )
    public List<Category> likeByCodeString (@Param("str") String str );

}
