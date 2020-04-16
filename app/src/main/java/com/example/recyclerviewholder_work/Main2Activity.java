package com.example.recyclerviewholder_work;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public static String TEXT_KEY = "text_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameView = findViewById(R.id.name);
        TextView surnameView = findViewById(R.id.surname);
        TextView groupView = findViewById(R.id.group);


    }
}
