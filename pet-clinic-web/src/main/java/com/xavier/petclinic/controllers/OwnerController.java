package com.xavier.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"/find","/","/find owners","/ownersList.html","/search","/Find owners"})
    public String listOfOwners(){
        return "owners/ownersList";
    }
}
