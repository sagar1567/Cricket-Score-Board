package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int runA = 0;
    int wicA = 0;
    int runb=0;
    int wicb=0;
    double overa=0.0;
    double overb=0.0;
    String res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneA(View view) {
        runA = runA + 1;
        displayForTeamA(runA);
        if (Math.abs((overa % 1)-.6) < .0000001) {
            overa += .5;
            overa=Math.round(overa*10)/10.0;
        }
        else {
            overa += .1;
            overa=Math.round(overa*10)/10.0;
        }
        displayovera(overa);
    }

    public void twoA(View view) {
        runA = runA + 2;
        displayForTeamA(runA);
        if (Math.abs((overa % 1)-.6) < .0000001) {
            overa += .5;
            overa=Math.round(overa*10)/10.0;
        }
        else {
            overa += .1;
            overa=Math.round(overa*10)/10.0;
        }
        displayovera(overa);
    }

    public void threeA(View view) {
        runA = runA + 3;
        displayForTeamA(runA);
        if (Math.abs((overa % 1)-.6) < .0000001) {
            overa += .5;
            overa=Math.round(overa*10)/10.0;
        }
        else {
            overa += .1;
            overa=Math.round(overa*10)/10.0;
        }
        displayovera(overa);
    }

    public void fourA(View view) {
        runA = runA + 4;
        displayForTeamA(runA);
        if (Math.abs((overa % 1)-.6) < .0000001) {
            overa += .5;
            overa=Math.round(overa*10)/10.0;
        }
        else {
            overa += .1;
            overa=Math.round(overa*10)/10.0;
        }
        displayovera(overa);
    }

    public void sixA(View view) {
        runA = runA + 6;
        displayForTeamA(runA);
        if (Math.abs((overa % 1)-.6) < .0000001) {
            overa += .5;
            overa=Math.round(overa*10)/10.0;
        }
        else {
            overa += .1;
            overa=Math.round(overa*10)/10.0;
        }
        displayovera(overa);
    }

    public void wideA(View view) {
        runA = runA + 1;
        displayForTeamA(runA);
    }

    public void nobA(View view) {
        runA = runA + 1;
        displayForTeamA(runA);
    }

    public void wickA(View view) {
        if(wicA==10)
            wicA=0;
        else
            wicA=wicA+1;
        displaywicForTeamA(wicA);
        if (Math.abs((overa % 1)-.6) < .0000001) {
            overa += .5;
            overa=Math.round(overa*10)/10.0;
        }
        else {
            overa += .1;
            overa=Math.round(overa*10)/10.0;
        }
        displayovera(overa);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displaywicForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wicket);
        scoreView.setText(String.valueOf(score));
    }
    public void oneb(View view) {
        runb = runb + 1;
        displayForTeamb(runb);
        if (Math.abs((overb % 1)-.6) < .0000001) {
            overb += .5;
            overb=Math.round(overb*10)/10.0;
        }
        else {
            overb += .1;
            overb=Math.round(overb*10)/10.0;
        }
        displayoverb(overb);
    }

    public void twob(View view) {
        runb = runb + 2;
        displayForTeamb(runb);
        if (Math.abs((overb % 1)-.6) < .0000001) {
            overb += .5;
            overb=Math.round(overb*10)/10.0;
        }
        else {
            overb += .1;
            overb=Math.round(overb*10)/10.0;
        }
        displayoverb(overb);
    }

    public void threeb(View view) {
        runb = runb + 3;
        displayForTeamb(runb);
        if (Math.abs((overb % 1)-.6) < .0000001) {
            overb += .5;
            overb=Math.round(overb*10)/10.0;
        }
        else {
            overb += .1;
            overb=Math.round(overb*10)/10.0;
        }
        displayoverb(overb);
    }

    public void fourb(View view) {
        runb = runb + 4;
        displayForTeamb(runb);
        if (Math.abs((overb % 1)-.6) < .0000001) {
            overb += .5;
            overb=Math.round(overb*10)/10.0;
        }
        else {
            overb += .1;
            overb=Math.round(overb*10)/10.0;
        }
        displayoverb(overb);
    }

    public void sixb(View view) {
        runb = runb + 6;
        displayForTeamb(runb);
        if (Math.abs((overb % 1)-.6) < .0000001) {
            overb += .5;
            overb=Math.round(overb*10)/10.0;
        }
        else {
            overb += .1;
            overb=Math.round(overb*10)/10.0;
        }
        displayoverb(overb);
    }

    public void wideb(View view) {
        runb = runb + 1;
        displayForTeamb(runb);
    }

    public void nobb(View view) {
        runb = runb + 1;
        displayForTeamb(runb);
    }

    public void wickb(View view) {
        if(wicb==10)
            wicb=0;
        else
            wicb=wicb+1;
        displaywicForTeamb(wicb);
        if (Math.abs((overb % 1)-.6) < .0000001) {
            overb += .5;
            overb=Math.round(overb*10)/10.0;
        }
        else {
            overb += .1;
            overb=Math.round(overb*10)/10.0;
        }
        displayoverb(overb);
    }

    public void displayForTeamb(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displaywicForTeamb(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wicket);
        scoreView.setText(String.valueOf(score));
    }
    public void resettoZero(View view) {
        runA=0;
        runb=0;
        wicA=0;
        wicb=0;
        overa=0.0;
        overb=0.0;
        res=" ";
        displayovera(overa);
        displayoverb(overb);
        displaywicForTeamA(wicA);
        displayForTeamA(runA);
        displayForTeamb(runb);
        displaywicForTeamb(wicb);
        displayres(res);
    }
    public void displayovera(double score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_over);
        scoreView.setText(String.valueOf(score));
    }
    public void displayoverb(double score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_over);
        scoreView.setText(String.valueOf(score));
    }
    public void result(View view) {
        if(runA>runb) {
            res = "India Win!";
        }
        else if(runA<runb)
            res="Australia Win";
        else
            res="No Result";
        displayres(res);
    }
    public void displayres(String score) {
        TextView scoreView = (TextView) findViewById(R.id.result);
        scoreView.setText(String.valueOf(score));
    }
    public void zeroa(View view) {
        if (Math.abs((overa % 1)-.6) < .0000001) {
            overa += .5;
            overa=Math.round(overa*10)/10.0;
        }
        else {
            overa += .1;
            overa=Math.round(overa*10)/10.0;
        }
        displayovera(overa);
    }
    public void zerob(View view) {
        if (Math.abs((overb % 1)-.6) < .0000001) {
            overb += .5;
            overb=Math.round(overb*10)/10.0;
        }
        else {
            overb += .1;
            overb=Math.round(overb*10)/10.0;
        }
        displayoverb(overb);
    }

}
