package pl.heinzelman.dbmodule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.heinzelman.dbmodule.dict.*;


@Controller
public class IndexController {

    @Autowired private final UnitService unitService;
    @Autowired private final UnitTypeService unitTypeService;
    @Autowired private final InddMasterService inddMasService;
    @Autowired private final IconService iconS;
    @Autowired private final IconFamilyService iconFamilyS;
    //@Autowired private final IconNameS iconNameS;


    public IndexController(UnitService unitService, UnitTypeService unitTypeService, InddMasterService inddMasService, IconService iconS, IconFamilyService iconFamilyS) {
        this.unitService = unitService;
        this.unitTypeService = unitTypeService;
        this.inddMasService = inddMasService;
        this.iconS = iconS;
        this.iconFamilyS = iconFamilyS;
    }

    @RequestMapping("/index")
    public String indexControl(){
        return "index";
    }

    @RequestMapping("/index/init")
    public String indexInit(){
        UnitType dlugosc = new UnitType("długość");
        unitTypeService.save( dlugosc );

        UnitType mocSilnika = new UnitType("mocSilnika");
        unitTypeService.save( mocSilnika );

        Long dlugID = dlugosc.getId();
        Unit METR = unitService.save(new Unit("metr", dlugID, "m",  1.0));
        unitService.save( new Unit( "kilometr" , dlugID, "km" ,  1000.0 ));
        unitService.save( new Unit( "decymetr" ,dlugID, "dm" ,  0.1 ));
        unitService.save( new Unit( "centymetr" , dlugID, "cm" ,  0.01 ));
        unitService.save( new Unit( "milimetr" ,dlugID, "mm"  ,  0.001 ));

        Long mocID = mocSilnika.getId();
        unitService.save( new Unit( "wat" , mocID, "W" ,  1.0 ));
        unitService.save( new Unit( "kilowat" , mocID, "kW" ,  1000.0 ));

        // JEDNOSTKI WIELOKROTNE
            UnitType polePowierzchni = new UnitType("polePowierzchni");
            unitTypeService.save( polePowierzchni );

            Unit dl_x_szer = new Unit( "metr kwadrat",  dlugID , "m2", 1.0 );
              dl_x_szer.setSeparator("x");
               dl_x_szer.setNext_unit_ID( METR.getId() ) ;
           unitService.save(dl_x_szer);


        inddMasService.save( new InddMaster( "18V SAS" ));
        inddMasService.save( new InddMaster( "dysan" ));

        IconFamily ikonyDlaKosiarek = new IconFamily("ikony dla kosiarek");
        iconFamilyS.save( ikonyDlaKosiarek );

        IconFamily ikonyDlaMlotow = new IconFamily("ikony dla młotów");
        iconFamilyS.save( ikonyDlaMlotow );

        Icon szerKoszenia = new Icon( dlugID , ikonyDlaKosiarek.getId() ); // 11 - on for all
        /*
            MANY-To-MANY
         */
        szerKoszenia.setIsTech( true );
        szerKoszenia.setInCatalog( true );
        szerKoszenia.setInFishTop( true );
        szerKoszenia.setInFishBottom( true );
        szerKoszenia.setInPaper( true );
        iconS.save( szerKoszenia );

        Long LangPL=1L; Long LangEN=3L;
//        iconNameS.save( new IconName( szerKoszenia.getID_icon() , LangPL , "szerokość koszenia" ) );
//        iconNameS.save( new IconName( szerKoszenia.getID_icon() , LangEN , "cutting width" ) );

        return "index";
    }

}
