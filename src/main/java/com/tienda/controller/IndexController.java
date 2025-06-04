

package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    @RequestMapping("/") //url al que respone
    public String index() {
        //model.addAttribute("attribute", "value");
        return "index"; // nombre de la vista en template a mostrar
    }
    
    @RequestMapping("/info")
    public String info() {
        //model.addAttribute("attribute", "value");
        return "info";
    }

}
