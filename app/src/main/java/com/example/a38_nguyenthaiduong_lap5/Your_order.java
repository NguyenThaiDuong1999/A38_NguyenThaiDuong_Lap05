package com.example.a38_nguyenthaiduong_lap5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Your_order extends AppCompatActivity {

    ImageView imgvback;
    ListView lv2;
    TextView tvtotal;
    Intent intent;
    Adapter_Type_Of_Food_2 adapterTypeOfFood2;
    ArrayList<Type_Of_Food_2> type_of_food_2s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_order);

        imgvback = findViewById(R.id.imgvback);
        tvtotal = findViewById(R.id.tvtotal);
        lv2 = findViewById(R.id.lv2);
        type_of_food_2s = new ArrayList<>();

        intent = getIntent();
        String layname = intent.getStringExtra("inputname");

        type_of_food_2s.add(new Type_Of_Food_2(layname));

        imgvback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
