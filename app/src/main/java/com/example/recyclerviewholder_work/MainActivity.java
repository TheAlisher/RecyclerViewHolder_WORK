package com.example.recyclerviewholder_work;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainAdapter adapter = new MainAdapter();
        adapter.activity = this;
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
    }

    public void open2Activity(String SI) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(Main2Activity.TEXT_KEY, SI);
        startActivity(intent);
    }
}
