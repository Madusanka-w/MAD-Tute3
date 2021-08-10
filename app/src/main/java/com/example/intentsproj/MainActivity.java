package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

            setContentView(R.layout.activity_main);
            //Creating the LayoutInflater instance
            LayoutInflater li = getLayoutInflater();
            //Getting the View object as defined in the customtoast.xml file
            View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                    findViewById(R.id.custom_toast_layout));
            //Creating the Toast object
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setView(layout);//setting the view of custom toast layout
            toast.show();


    }

    public void onClick(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("n1",tx_num1.getText().toString());
        intent.putExtra("n2",tx_num2.getText().toString());
        startActivity(intent);
    }

}