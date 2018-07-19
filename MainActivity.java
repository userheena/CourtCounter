package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


     int score_a = 0;
     int score_b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void addOneForTeamA(View va)
    {
        score_a = score_a + 1;
        displayForTeamA(score_a);
    }

    public void addTwoForTeamA(View va)
    {
        score_a = score_a + 2;
        displayForTeamA(score_a);
    }

    public void addThreeForTeamA(View va)
    {
        score_a = score_a + 3;
        displayForTeamA(score_a);
    }


    public void addOneForTeamB(View vb)
    {
        score_b = score_b + 1;
        displayForTeamB(score_b);
    }

    public void addTwoForTeamB(View vb)
    {
        score_b = score_b + 2;
        displayForTeamB(score_b);
    }

    public void addThreeForTeamB(View vb)
    {
        score_b = score_b + 3;
        displayForTeamB(score_b);
    }


    public void displayForTeamA(int scorea)
    {
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(scorea));
    }


    public void displayForTeamB(int scoreb)
    {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreb));
    }

    public void reset(View vr)
    {
        score_a = 0;
        score_b = 0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);
    }


}
