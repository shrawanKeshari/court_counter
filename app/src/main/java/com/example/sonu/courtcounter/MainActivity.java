package com.example.sonu.courtcounter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void threePoints(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }

    public void twoPoints(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamA(scoreTeamA);
    }

    public void freeThrow(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamA(scoreTeamA);
    }

    public void threePointsB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }

    public void twoPointsB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamB(scoreTeamB);
    }

    public void freeThrowB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }

    private void displayTeamA(int i) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view_A);
        scoreTextView.setText(String.valueOf(i));
    }

    private void displayTeamB(int i) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view_B);
        scoreTextView.setText(String.valueOf(i));
    }
}
