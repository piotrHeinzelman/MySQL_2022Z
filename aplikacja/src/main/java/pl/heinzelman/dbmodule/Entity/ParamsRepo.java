package pl.heinzelman.dbmodule.Entity;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ParamsRepo extends CrudRepository<Params, Long> {


    // " SELECT * FROM view_family ( :codeId , :langId, :issueId )  ORDER BY ord ASC, lparent ASC , tparent ASC , code_id ASC  "
    String sql = "SELECT  INa.lang_name AS name1, S.lang_name AS name2 , W.lang_name AS name3 , P.num_value, U.suffix FROM par_param AS P FULL JOIN [dbo].parn_icon_name AS INa ON ( INa.fk_id = P.id_icon AND INa.id_lang = :langId )   FULL JOIN [dbo].par_unit AS U ON ( U.id = P.id_unit )  FULL JOIN [dbo].parn_word_name AS W ON ( W.fk_id = P.id_word AND W.id_lang = :langId ) FULL JOIN [dbo].parn_string_name AS S ON ( S.fk_id = P.id_strings AND S.id_lang = :langId ) WHERE P.id_code = :codeId ";
    @Query( value = sql , nativeQuery = true ) //ORDER BY code_id ASC
    List<Map<String, Object>> loadParamsByCodeId (@Param("codeId") Long codeId, @Param("langId") Long langId );

}


