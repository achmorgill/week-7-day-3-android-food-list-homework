package com.codeclan.example.foodlists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class FoodTest {

    Food food;

    @Before
    public void before() {
        food = new Food(1, "Macaroni Cheese",300);
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)1, food.getRanking());

    }

    @Test
    public void getFoodTypeTest() {
        assertEquals("Macaroni Cheese", food.getFoodType());

    }

    @Test
    public void getCalories() {
        assertEquals((Integer)300,food.getCalories());

    }

}