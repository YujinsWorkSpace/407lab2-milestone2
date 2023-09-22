package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(int i, int j){
        int result = i + j;
        Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
    }

    public void substraction(int i, int j){
        int result = i - j;
        Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
    }

    public void multiplication(int i, int j){
        int result = i * j;
        Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
    }

    public void division(int i, int j){
        float result = (float) i / (float) j;
        Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
    }

    public void Onclick1(View view){
        EditText num1 = (EditText) findViewById(R.id.firstNum);
        EditText num2 = (EditText) findViewById(R.id.secondNum);
        int firstNum = Integer.parseInt(num1.getText().toString());
        int secondNum = Integer.parseInt(num2.getText().toString());
        addition(firstNum, secondNum);
    }

    public void Onclick2(View view){
        EditText num1 = (EditText) findViewById(R.id.firstNum);
        EditText num2 = (EditText) findViewById(R.id.secondNum);
        int firstNum = Integer.parseInt(num1.getText().toString());
        int secondNum = Integer.parseInt(num2.getText().toString());
        substraction(firstNum, secondNum);
    }

    public void Onclick3(View view){
        EditText num1 = (EditText) findViewById(R.id.firstNum);
        EditText num2 = (EditText) findViewById(R.id.secondNum);
        int firstNum = Integer.parseInt(num1.getText().toString());
        int secondNum = Integer.parseInt(num2.getText().toString());
        multiplication(firstNum, secondNum);
    }

    public void Onclick4(View view){
        EditText num1 = (EditText) findViewById(R.id.firstNum);
        EditText num2 = (EditText) findViewById(R.id.secondNum);
        int firstNum = Integer.parseInt(num1.getText().toString());
        int secondNum = Integer.parseInt(num2.getText().toString());
        division(firstNum, secondNum);
    }
}