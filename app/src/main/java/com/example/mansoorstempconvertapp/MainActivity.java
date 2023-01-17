package com.example.mansoorstempconvertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    public void OnCovertButton(View view) {
        EditText editText = findViewById(R.id.editTextNumberDecimal);
        String InputInString = editText.getText().toString();

        Double InputInDouble = Double.parseDouble(InputInString);
        Double OutputInFahrenheit = (InputInDouble * 9 / 5) + 32;

        Snackbar.make(view, "temp in " + InputInString + " Celcius is " + OutputInFahrenheit + " in Fahrenheit "
                ,Snackbar.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}