package com.eartar.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/index")
@Controller
public class IndexController {

    @RequestMapping({"", "/", ".html"})
    public String index(){
        return "index";
    }

}
