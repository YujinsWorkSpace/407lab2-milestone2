package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(String s){
        Intent intent = new Intent(this, ResultDisplay.class);
        intent.putExtra("message", s);
        startActivity(intent);

    }
    public String addition(int i, int j){
        int result = i + j;
        String s = Integer.toString(result);
       // goToActivity(s);
       // Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
        return s;
    }

    public String substraction(int i, int j){
        int result = i - j;
        String s = Integer.toString(result);
        //goToActivity(s);
        //Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
        return s;
    }

    public String  multiplication(int i, int j){
        int result = i * j;
        String s = Integer.toString(result);
        //goToActivity(s);
        //Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
        return s;
    }

    public String division(int i, int j){
        float result = (float) i / (float) j;
        String s = Float.toString(result);
        //goToActivity(s);
        //Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
        return s;
    }

    public void Onclick1(View view){
        EditText num1 = (EditText) findViewById(R.id.firstNum);
        EditText num2 = (EditText) findViewById(R.id.secondNum);
        if(num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }
        int firstNum = Integer.parseInt(num1.getText().toString());
        int secondNum = Integer.parseInt(num2.getText().toString());
        String result = addition(firstNum, secondNum);
        goToActivity(result);
    }

    public void Onclick2(View view){
        EditText num1 = (EditText) findViewById(R.id.firstNum);
        EditText num2 = (EditText) findViewById(R.id.secondNum);
        if(num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }
        int firstNum = Integer.parseInt(num1.getText().toString());
        int secondNum = Integer.parseInt(num2.getText().toString());
        String s = substraction(firstNum, secondNum);
        goToActivity(s);
    }

    public void Onclick3(View view){
        EditText num1 = (EditText) findViewById(R.id.firstNum);
        EditText num2 = (EditText) findViewById(R.id.secondNum);
        if(num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }
        int firstNum = Integer.parseInt(num1.getText().toString());
        int secondNum = Integer.parseInt(num2.getText().toString());
        String s = multiplication(firstNum, secondNum);
        goToActivity(s);
    }

    public void Onclick4(View view){
        EditText num1 = (EditText) findViewById(R.id.firstNum);
        EditText num2 = (EditText) findViewById(R.id.secondNum);
        if(num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }
        int firstNum = Integer.parseInt(num1.getText().toString());
        int secondNum = Integer.parseInt(num2.getText().toString());
        if (secondNum == 0){
            Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
            return;
        }
        String s = division(firstNum, secondNum);
        goToActivity(s);
    }
}