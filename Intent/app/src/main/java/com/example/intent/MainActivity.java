package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_input;
    private Button btn_input;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_input = findViewById(R.id.et_input);
        btn_input = findViewById(R.id.btn_input);

        // When the button is clicked, execute code in btn_input.SetOnClickListener
        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                str = et_input.getText().toString();                                               // Get string and input str
                Intent intent = new Intent(MainActivity.this, SubActivity.class);    // Create intent
                intent.putExtra("str", str);                                                // Put str to intent
                startActivity(intent);                                                             // Move to next Activity, which is SubActivity
            }
        });

        ImageView iv_basic;
        iv_basic = findViewById(R.id.iv_basic);
        iv_basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"토스트 메세지 테스트",Toast.LENGTH_SHORT).show();    // Show toast message "토스트 메세지 테스트"
            }
        });

    }
}