package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tx_num1;
    EditText tx_num2;
    Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx_num1 = findViewById(R.id.tx_one);
        tx_num2 = findViewById(R.id.tx_two);
        btn_ok = findViewById(R.id.btn_ok);

    }

    public void onClick(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("n1",tx_num1.getText().toString());
        intent.putExtra("n2",tx_num2.getText().toString());
        startActivity(intent);
    }

}