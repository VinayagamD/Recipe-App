package com.vinaylogics.recipeapp.controllers;

import com.vinaylogics.recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeService service;

    public RecipeController(RecipeService service) {
        this.service = service;
    }

    @GetMapping("/show/{id}")
    public String showById(@PathVariable("id") Long id, Model model){
        model.addAttribute("recipe",service.findById(id));
        return "recipe/show";
    }
}
