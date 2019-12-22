package com.example.a38_nguyenthaiduong_lap5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter_Type_Of_Food extends BaseAdapter {

    List<Type_Of_Food> typeOfFoodList;

    public Adapter_Type_Of_Food(List<Type_Of_Food> typeOfFoodList) {
        this.typeOfFoodList = typeOfFoodList;
    }

    @Override
    public int getCount() {
        return typeOfFoodList.size();
    }

    @Override
    public Object getItem(int position) {
        return typeOfFoodList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.item_type_of_food, viewGroup, false);
        TextView tvnameoffood = v.findViewById(R.id.tvnameoffood);

        Type_Of_Food typeOfFood = typeOfFoodList.get(position);
        tvnameoffood.setText(typeOfFood.getName());
        return v;
    }
}
