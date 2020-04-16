package com.example.recyclerviewholder_work;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements onClick {

    private static final int REQUEST_KOD = 15;

    private StudentsFullInformation SFI;
    private int position;
    private MainAdapter adapter;
    private ArrayList<StudentsFullInformation> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainAdapter adapter = new MainAdapter();
        adapter.onClick = this;
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
    }

    public void open2Activity(String SI) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(Main2Activity.TEXT_KEY, SI);
        startActivity(intent);
    }

    @Override
    public void click(int position, StudentsFullInformation studentsFullInformation) {
        list.remove(position);
        Intent intent = new Intent(this, ChangeActivity.class);
        startActivityForResult(intent, REQUEST_KOD);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_KOD) {
            if (resultCode == RESULT_OK && data != null) {
                SFI = (StudentsFullInformation) data.getSerializableExtra(ChangeActivity.EXTRA_KEY);
                list.add(position, SFI);
                adapter.update(list);
                adapter.notifyDataSetChanged();
            }
        }
    }
}
