package com.example.android.scorekeeper;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamAM=0;
    int scoreForTeamFCB=0;
    int scoreForTeamAM1=0;
    int scoreForTeamAM2=0;
    int scoreForTeamAM3=0;
    int scoreForTeamAM4=0;
    int scoreForTeamAM5=0;

    int scoreForTeamFCB1=0;
    int scoreForTeamFCB2=0;
    int scoreForTeamFCB3=0;
    int scoreForTeamFCB4=0;
    int scoreForTeamFCB5=0;

    /**
     *
     * Display the given score for Team Atletico Madrid.
     */

    public void displayForTeamAM(int scoreForTeamAM)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_am_score);
        scoreView.setText(String.valueOf(scoreForTeamAM));
    }

    public void displayForTeamAMST(int scoreForTeamAM)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_amst_score);
        scoreView.setText(String.valueOf(scoreForTeamAM));
    }

    public void displayForTeamAMYC(int scoreForTeamAM)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_amyc_score);
        scoreView.setText(String.valueOf(scoreForTeamAM));
    }

    public void displayForTeamAMRC(int scoreForTeamAM)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_amrc_score);
        scoreView.setText(String.valueOf(scoreForTeamAM));
    }

    public void displayForTeamAMFC(int scoreForTeamAM)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_amfc_score);
        scoreView.setText(String.valueOf(scoreForTeamAM));
    }


    public void addOneForTeamAM(View view)
    {

        scoreForTeamAM1=scoreForTeamAM1+1;
        displayForTeamAM(scoreForTeamAM1);

    }

    public void addOneForTeamstAM(View view)
    {

        scoreForTeamAM2=scoreForTeamAM2+1;
        displayForTeamAMST(scoreForTeamAM2);
    }

    public void addOneForTeamycAM(View view)
    {
        scoreForTeamAM3=scoreForTeamAM3+1;
        displayForTeamAMYC(scoreForTeamAM3);
    }

    public void addOneForTeamrcAM(View view)
    {

        scoreForTeamAM4=scoreForTeamAM4+1;
        displayForTeamAMRC(scoreForTeamAM4);
    }

    public void addOneForTeamfcAM(View view)
    {

        scoreForTeamAM5=scoreForTeamAM5+1;
        displayForTeamAMFC(scoreForTeamAM5);
    }



    /**
     *
     * Display the given score for Team FCB.
     */

    public void displayForTeamFCB(int scoreForTeamFCB)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_fcb_score);
        scoreView.setText(String.valueOf(scoreForTeamFCB));
    }

    public void displayForTeamFCBST(int scoreForTeamFCB)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_fcbst_score);
        scoreView.setText(String.valueOf(scoreForTeamFCB));
    }

    public void displayForTeamFCBYC(int scoreForTeamFCB)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_fcbyc_score);
        scoreView.setText(String.valueOf(scoreForTeamFCB));
    }

    public void displayForTeamFCBRC(int scoreForTeamFCB)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_fcbrc_score);
        scoreView.setText(String.valueOf(scoreForTeamFCB));
    }

    public void displayForTeamFCBFC(int scoreForTeamFCB)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_fcbfc_score);
        scoreView.setText(String.valueOf(scoreForTeamFCB));
    }


    public void addOneForTeamFCBTS(View view)
    {

        scoreForTeamFCB1=scoreForTeamFCB1+1;
        displayForTeamFCB(scoreForTeamFCB1);

    }

    public void addOneForTeamFCBST(View view)
    {

        scoreForTeamFCB2=scoreForTeamFCB2+1;
        displayForTeamFCBST(scoreForTeamFCB2);

    }

    public void addOneForTeamFCBYC(View view)
    {

        scoreForTeamFCB3=scoreForTeamFCB3+1;
        displayForTeamFCBYC(scoreForTeamFCB3);

    }

    public void addOneForTeamFCBRC(View view)
    {

        scoreForTeamFCB4=scoreForTeamFCB4+1;
        displayForTeamFCBRC(scoreForTeamFCB4);

    }

    public void addOneForTeamFCBFC(View view)
    {

        scoreForTeamFCB5=scoreForTeamFCB5+1;
        displayForTeamFCBFC(scoreForTeamFCB5);

    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreForTeamAM1=0;
        scoreForTeamAM2=0;
        scoreForTeamAM3=0;
        scoreForTeamAM4=0;
        scoreForTeamAM5=0;
        scoreForTeamFCB1 = 0;
        scoreForTeamFCB2 = 0;
        scoreForTeamFCB3 = 0;
        scoreForTeamFCB4 = 0;
        scoreForTeamFCB5 = 0;
        displayForTeamAM(scoreForTeamAM);
        displayForTeamAM(scoreForTeamAM1);
        displayForTeamAMST(scoreForTeamAM2);
        displayForTeamAMYC(scoreForTeamAM3);
        displayForTeamAMRC(scoreForTeamAM4);
        displayForTeamAMFC(scoreForTeamAM5);
        displayForTeamFCB(scoreForTeamFCB1);
        displayForTeamFCBST(scoreForTeamFCB2);
        displayForTeamFCBYC(scoreForTeamFCB3);
        displayForTeamFCBRC(scoreForTeamFCB4);
        displayForTeamFCBFC(scoreForTeamFCB5);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamAM(scoreForTeamAM1);
        displayForTeamAMST(scoreForTeamAM2);
        displayForTeamAMYC(scoreForTeamAM3);
        displayForTeamAMRC(scoreForTeamAM4);
        displayForTeamAMFC(scoreForTeamAM5);
        displayForTeamFCB(scoreForTeamFCB1);
        displayForTeamFCBST(scoreForTeamFCB2);
        displayForTeamFCBYC(scoreForTeamFCB3);
        displayForTeamFCBRC(scoreForTeamFCB4);
        displayForTeamFCBFC(scoreForTeamFCB5);




    }


}
