package com.example.android.computernetworkquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;


import com.example.android.computernetworkquiz.R;

import java.text.NumberFormat;

import static android.R.attr.checked;
import static android.R.attr.checkedButton;
import static android.R.attr.id;
import static android.R.attr.name;
import static android.R.id.message;

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitPoints(View view) {

        int points = 0;

        //binary numbers

        RadioButton oneRadioButton = (RadioButton) findViewById(R.id.one_radio_button);
        if (oneRadioButton.isChecked())
            points++;

        RadioButton twoRadioButton = (RadioButton) findViewById(R.id.divide_radio_button);
        if (twoRadioButton.isChecked())
            points++;

        RadioButton threeRadioButton = (RadioButton) findViewById(R.id.internet_radio_button);
        if (threeRadioButton.isChecked())
            points++;
        RadioButton fourRadioButton = (RadioButton) findViewById(R.id.zeros_radio_button);
        if (fourRadioButton.isChecked())
            points++;
        RadioButton fiveRadioButton = (RadioButton) findViewById(R.id.ones1_radio_button);
        if (fiveRadioButton.isChecked())
            points++;
        RadioButton sixRadioButton = (RadioButton) findViewById(R.id.order1_radio_button);
        if (sixRadioButton.isChecked())
            points++;
        RadioButton sevenRadioButton = (RadioButton) findViewById(R.id.selecting_radio_button);
        if (sevenRadioButton.isChecked())
            points++;


        CheckBox firstCheckBox = (CheckBox) findViewById(R.id.device_check_box);

        CheckBox secondCheckBox = (CheckBox) findViewById(R.id.access_check_box);

        CheckBox thirdCheckBox = (CheckBox) findViewById(R.id.role_check_box);

        if (firstCheckBox.isChecked() && secondCheckBox.isChecked() && !thirdCheckBox.isChecked()) {
            points++;
        }

        EditText question = (EditText) findViewById(R.id.answer);
        {
            if (question.getText().toString().equalsIgnoreCase("IPv4")) {
                points++;
            }

            Toast.makeText(getApplicationContext(), "This is your score: " + points, Toast.LENGTH_LONG).show();


            String scoreMessage;

            if (points > 5) {
                scoreMessage = points + "Great work!";
            } else
                scoreMessage = points + "You need to study more";

            System.out.println(scoreMessage);

        }
    }
}
