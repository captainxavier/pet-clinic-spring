package com.xavier.petclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(Model model){
        Map<String,String> test1 = new HashMap<String, String>();
        test1.put("1","2");
        test1.put("3","4");
        test1.put("5","6");
        test1.put("7","8");
        model.addAttribute("tests",test1);
        String ans = "Testinf";
        return "index";
    }
}
