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


    /*
    *
    *    BELOW IS ALL OF THE FUNCTIONS FOR THE BUTTONS
    *    ALL THEY DO IS ADD THE FUNCTION TO THE FUNCTION STRING
    *
    */

    // LINE 1
    public void btn_zero(View view) { calculator.addInstruction("0"); }
    public void btn_point(View view) { calculator.addInstruction("."); }
    public void btn_root(View view) { calculator.addInstruction("√"); }
    public void btn_ans(View view) { calculator.addInstruction("A"); }
    public void btn_equals(View view) { calculator.addInstruction("="); }

    // LINE 2
    public void btn_one(View view) { calculator.addInstruction("1"); }
    public void btn_two(View view) { calculator.addInstruction("2"); }
    public void btn_three(View view) { calculator.addInstruction("3"); }
    public void btn_plus(View view) { calculator.addInstruction("+"); }
    public void btn_minus(View view) { calculator.addInstruction("-"); }

    // LINE 3
    public void btn_four(View view) { calculator.addInstruction("4"); }
    public void btn_five(View view) { calculator.addInstruction("5"); }
    public void btn_six(View view) { calculator.addInstruction("6"); }
    public void btn_mulitply(View view) { calculator.addInstruction("x"); }
    public void btn_divide(View view) { calculator.addInstruction("÷"); }

    // LINE 4
    public void btn_seven(View view) { calculator.addInstruction("7"); }
    public void btn_eight(View view) { calculator.addInstruction("8"); }
    public void btn_nine(View view) { calculator.addInstruction("9"); }
    public void btn_del(View view) { calculator.addInstruction("D"); }
    public void btn_ac(View view) { calculator.addInstruction("C"); }
}