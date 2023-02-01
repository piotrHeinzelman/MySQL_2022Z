package pl.heinzelman.dbmodule.STATIC_CLASS;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface LangRepo extends AbstractDictRepo<Lang> {



     final String sql1 = "" +
            "\n" +
            "    CREATE OR ALTER  FUNCTION codes_family ( @codeId BIGINT )\n" +
            "    RETURNS TABLE\n" +
            "    AS\n" +
            "    RETURN\n" +
            "            (\n" +
            "\n" +
            "                    SELECT\n" +
            "                            CO.code_id AS code_id,\n" +
            "                    NULL AS tparent,\n" +
            "\t   null AS lparent,\n" +
            "\t   null AS ord\n" +
            "\t   FROM code AS CO WHERE CO.code_id = @codeId\n" +
            "\n" +
            "               UNION\n" +
            "                            SELECT\n" +
            "                            CT.children_id AS code_id,\n" +
            "                    CT.parent_id AS tparent,\n" +
            "\t   null AS lparent,\n" +
            "\t   CT.item_order AS ord\n" +
            "\t   FROM children_in_table AS CT WHERE CT.parent_id = @codeId\n" +
            "               UNION\n" +
            "                            SELECT\n" +
            "                            CI.children_id AS code_id,\n" +
            "                    NULL AS tparent,\n" +
            "                    CI.parent_id AS lparent,\n" +
            "\t   CI.item_order AS ord\n" +
            "\t   FROM children_inline AS CI WHERE CI.parent_id = @codeId\n" +
            "\n" +
            "            );\n" +
            "  " ;


     final String sql2 = "" +
            "\n" +
            "CREATE OR ALTER  FUNCTION view_family ( @codeId BIGINT , @langId BIGINT , @issueId BIGINT )\n" +
            "RETURNS TABLE\n" +
            "AS\n" +
            "RETURN \n" +
            "(\n" +
            "\n" +
            "SELECT \n" +
            "\t\tCO.code_string AS code,\n" +
            "\t\tCO.code_id AS code_id,\n" +
            "\t\tCO.ean AS ean,\n" +
            "\n" +
            "\t\tCL.ord AS ord,\n" +
            "\t\tCL.lparent AS lparent,\n" +
            "\t\tCL.tparent AS tparent,\n" +
            "\t\t@langId AS langCode,\n" +
            "\t\t@issueId AS issueId,\n" +
            "\n" +
            "\t\tN.indd_name AS indd_name,\n" +
            "\t\tN.indd_description  AS indd_description,\n" +
            "\t\tN.name_in_table AS name_in_table,\n" +
            "\t\tN.indd_inline_description AS descriptionInline,\n" +
            "\t\tN.table_header AS table_header,\n" +
            "\n" +
            "\t\tEN.name_simple AS name,\n" +
            "\t\tEN.description_simple AS description,\n" +
            "\t\tEN.description_long AS description_long,\n" +
            "\t\tEN.description_marketing AS description_marketing,\n" +
            "\n" +
            "\t\tP.hurt AS hurt,\n" +
            "\t\tP.promo AS promo,\n" +
            "\t\tP.price AS [second]\n" +
            "\n" +
            " \t \n" +
            "\t   FROM codes_family ( @codeId ) AS CL\n" +
            "\t   LEFT JOIN code AS CO ON ( CO.code_id = CL.code_id )\n" +
            "\t   LEFT JOIN indd_names AS N ON ( N.code_id = CL.code_id AND N.lang_id=@langId )\n" +
            "\t   LEFT JOIN exact_names AS EN ON ( EN.code_id = CL.code_id AND EN.lang_id=@langId )\n" +
            "\t   LEFT JOIN prices AS P ON ( P.code_id = CL.code_id AND P.lang_id=@langId AND P.issue_id = @issueId  )\n" +
            "\n" +
            "\n" +
            "\n" +
            ");\n" +
            "" +
            "";

            @Query( value = sql1 , nativeQuery = true )
            void init1 ();

            @Query( value = sql2 , nativeQuery = true )
            void init2 ();

            @Query( value = " SELECT * FROM view_family ( :codeId , :langId, :issueId )  ORDER BY ord ASC, lparent ASC , tparent ASC , code_id ASC  " , nativeQuery = true ) //ORDER BY code_id ASC
            List<Map<String, Object>> loadProduct (@Param("codeId") Long codeId, @Param("langId") Long langId, @Param("issueId") Long issueId);






}
