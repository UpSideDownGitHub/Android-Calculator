package com.example.labsession_2;

import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Calculator
{
    // PUBLIC

    // PRIVATE
    private View currentview;
    private String currentText;

    private DataHandler dataHandler;

    // instruction list
    private List<InputTypes> instructions = new ArrayList<InputTypes>();


    public Calculator(View view)
    {
        currentview = view;
        dataHandler = new DataHandler();
    }

    public void addInstruction(InputTypes type) {
        // some instructions should not be added

        if (type == InputTypes.EQUALS)
        {
            // work out the given sum
            boolean done = dataHandler.calculateInstructions(instructions);
            if (done)
                showAnswer(dataHandler.currentAnswer);
            else
                showError("Syntax Error");
            return;
        }
        else if (type == InputTypes.DEL)
        {
            // remove the last instruction
            dataHandler.removeLast(instructions);
            updateText();
            return;
        }
        else if (type == InputTypes.AC)
        {
            // remove all instructions
            dataHandler.removeAll(instructions);
            updateText();
            return;
        }

        // add the instruction to the list of instructions
        instructions.add(type);

        // update the text to show the new value
        updateText();
    }

    public void showError(String error)
    {
        TextView text = currentview.findViewById(R.id.sum_text);
        text.setText(error);
    }
    public void showAnswer(double value)
    {
        TextView text = currentview.findViewById(R.id.sum_text);
        text.setText("= " + Double.toString(value));
    }

    public void updateText()
    {
        // this function is used to show the text on screen
        String converted = dataHandler.convertToString(instructions);

        TextView text = currentview.findViewById(R.id.sum_text);
        text.setText(converted);
    }
}
