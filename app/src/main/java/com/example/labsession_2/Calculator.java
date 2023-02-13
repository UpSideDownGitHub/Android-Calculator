package com.example.labsession_2;

import android.animation.IntArrayEvaluator;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.security.spec.ECField;

public class Calculator
{
    private String num1;
    private String num2;
    private String operator;
    private boolean hadOperator;
    private boolean equalsPressed;

    private String currentText;

    public View currentview;

    public Calculator(View view)
    {
        currentview = view;
        clear();
    }

    public void updateCurrentText()
    {
        currentText = "";
        if (!num1.isEmpty()) {
            currentText += num1;
            if (!operator.isEmpty()) {
                currentText += operator;
                if (!num2.isEmpty())
                    currentText += num2;
            }
        }

        TextView sumLine = currentview.findViewById(R.id.sum_text);
        sumLine.setText(currentText);
    }
    public void showFinalCalculation()
    {
        equalsPressed = true;
        TextView sumLine = currentview.findViewById(R.id.sum_text);
        sumLine.setText(currentText);
    }

    public void addNumber(String sentNumber)
    {
        if (hadOperator)
            num2 += sentNumber;
        else
            num1 += sentNumber;

        updateCurrentText();
    }

    public void addOperator(String sentOperator)
    {
        if (hadOperator || num1.isEmpty())
            return;
        operator = sentOperator;
        updateCurrentText();
        hadOperator = true;
    }

    public void equals()
    {
        if (num1.isEmpty() || num2.isEmpty() || !hadOperator)
            return;

        long prefix = 0;
        long postfix = 0;
        try
        {
            prefix = Long.parseLong(num1);
            postfix = Long.parseLong(num2);
        }
        catch (Exception e)
        {
            clear();
            currentText = "ERROR TO LONG";
            showFinalCalculation();
            return;
        }

        long output = 0;
        if (operator.compareTo("+") == 0)
        {
            output = prefix + postfix;
        }
        else
        {
            output = prefix - postfix;
        }

        clear();
        currentText = "= " + output;
        showFinalCalculation();
    }
    public void clear()
    {
        hadOperator = false;
        currentText = "";
        num1 = "";
        num2 = "";
        operator = "";
        updateCurrentText();
    }
}
