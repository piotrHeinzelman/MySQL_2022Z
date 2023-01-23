package pl.heinzelman.dbmodule.dict2Key;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.heinzelman.dbmodule.dict.AbsSimpleDictRepo;
import pl.heinzelman.dbmodule.dict.Category;
import pl.heinzelman.dbmodule.dict.InddMaster;

import java.util.List;

@Repository
public interface IconNameRepo extends AbsDoubleDictRepo<IconName> {

   // @Query( value = "SELECT * from icon_name WHERE id LIKE :str " , nativeQuery = true )
   // public List<IconName> likeByCodeString (@Param("str") String str );
}
