package com.example.android.miwok;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NumbersActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_numbers,container,false);

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
        return view;
    }



}
