package pl.heinzelman.dbmodule.controller;



import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class LoginController {

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String printUser(ModelMap model, Principal principal ) {
        String name = principal.getName();
        model.addAttribute("system", "hello !" + name);
        return "/index";
    }
}
