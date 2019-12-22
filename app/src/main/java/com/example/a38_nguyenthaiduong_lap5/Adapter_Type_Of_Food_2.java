package com.example.a38_nguyenthaiduong_lap5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter_Type_Of_Food_2 extends BaseAdapter {

    List<Type_Of_Food_2> typeOfFood2List;

    public Adapter_Type_Of_Food_2(List<Type_Of_Food_2> typeOfFood2List) {
        this.typeOfFood2List = typeOfFood2List;
    }

    @Override
    public int getCount() {
        return typeOfFood2List.size();
    }

    @Override
    public Object getItem(int position) {
        return typeOfFood2List.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.item_type_of_food_2, viewGroup, false);

        TextView tvnameoffood2 = v.findViewById(R.id.tvnameoffood2);
        Type_Of_Food_2 typeOfFood2 = typeOfFood2List.get(position);

        tvnameoffood2.setText(typeOfFood2.getName2());
        return v;
    }
}
