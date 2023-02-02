package pl.heinzelman.dbmodule.Entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.heinzelman.dbmodule.Controller.ParamController;
import pl.heinzelman.dbmodule.STATIC_CLASS.Code;
import pl.heinzelman.dbmodule.STATIC_CLASS.CodeService;
import pl.heinzelman.dbmodule.newDictClass.*;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ParamsServiceTest {

    @Autowired private ParamsService paramsService;
    @Autowired private ParamController paramController;
    @Autowired private CodeService codeService;
    @Autowired private CommentService commentService;
    @Autowired private MeasureService measureService;
    @Autowired private UnitService unitService;
    @Autowired private DictionaryService dictionaryService;
    @Autowired private WordService wordService;
    @Autowired private StringService stringService;
    @Autowired private IconService iconService;

    @Test
    void save() {

        String nme =  "DED6900";
        Code C = codeService.findByCodeString( nme ).orElse(new Code( nme ));

        commentService.addComment( C.getCodeId(), "dodaję wpis !" );

        Measure measure_dlugosc = measureService.addMeasure("dlugosc");
        unitService.addUnit( "kilometr",    measure_dlugosc.getId() , "km" , 1000.0 );
        unitService.addUnit( "metr",    measure_dlugosc.getId() , "m" , 1.0 );
        unitService.addUnit( "decymetr",    measure_dlugosc.getId() , "dm" , 0.1 );
        unitService.addUnit( "centymetr",    measure_dlugosc.getId() , "cm" , 0.01 );
        Unit unit_mm = unitService.addUnit("milimetr", measure_dlugosc.getId(), "mm", 0.001);

        Dictionary DICT_przeznaczenie_ciecie_plytki = dictionaryService.addDictionary("przeznaczenie : ciecie płytki");

        wordService.addWord(  DICT_przeznaczenie_ciecie_plytki.getId(), "glazura" );
        wordService.addWord(  DICT_przeznaczenie_ciecie_plytki.getId(), "gres" );
        Word word_glazura_i_gres = wordService.addWord(DICT_przeznaczenie_ciecie_plytki.getId(), "glazura i gres");


        Strings akumulator = stringService.addString("DED7034, DED7035, DED6936, DED6937");

        Icon icon_srednica_tarczy = iconService.addIconV("srednica tarczy", measure_dlugosc.getId(), "średnica tarczy");
        Icon icon_srednica_otworu = iconService.addIconV("srednica otworu", measure_dlugosc.getId(), "średnica otworu");
        Icon icon_materiał = iconService.addIconD("do ciecia materialu [dict]", DICT_przeznaczenie_ciecie_plytki.getId(), "materiał");
        Icon icon_akumulator = iconService.addIconS("rekomendowany_akumulator", "rekomendowany akumulator");

        paramsService.addParamV ( C.getCodeId(), icon_srednica_tarczy.getId(), unit_mm.getId(), 110.0 );
        paramsService.addParamV ( C.getCodeId(), icon_srednica_otworu.getId(), unit_mm.getId(), 22.2 );
        paramsService.addParamD ( C.getCodeId(), icon_materiał.getId(), word_glazura_i_gres.getId() );
        paramsService.addParamS ( C.getCodeId(), icon_akumulator.getId(), akumulator.getId() );

        StringBuffer out = new StringBuffer("");
        List<Map<String, Object>> lst = paramController.getIconsByCode(nme, 1L);
        for ( Map<String, Object> m : lst ) {
                out.append("\r\n");
            for ( String K : m.keySet() ) {
                out.append( "<" + K + " : " +  m.get( K ) + ">" );
            }
        }
        System.out.println( out.toString() );
    }
}

