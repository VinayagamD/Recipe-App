package com.vinaylogics.recipeapp.controllers;

import com.vinaylogics.recipeapp.services.RecipeService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.Mockito.*;

/**
 * Test for class {@link IndexesController}
 */
public class IndexesControllerTest {

    @Mock
    RecipeService recipeService;
    @Mock
    Model model;


    IndexesController indexesController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        indexesController = new IndexesController(recipeService);
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * test for method {@link IndexesController#getIndexPage(Model)}
     */
    @Test
    public void getIndexPage() {
        String viewName = indexesController.getIndexPage(model);
        assertEquals("index",viewName);
        verify(recipeService, times(1)).getRecipes();
        verify(model,times(1)).addAttribute(eq("recipes"),anySet());
    }
}