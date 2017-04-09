package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] angka = new String[10];
        angka[0] = "one";
        angka[1] = "Two";
        angka[2] = "Three";
        angka[3] = "Four";
        angka[4] = "Five";
        angka[5] = "Six";
        angka[6] = "Seven";
        angka[7] = "Eight";
        angka[8] = "Nine";
        angka[9] = "Ten";



    }

}
