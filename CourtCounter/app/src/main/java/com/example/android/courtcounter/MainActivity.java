package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //score global variables

    //Team A
    int scoreA = 0;

    //Team B
    int scoreB = 0;

    //public view to add point to score

    //Team A
    public void plus3PointA(View view) {
        scoreA+=3;
        displayA(scoreA);
    }

    public void plus2PointA(View view) {
        scoreA+=2;
        displayA(scoreA);
    }

    public void plus1PointA(View view) {
        scoreA+=1;
        displayA(scoreA);
    }

    //Team B
    public void plus3PointB(View view) {
        scoreB+=3;
        displayB(scoreB);
    }

    public void plus2PointB(View view) {
        scoreB+=2;
        displayB(scoreB);
    }

    public void plus1PointB(View view) {
        scoreB+=1;
        displayB(scoreB);
    }

    //reset button
    public void Reset(View view) {
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }

    //private method to display score

    //Team A
    private void displayA(int scoreA) {
        TextView pointteamaTextView = (TextView) findViewById(R.id.point_team_a);
        pointteamaTextView.setText(NumberFormat.getNumberInstance().format(scoreA));
    }

    //Team B
    private void displayB(int scoreB) {
        TextView  pointteambTextView = (TextView) findViewById(R.id.point_team_b);
        pointteambTextView.setText(NumberFormat.getNumberInstance().format(scoreB));
    }


}
