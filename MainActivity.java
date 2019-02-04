package com.example.umpirebuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int countBall = 0;
    private int countStrike = 0;
    private TextView BallView;
    private TextView StrikeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ballClicked(View view) {
        countBall++;
        if(countBall < 5){
            BallView.setText(String.valueOf(countBall));

        }else{
            BallView.setText("Walk!!");
        }
    }

    public void strikeClicked(View view) {
        countStrike++;
        if (countStrike < 4){
            StrikeView.setText(String.valueOf(countStrike));
        }else{
            StrikeView.setText("Out!!");
        }
    }
}

