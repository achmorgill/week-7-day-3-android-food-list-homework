package com.codeclan.example.foodlists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_list);

        TopFood topFood = new TopFood();
        ArrayList<Food> list = topFood.getList();
        TopFoodAdapter foodAdapter = new TopFoodAdapter(this, list);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(foodAdapter);
    }

    public void getFood(View listItem) {
        Food food = (Food) listItem.getTag();
        Log.d("Food title:", food.getFoodType());
    }
}

