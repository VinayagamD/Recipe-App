package com.vinaylogics.recipeapp.repositories;

import com.vinaylogics.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
