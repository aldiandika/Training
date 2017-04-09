/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new ColorsActivity(), "Colors");
        adapter.addFragment(new NumbersActivity(), "Numbers");
        adapter.addFragment(new phrasesActivity(), "Phrases");
        adapter.addFragment(new FamilyActivity(), "Family");
        viewPager.setAdapter(adapter);
    }

}



//  numbers.setOnClickListener(new View.OnClickListener() {
//// The code in this method will be executed when the numbers View is clicked on.
//@Override
//public void onClick(View view) {
//        Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//        startActivity(numbersIntent);
//        }
//        });
//
//        family.setOnClickListener(new View.OnClickListener() {
//// The code in this method will be executed when the numbers View is clicked on.
//@Override
//public void onClick(View view) {
//        Intent numbersIntent = new Intent(MainActivity.this, FamilyActivity.class);
//        startActivity(numbersIntent);
//        }
//        });
//
//        colors.setOnClickListener(new View.OnClickListener() {
//// The code in this method will be executed when the numbers View is clicked on.
//@Override
//public void onClick(View view) {
//        Intent numbersIntent = new Intent(MainActivity.this, ColorsActivity.class);
//        startActivity(numbersIntent);
//        }
//        });
//
//        phrases.setOnClickListener(new View.OnClickListener() {
//// The code in this method will be executed when the numbers View is clicked on.
//@Override
//public void onClick(View view) {
//        Intent numbersIntent = new Intent(MainActivity.this, phrasesActivity.class);
//        startActivity(numbersIntent);
//        }
//        });
//
//    public void goToNumber(View view){
//        Intent i = new Intent(this,NumbersActivity.class);
//        startActivity(i);
//    }
