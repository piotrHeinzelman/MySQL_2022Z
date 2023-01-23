package pl.heinzelman.dbmodule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.heinzelman.dbmodule.dict.*;
import pl.heinzelman.dbmodule.dict2Key.*;

@Controller
public class DataController {

    @Autowired CategoryService categoryService;
    @Autowired IconService iconService;
    @Autowired IconFamilyService iconFamilyService;
    @Autowired InddMasterService inddMasterService;
    @Autowired UnitService unitService;
    @Autowired UnitTypeService unitTypeService;
    @Autowired IconNameService iconNameService;
    @Autowired NameService nameService;
    @Autowired NameShortService nameShortService;
    @Autowired NameLongService nameLongService;

    public DataController(CategoryService categoryService, IconService iconService, IconFamilyService iconFamilyService, InddMasterService inddMasterService, UnitService unitService, UnitTypeService unitTypeService, IconNameService iconNameService, NameService nameService, NameShortService nameShortService, NameLongService nameLongService) {
        this.categoryService = categoryService;
        this.iconService = iconService;
        this.iconFamilyService = iconFamilyService;
        this.inddMasterService = inddMasterService;
        this.unitService = unitService;
        this.unitTypeService = unitTypeService;
        this.iconNameService = iconNameService;
        this.nameService = nameService;
        this.nameShortService = nameShortService;
        this.nameLongService = nameLongService;
    }





}
