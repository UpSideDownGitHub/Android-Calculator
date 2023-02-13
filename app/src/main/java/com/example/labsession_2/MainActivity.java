package com.example.labsession_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    public Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator(this.getWindow().getDecorView());
    }

    public void btn_zero(View view)
    {
        calculator.addNumber("0");
    }
    public void btn_one(View view)
    {
        calculator.addNumber("1");    }
    public void btn_two(View view)
    {
        calculator.addNumber("2");    }
    public void btn_three(View view)
    {
        calculator.addNumber("3");    }
    public void btn_four(View view)
    {
        calculator.addNumber("4");    }
    public void btn_five(View view)
    {
        calculator.addNumber("5");    }
    public void btn_six(View view)
    {
        calculator.addNumber("6");    }
    public void btn_seven(View view)
    {
        calculator.addNumber("7");    }
    public void btn_eight(View view)
    {
        calculator.addNumber("8");    }
    public void btn_nine(View view)
    {
        calculator.addNumber("9");    }
    public void btn_plus(View view)
    {
        calculator.addOperator("+");
    }
    public void btn_minus(View view)
    {
        calculator.addOperator("-");
    }
    public void btn_clear(View view)
    {
        calculator.clear();
    }
    public void btn_equals(View view)
    {
        calculator.equals();
    }
}