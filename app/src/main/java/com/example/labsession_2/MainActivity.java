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
    public void btn_zero(View view) { calculator.addInstruction(InputTypes.ZERO); }
    public void btn_point(View view) { calculator.addInstruction(InputTypes.POINT); }
    public void btn_root(View view) { /*calculator.addInstruction(InputTypes.ROOT); */}
    public void btn_ans(View view) { calculator.addInstruction(InputTypes.ANS); }
    public void btn_equals(View view) { calculator.addInstruction(InputTypes.EQUALS); }

    // LINE 2
    public void btn_one(View view) { calculator.addInstruction(InputTypes.ONE); }
    public void btn_two(View view) { calculator.addInstruction(InputTypes.TWO); }
    public void btn_three(View view) { calculator.addInstruction(InputTypes.THREE); }
    public void btn_plus(View view) { calculator.addInstruction(InputTypes.PLUS); }
    public void btn_minus(View view) { calculator.addInstruction(InputTypes.MINUS); }

    // LINE 3
    public void btn_four(View view) { calculator.addInstruction(InputTypes.FOUR); }
    public void btn_five(View view) { calculator.addInstruction(InputTypes.FIVE); }
    public void btn_six(View view) { calculator.addInstruction(InputTypes.SIX); }
    public void btn_multiply(View view) { calculator.addInstruction(InputTypes.MULTIPLY); }
    public void btn_divide(View view) { calculator.addInstruction(InputTypes.DIVIDE); }

    // LINE 4
    public void btn_seven(View view) { calculator.addInstruction(InputTypes.SEVEN); }
    public void btn_eight(View view) { calculator.addInstruction(InputTypes.EIGHT); }
    public void btn_nine(View view) { calculator.addInstruction(InputTypes.NINE); }
    public void btn_del(View view) { calculator.addInstruction(InputTypes.DEL); }
    public void btn_ac(View view) { calculator.addInstruction(InputTypes.AC); }
}