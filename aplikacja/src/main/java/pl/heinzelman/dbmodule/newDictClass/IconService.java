package pl.heinzelman.dbmodule.newDictClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import pl.heinzelman.dbmodule.EntityN.IconName;
import pl.heinzelman.dbmodule.EntityN.IconNameService;

import java.util.List;
import java.util.Map;

@Service
public class IconService extends SimpleEntService<Icon, IconRepo> {

    @Autowired private IconRepo repo;
    @Autowired private final IconNameService iconNameService;

    public IconService( IconRepo repo, IconNameService iconNameService ) {
        super(repo);
        this.repo = repo;
        this.iconNameService = iconNameService;
    }

    public Icon addIconV( String sys_name , Long id_measure , String name_PL ){
        Icon I = new Icon ( sys_name );
        I.setId_measure( id_measure );
        I = repo.save( I );
            iconNameService.save( new IconName( I.getId() , 1L , name_PL ) );
        return I;
    }

    public Icon addIconD( String sys_name , Long id_dictionary , String name_PL ){
        Icon I = new Icon ( sys_name );
        I.setId_dictionary( id_dictionary );
        I = repo.save( I );
            iconNameService.save( new IconName( I.getId() , 1L , name_PL ) );
        return I;
    }

    public Icon addIconS( String sys_name , String name_PL ){
        Icon I = new Icon ( sys_name );
        I = repo.save( I );
        iconNameService.save( new IconName( I.getId() , 1L , name_PL ) );
        return I;
    }



/*

            @Query( value = " SELECT * FROM view_family ( :codeId , :langId, :issueId )  ORDER BY ord ASC, lparent ASC , tparent ASC , code_id ASC  " , nativeQuery = true ) //ORDER BY code_id ASC
            List<Map<String, Object>> loadProduct (@Param("codeId") Long codeId, @Param("langId") Long langId, @Param("issueId") Long issueId);

 */














    /*
    DECLARE @ICON_rekomendowany_akumulator BIGINT; INSERT INTO [dbo].icon  ( sys_name,id_measure,id_dictionary ) VALUES ( 'rekomendowany_akumulator',NULL,NULL); SET @ICON_rekomendowany_akumulator = SCOPE_IDENTITY();
        INSERT INTO [dbo].icon_name (id_icon , id_lang , layout_name) VALUES ( @ICON_rekomendowany_akumulator , 1, 'rekomendowany akumulator');
     */



}


/*

-- ICON
DECLARE @ICON_srednica_tarczy BIGINT; INSERT INTO [dbo].icon ( sys_name,id_measure,id_dictionary )  VALUES ( 'srednica tarczy', @measure_dlugosc,NULL ); SET @ICON_srednica_tarczy = SCOPE_IDENTITY();
                                INSERT INTO [dbo].icon_name (id_icon , id_lang , layout_name) VALUES ( @ICON_srednica_tarczy , 1, 'średnica tarczy');

DECLARE @ICON_srednica_otworu BIGINT; INSERT INTO [dbo].icon ( sys_name,id_measure,id_dictionary )  VALUES ( 'srednica otworu', @measure_dlugosc,NULL ); SET @ICON_srednica_otworu = SCOPE_IDENTITY();
                                INSERT INTO [dbo].icon_name (id_icon , id_lang , layout_name) VALUES ( @ICON_srednica_otworu , 1, 'średnica otworu');

DECLARE @ICON_do_ciecta_materialu BIGINT; INSERT INTO [dbo].icon ( sys_name,id_measure,id_dictionary ) VALUES ( 'do ciecia materialu [dict]', NULL, @DICT_przeznaczenie_ciecie_plytki  ); SET @ICON_do_ciecta_materialu = SCOPE_IDENTITY();
                                INSERT INTO [dbo].icon_name (id_icon , id_lang , layout_name) VALUES ( @ICON_do_ciecta_materialu , 1, 'materiał');

DECLARE @ICON_rekomendowany_akumulator BIGINT; INSERT INTO [dbo].icon  ( sys_name,id_measure,id_dictionary ) VALUES ( 'rekomendowany_akumulator',NULL,NULL); SET @ICON_rekomendowany_akumulator = SCOPE_IDENTITY();
                                INSERT INTO [dbo].icon_name (id_icon , id_lang , layout_name) VALUES ( @ICON_rekomendowany_akumulator , 1, 'rekomendowany akumulator');

 */