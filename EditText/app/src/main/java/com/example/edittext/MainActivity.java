package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_id = findViewById(R.id.et_id);
        btn_input = findViewById(R.id.btn_input);

        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et_id.setText("버튼을 누르면 나오는 문자");
            }
        });
    }
}