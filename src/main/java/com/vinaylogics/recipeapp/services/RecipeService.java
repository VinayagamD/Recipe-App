package com.vinaylogics.recipeapp.services;

import com.vinaylogics.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);
}
