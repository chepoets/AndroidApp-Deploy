package com.example.android.learnmiwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NumbersActivity(View view) {
    Intent numbers = new Intent (this, NumbersActivity.class);
        startActivity(numbers);
    }

    public void FamilyActivity(View view) {
        Intent family = new Intent (this, FamilyActivity.class);
        startActivity(family);
    }

    public void ColorsActivity(View view) {
        Intent colors = new Intent (this, ColorsActivity.class);
        startActivity(colors);
    }

    public void PhrasesActivity(View view) {
        Intent phrases = new Intent (this, PhrasesActivity.class);
        startActivity(phrases);
    }
}
