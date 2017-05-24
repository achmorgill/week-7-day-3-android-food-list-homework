package com.codeclan.example.foodlists;

/**
 * Created by user on 24/05/2017.
 */

public class Food {

    private int ranking;
    private String foodType;
    private int calories;

    public Food(int ranking, String foodType, int calories) {
        this.ranking = ranking;
        this.foodType = foodType;
        this.calories = calories;
    }

    public Integer getRanking() {
        return this.ranking;
    }

    public String getFoodType() {
        return this.foodType;
    }

    public Integer getCalories() {
        return this.calories;
    }
}
