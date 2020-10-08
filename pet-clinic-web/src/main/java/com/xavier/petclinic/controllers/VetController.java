package com.xavier.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/vetsList", "/vets/vetsList.html", "/vetsList.html"})
    public String listVets(){
        return "vets/vetsList";
    }
}
