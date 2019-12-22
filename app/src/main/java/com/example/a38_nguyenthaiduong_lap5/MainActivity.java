package com.example.a38_nguyenthaiduong_lap5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView imgvshopping;
    TextView tvdemsp;
    ListView lv;
    TextView tvtotalprice;
    Button btnorder;
    TextView tvfeedback;
    Intent intent;
    Adapter_Type_Of_Food adapterTypeOfFood;
    ArrayList<Type_Of_Food> type_of_foods;
    Type_Of_Food typeOfFood1, typeOfFood2, typeOfFood3, typeOfFood4;
    String name;
    int demsp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgvshopping = findViewById(R.id.imgvshopping);
        tvdemsp = findViewById(R.id.tvdemsp);
        tvtotalprice = findViewById(R.id.tvtotalprice);
        btnorder = findViewById(R.id.btnorder);
        tvfeedback = findViewById(R.id.tvfeedback);
        lv = findViewById(R.id.lv);
        type_of_foods = new ArrayList<>();

        typeOfFood1 = new Type_Of_Food("Pizza Panda");
        typeOfFood2 = new Type_Of_Food("KFC Super");
        typeOfFood3 = new Type_Of_Food("Bread Eggs");
        typeOfFood4 = new Type_Of_Food("Coca Cola");

        type_of_foods.add(typeOfFood1);
        type_of_foods.add(typeOfFood2);
        type_of_foods.add(typeOfFood3);
        type_of_foods.add(typeOfFood4);

        adapterTypeOfFood = new Adapter_Type_Of_Food(type_of_foods);
        lv.setAdapter(adapterTypeOfFood);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                name = type_of_foods.get(position).getName();
                demsp = demsp + 1;
                String demsp1 = String.valueOf(demsp);
                tvdemsp.setText(demsp1);
                tvtotalprice.setText("$10");
            }
        });

        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(demsp>0){
                    tvfeedback.setText("Thank you! Your order is sent to restaurant");
                }
                else{
                    tvfeedback.setText("Choose a type of food.Please!");
                }
            }
        });

        imgvshopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getBaseContext(), Your_order.class);
                intent.putExtra("inputname", name);
                startActivity(intent);
            }
        });
    }
}
