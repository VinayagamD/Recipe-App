package com.vinaylogics.recipeapp.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test for {@link Category}
 */
public class CategoryTest {

    Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * test for method {@link Category#getId()}
     * @throws Exception
     */
    @Test
    public void getId() throws Exception {
        Long idValue = 4l;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    /**
     * test for method {@link Category#getDescription()}
     * @throws Exception
     */
    @Test
    public void getDescription() throws Exception{
    }

    /**
     * test for method {@link Category#getRecipes()}
     * @throws Exception
     */
    @Test
    public void getRecipes() throws Exception{
    }
}