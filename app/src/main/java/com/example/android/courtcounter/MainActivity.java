package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0,scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsA(View view) {
       scoreTeamA=scoreTeamA+3;
       displayForTeamA(scoreTeamA);
    }

    public void addTwoPointsA(View view) {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    public void addOnePointA(View view) {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void addOnePointB(View view) {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoPointsB(View view) {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreePointsB(View view) {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void resetScore(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        TextView winner=findViewById(R.id.winner_text_view);
        winner.setText("");
    }
    public void displayForTeamA(int score){
        TextView scoreAView=findViewById(R.id.score_a_view);
        scoreAView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView scoreBView=findViewById(R.id.score_b_view);
        scoreBView.setText(String.valueOf(score));
    }

    public void winner(View view) {
        int result;
        if(scoreTeamA>scoreTeamB){
            result=scoreTeamA-scoreTeamB;
            TextView winner=findViewById(R.id.winner_text_view);
            winner.setText("Team A won by " + result + " points");
        }
        else if(scoreTeamB>scoreTeamA){
            result=scoreTeamB-scoreTeamA;
            TextView winner=findViewById(R.id.winner_text_view);
            winner.setText("Team B won by " + result + " points");
        }
        else{
            TextView winner=findViewById(R.id.winner_text_view);
            winner.setText("It's tie");
        }
    }
}