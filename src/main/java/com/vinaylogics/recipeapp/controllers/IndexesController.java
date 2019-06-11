package com.vinaylogics.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexesController {

    @GetMapping({"","/","/index","/index.html"})
    public String getIndexPage(){
        System.out.println("Some message to say.... 1234!");
        return "index";
    }

}
