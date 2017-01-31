package com.example.android.quiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void controleer(View view) {
        int goed = 0;
        int fout = 0;
        TextView textView = (TextView) findViewById(R.id.controle_text_view);
        TextView textView2 = (TextView) findViewById(R.id.controle2_text_view);
        TextView textView3 = (TextView) findViewById(R.id.controle3_text_view);
        TextView textView4 = (TextView) findViewById(R.id.controle4_text_view);

        CheckBox keuze = (CheckBox) findViewById(R.id.keuze_checkbox);
        CheckBox keuze2 = (CheckBox) findViewById(R.id.keuze2_checkbox);
        CheckBox keuze3 = (CheckBox) findViewById(R.id.keuze3_checkbox);
        CheckBox keuze4 = (CheckBox) findViewById(R.id.keuze4_checkbox);
        CheckBox keuze5 = (CheckBox) findViewById(R.id.keuze5_checkbox);
        boolean gekozen = keuze.isChecked();
        boolean gekozen2 = keuze2.isChecked();
        boolean gekozen3 = keuze3.isChecked();
        boolean gekozen4 = keuze4.isChecked();
        boolean gekozen5 = keuze5.isChecked();
        EditText nameField = (EditText) findViewById(R.id.antwoord);
        String name = nameField.getText().toString();

        RadioButton radio = (RadioButton) findViewById(R.id.keuze_radio);
        boolean hasRadio = radio.isChecked();
        RadioButton radio2 = (RadioButton) findViewById(R.id.keuze2_radio);
        boolean hasRadio2 = radio2.isChecked();


        String controle;
        String controle2;
        String controle3;
        String controle4;
        String antwoord = "android:layout_width=\"wrap_content\"";

        if (!gekozen && gekozen2 && !gekozen3 && gekozen4 && !gekozen5) {
            textView.setTextColor(Color.GREEN);
            controle = "Goed";
            goed += 1;
        } else if (!gekozen && gekozen2 && !gekozen3 && !gekozen4 && !gekozen5 || !gekozen && !gekozen2 && !gekozen3 && gekozen4 && !gekozen5) {
            textView.setTextColor(Color.RED);
            controle = "Ben je niet iets vergeten?";
            fout += 1;
        } else {
            textView.setTextColor(Color.RED);
            controle = "Fout";
            fout += 1;
        }

        if (hasRadio) {
            textView2.setTextColor(Color.GREEN);
            controle2 = "Goed";
            goed += 1;
        } else {
            textView2.setTextColor(Color.RED);
            controle2 = "Fout";
            fout += 1;
        }

        if (name.matches(antwoord)){
            textView3.setTextColor(Color.GREEN);
            controle3 = "Goed";
            goed += 1;
        } else {
            textView3.setTextColor(Color.RED);
            controle3 = "Fout";
            fout += 1;
        }

        if (hasRadio2) {
            textView4.setTextColor(Color.GREEN);
            controle4 = "Goed";
            goed += 1;
        } else {
            textView4.setTextColor(Color.RED);
            controle4 = "Fout";
            fout += 1;
        }

        String aantal = "Je hebt " + goed + " goed en " + fout + " fout";
        if (goed >= 3) {
            aantal += "\nJe hebt het gehaald!";
        } else {
            aantal += "\nJe hebt het niet gehaald";
        }

        displayQuantity(controle);
        displayQuantity2(controle2);
        displayQuantity3(controle3);
        displayQuantity4(controle4);
        Toast.makeText(this, aantal, Toast.LENGTH_SHORT).show();
    }

    private void displayQuantity(String numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.controle_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    private void displayQuantity2(String numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.controle2_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    private void displayQuantity3(String numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.controle3_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    private void displayQuantity4(String numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.controle4_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    private void displayTotaal(String numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.totaal);
        quantityTextView.setText("" + numberOfCoffees);
    }
}
