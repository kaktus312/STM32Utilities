package com.example.stm32utilities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view){
//        Toast.makeText(this, "Зачем вы нажали?", Toast.LENGTH_SHORT).show();

        TextView id = (TextView) findViewById(R.id.editTextNumber);
        CharSequence idVal = id.getText();
        long decimalId = Integer.parseInt(String.valueOf(idVal), 16);
//        System.out.println(decimalId);
        MultiAutoCompleteTextView res = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
        res.setText(Long.toBinaryString(decimalId));

        TextView mask = (TextView) findViewById(R.id.editTextNumber2);
//        int decimalMask = Integer.decode((String) mask.getText());
//        System.out.println(decimalMask);
        mask.setText(String.valueOf(decimalId));

    }
}