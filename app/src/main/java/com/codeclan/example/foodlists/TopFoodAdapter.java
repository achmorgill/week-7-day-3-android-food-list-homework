package com.codeclan.example.foodlists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 24/05/2017.
 */

public class TopFoodAdapter extends ArrayAdapter<Food> {


    public TopFoodAdapter(Context context, ArrayList<Food> food) {
        super(context, 0, food);
    }

    @Override
    public View getView(int position,View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.food_item, parent, false);
        }
        Food currentFood = getItem(position);
        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentFood.getRanking().toString());

        TextView foodType = (TextView) listItemView.findViewById(R.id.food_type);
        foodType.setText(currentFood.getFoodType().toString());

        TextView calories = (TextView) listItemView.findViewById(R.id.calories);
        calories.setText(currentFood.getCalories().toString());

        listItemView.setTag(currentFood);
        return listItemView;
    }

}

