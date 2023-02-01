package pl.heinzelman.dbmodule.dict2Key;

import org.springframework.stereotype.Repository;

@Repository
public interface IconNameRepo extends AbsDoubleDictRepo<IconName> {

   // @Query( value = "SELECT * from icon_name WHERE id LIKE :str " , nativeQuery = true )
   // public List<IconName> likeByCodeString (@Param("str") String str );
}
