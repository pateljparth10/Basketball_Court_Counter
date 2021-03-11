package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Increase the score for team A by 3 display
      */

    public void three_points_team_a(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for team A by 2 and display
     */
    public void two_points_team_a(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for team A by 1 and display
     */
    public void one_point_team_a(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Increase the score for team B by 3 and display
     */
    public void three_points_team_b(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for team B by 2 and display
     */
    public void two_points_team_b(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for team B by 1 and display
     */
    public void one_point_team_b(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
/**
 *  Once the reset button is clicked Team A and Team B scores will be 0
 */

    public void reset(View vew) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}