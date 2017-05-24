package com.codeclan.example.foodlists;

import java.util.ArrayList;

/**
 * Created by user on 24/05/2017.
 */

public class TopFood {

    private ArrayList<Food> list;

    public TopFood() {
        list = new ArrayList<Food>();
        list.add(new Food(1, "Macaroni Cheese and Sweetcorn", 350));
        list.add(new Food(2, "Vegetable Broth", 150));
        list.add(new Food(3, "Haggis Neeps and Tatties", 500));
        list.add(new Food(4, "Tattie Soup", 250));
        list.add(new Food(5, "Lasagna", 560));
        list.add(new Food(6, "Chicken Curry", 790));
        list.add(new Food(7, "Chicken and Sweetcorn Soup", 340));
        list.add(new Food(8, "Chips with Melted Cheese", 400));
        list.add(new Food(9, "Spaghetti Bolognese", 500));
        list.add(new Food(10, "Chicken and pineapple pizza", 1200));
        list.add(new Food(11, "Pulled Pork and boiled rice", 650));
        list.add(new Food(12, "Sunshine Toast", 400));
        list.add(new Food(13, "Steak with Peppercorn sauce", 860));
        list.add(new Food(14, "Toasted sandwich", 500));
        list.add(new Food(15, "Chicken risotto", 700));
        list.add(new Food(16, "Bacon Sandwich", 540));
        list.add(new Food(17, "Banana pancakes", 200));
        list.add(new Food(18, "Chocolate pudding", 400));
        list.add(new Food(19, "Fruit crumble", 500));
        list.add(new Food(20, "Beans on toast", 450));
    }

    public ArrayList<Food> getList() {
        return new ArrayList<Food>(list);
    }

}
