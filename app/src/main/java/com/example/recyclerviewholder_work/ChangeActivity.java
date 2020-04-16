package com.example.recyclerviewholder_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChangeActivity extends AppCompatActivity {

    private EditText editName, editSurname, editGroup, editYearOfBirth, editGrade;
    private Button saveButton;
    private StudentsFullInformation SFI;

    public static final String EXTRA_KEY = "extra_key";
    public static final String KEY = "key";
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        Button saveButton = findViewById(R.id.save_change);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangeActivity.this, Main2Activity.class);
                intent.putExtra(EXTRA_KEY, intent);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

    public void initView() {
        SFI = new StudentsFullInformation();
        editName = findViewById(R.id.change_name);
        editSurname = findViewById(R.id.change_surname);
        editGroup = findViewById(R.id.change_group);
        editYearOfBirth = findViewById(R.id.change_yearOfBirth);
        editGrade = findViewById(R.id.change_grade);
        saveButton = findViewById(R.id.save_change);
    }

    public void getTextEdit() {
        SFI = new StudentsFullInformation();
        SFI.setName(editName.getText().toString());
        SFI.setSurname(editSurname.getText().toString());
        SFI.setGroup(editGroup.getText().toString());
        SFI.setYearOfBirth(editYearOfBirth.getText().toString());
        SFI.setGrade(editGrade.getText().toString());
    }

    public void getText() {
        editName.setText(SFI.getName());
        editSurname.setText(SFI.getSurname());
        editGroup.setText(SFI.getGroup());
        editYearOfBirth.setText(SFI.getYearOfBirth());
        editGroup.setText(SFI.getGroup());
    }

    public void getIntentFromSFI() {
        intent = getIntent();
        SFI = (StudentsFullInformation) intent.getSerializableExtra("result");
        if (SFI != null) {
            getText();
        }
    }
}
