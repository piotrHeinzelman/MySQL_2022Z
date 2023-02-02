package pl.heinzelman.dbmodule.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.heinzelman.dbmodule.Entity.CommentService;
import pl.heinzelman.dbmodule.Entity.ParamsService;
import pl.heinzelman.dbmodule.Entity.UnitService;
import pl.heinzelman.dbmodule.EntityN.IconNameService;
import pl.heinzelman.dbmodule.EntityN.StringNameService;
import pl.heinzelman.dbmodule.EntityN.UnitNameService;
import pl.heinzelman.dbmodule.EntityN.WordNameService;
import pl.heinzelman.dbmodule.STATIC_CLASS.Code;
import pl.heinzelman.dbmodule.STATIC_CLASS.CodeService;
import pl.heinzelman.dbmodule.newDictClass.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class ParamController {

    @Autowired private final CodeService codeService;
    @Autowired private final IconService iconService;
    @Autowired private final ParamsService paramsService;
    @Autowired private final CommentService commentService;
    @Autowired private final UnitService unitService;

    @Autowired private final IconNameService iconNameService;
    @Autowired private final StringNameService stringNameService;
    @Autowired private final UnitNameService unitNameService;
    @Autowired private final WordNameService wordNameService;

    @Autowired private final DictionaryService dictionaryService;
    @Autowired private final LayoutTargetService layoutTargetService;
    @Autowired private final IconGroupService iconGroupService;
    @Autowired private final MasterService masterService;
    @Autowired private final MeasureService measureService;
    @Autowired private final StringService stringService;
    @Autowired private final WordService wordService;

    public ParamController(CodeService codeService, IconService iconService, ParamsService paramsService, CommentService commentService, UnitService unitService, IconNameService iconNameService, StringNameService stringNameService, UnitNameService unitNameService, WordNameService wordNameService, DictionaryService dictionaryService, LayoutTargetService layoutTargetService, IconGroupService iconGroupService, MasterService masterService, MeasureService measureService, StringService stringService, WordService wordService) {
        this.codeService = codeService;
        this.iconService = iconService;
        this.paramsService = paramsService;
        this.commentService = commentService;
        this.unitService = unitService;
        this.iconNameService = iconNameService;
        this.stringNameService = stringNameService;
        this.unitNameService = unitNameService;
        this.wordNameService = wordNameService;
        this.dictionaryService = dictionaryService;
        this.layoutTargetService = layoutTargetService;
        this.iconGroupService = iconGroupService;
        this.masterService = masterService;
        this.measureService = measureService;
        this.stringService = stringService;
        this.wordService = wordService;
    }



    public List<Map<String, Object>> getIconsByCode( String codeString , Long lang ){

        if ( codeString != null ) { codeString = codeString.trim().toUpperCase(); }
            Optional<Code> OC = codeService.findByCodeString( codeString );
        if ( OC.isPresent() ) {
            Long codeId = OC.get().getCodeId();
            if ( codeId != null ) {
                return paramsService.loadParamsByCodeId( codeId , lang );
            }
        }
        return Collections.emptyList();
    }



}
