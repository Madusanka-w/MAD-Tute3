package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText tx_nOne;
    EditText tx_nTwo;
    TextView tv_display;
    Button btn_sub;
    Button btn_add;
    Button btn_div;
    Button btn_mul;

    String number1;
    String number2;

    float number_1;
    float number_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tx_nOne = findViewById(R.id.tx_nOne);
        tx_nTwo = findViewById(R.id.tx_nTwo);
        tv_display = findViewById(R.id.tv_display);
        btn_add = findViewById(R.id.btn_add);
        btn_sub =findViewById(R.id.btn_sub);
        btn_div = findViewById(R.id.btn_div);
        btn_mul = findViewById(R.id.btn_mul);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");
        
        tx_nOne.setText(number1);
        tx_nTwo.setText(number2);

        number_1 = Float.parseFloat(number1);
        number_2 = Float.parseFloat(number2);
        
    }
    public void Add(View view){
        Float add = number_1 + number_2;
        String addString = new Float(add).toString();
        tv_display.setText(number1+"+"+number2+" = "+addString);
    }
    public void onClickSubtrack(View view){
        Float sub = number_1 - number_2;
        String subString = new Float(sub).toString();
        tv_display.setText(number1 + "-" + number2 + " = "+ subString);
    }
    public void onClickMultiple(View view){
        Float multi = number_1 * number_2;
        String multiString = new Float(multi).toString();
        tv_display.setText(number1 + "-" + number2 + " = "+ multiString);
    }
    public void onClickDivide(View view){
        Float divide = number_1 / number_2;
        String divideString = new Float(divide).toString();
        tv_display.setText(number1 + "-" + number2 + " = "+ divideString);
    }
}