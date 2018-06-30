package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int point = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit (View view){

        //get the text from EditText and passes to String
        EditText namefield = (EditText)findViewById(R.id.namefield);
        String names = namefield.getText().toString();

        RadioButton one = (RadioButton) findViewById(R.id.test);
        boolean ones = one.isChecked();


        RadioButton two = (RadioButton) findViewById(R.id.test2);
        boolean twos = two.isChecked();

        // quiz 2

        RadioButton three = (RadioButton) findViewById(R.id.test3);
        boolean threes = three.isChecked();

        RadioButton four = (RadioButton) findViewById(R.id.test4);
        boolean fours = four.isChecked();

        RadioButton five = (RadioButton) findViewById(R.id.test5);
        boolean fives = five.isChecked();

        // quiz 3

        RadioButton six = (RadioButton) findViewById(R.id.test6);
        boolean sixs = six.isChecked();

        RadioButton seven = (RadioButton) findViewById(R.id.test7);
        boolean sevens = seven.isChecked();

        RadioButton eight = (RadioButton) findViewById(R.id.test8);
        boolean eights = eight.isChecked();

        // quiz 4
        RadioButton nine = (RadioButton) findViewById(R.id.test9);
        boolean nines = nine.isChecked();

        RadioButton ten = (RadioButton) findViewById(R.id.test10);
        boolean tens = ten.isChecked();

        RadioButton eleven = (RadioButton) findViewById(R.id.test11);
        boolean elevens = eleven.isChecked();

        // quiz 5
        RadioButton twe = (RadioButton) findViewById(R.id.test12);
        boolean twes = twe.isChecked();

        RadioButton thir = (RadioButton) findViewById(R.id.test13);
        boolean thirs = thir.isChecked();

        RadioButton fourt = (RadioButton) findViewById(R.id.test14);
        boolean fourts = fourt.isChecked();

        // quiz 6
        RadioButton fift = (RadioButton) findViewById(R.id.test15);
        boolean fifts = fift.isChecked();

        RadioButton sixt = (RadioButton) findViewById(R.id.test16);
        boolean sixts = sixt.isChecked();

        // quiz 7
        RadioButton sevt = (RadioButton) findViewById(R.id.test12);
        boolean sevts = sevt.isChecked();

        RadioButton eightn = (RadioButton) findViewById(R.id.test13);
        boolean eightns =eightn.isChecked();

        RadioButton nint = (RadioButton) findViewById(R.id.test14);
        boolean nints = nint.isChecked();



        int points = calculateScore (ones, twos, threes, fours, fives, sixs, sevens, eights, nines, tens, elevens, twes, thirs, fourts, fifts, sixts, sevts, eightns, nints);

        String priceMessage = createOrderSummary(points, ones, names);

        if( names.isEmpty()){
            Toast.makeText(this, " Your name Please", Toast.LENGTH_SHORT).show();
        }



        displayMessage(priceMessage);

        if (points >= 5){
            Toast.makeText(this, " Excellent", Toast.LENGTH_SHORT).show();

        } else{
            Toast.makeText(this, " You know you can do it, just one more try", Toast.LENGTH_SHORT).show();
            return;
        }

    }

    private int calculateScore(boolean ones, boolean twos, boolean threes, boolean fours, boolean fives, boolean sixs, boolean sevens, boolean eights, boolean nines, boolean tens, boolean elevens,  boolean twes,  boolean thirs,  boolean fourts,  boolean fifts,  boolean sixts, boolean sevts, boolean eightns, boolean nints){
        int pointer = 0;

        if (ones){
            pointer = pointer + 1;
        }

        if(twos) {
            pointer = pointer + 0;
        }

        // quiz 2
        if(threes) {
            pointer = pointer + 0;
        }
        if(fours) {
            pointer = pointer + 0;
        }
        if(fives) {
            pointer = pointer + 1;
        }

        // quiz 3
        if(sixs) {
            pointer = pointer + 0;
        }
        if(sevens) {
            pointer = pointer + 0;
        }
        if(eights) {
            pointer = pointer + 1;
        }

        // quiz 4
        if(nines) {
            pointer = pointer + 1;
        }
        if(tens) {
            pointer = pointer + 0;
        }
        if(elevens) {
            pointer = pointer + 0;
        }

        // quiz 5
        if(twes) {
            pointer = pointer + 0;
        }
        if(thirs) {
            pointer = pointer + 1;
        }
        if(fourts) {
            pointer = pointer + 0;
        }

        // quiz 6
        if(fifts) {
            pointer = pointer + 1;
        }
        if(sixts) {
            pointer = pointer + 0;
        }

        // quiz 7
        if(sevts) {
            pointer = pointer + 0;
        }
        if(eightns) {
            pointer = pointer + 0;
        }
        if(nints) {
            pointer = pointer + 1;
        }

        point = pointer ;

        return point;
    }

    private String createOrderSummary( int point, boolean addcream, String names ){


        String name = "\n Name: " +names;

        name += "\nYou got " + point + " right, out of 7 questions";

        return name;
    }


    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.summary_text_view);
        orderSummaryTextView.setText(message);
    }

}
