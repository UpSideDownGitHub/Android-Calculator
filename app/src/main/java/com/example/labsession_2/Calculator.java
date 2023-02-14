package com.example.labsession_2;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator
{
    // PUBLIC

    // PRIVATE
    private View currentview;
    private Adapter recylerAdapter;
    private String currentText;

    private DataHandler dataHandler;

    // instruction list
    private List<InputTypes> instructions = new ArrayList<InputTypes>();

    public Calculator(View view, Adapter adapter)
    {
        recylerAdapter = adapter;
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
        dataHandler.removeAll(instructions);
    }
    public void showAnswer(double value)
    {
        TextView text = currentview.findViewById(R.id.sum_text);
        // CHANGE THIS LINE TO SET IT TO THE DEFAULT VALUE
        text.setText(R.string.calc_default);
        dataHandler.removeAll(instructions);

        // need to add this answer to the list of answers then show the next the default text of the thing
        recylerAdapter.addValue("= " + Double.toString(value));
    }

    public void updateText()
    {
        // this function is used to show the text on screen
        String converted = dataHandler.convertToString(instructions);

        TextView text = currentview.findViewById(R.id.sum_text);
        text.setText(converted);
    }
}
