package com.example.romek.userinputquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int points = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void question1 (View view){
        boolean checked = ((RadioButton) view).isChecked();
        int count = 0;
        switch (view.getId()) {
            case R.id.antwoordenvraag1:
                if (checked)
                {
                    if(count!=0){
                        points -= 1;
                        count = 0;
                    }
                }
                break;
            case R.id.question1awnser1:
                if (checked)
                {
                    if(count!=0){
                        points-=1;
                        count=1;
                    }
                }
                break;
            case R.id.question1awnser2:
                if (checked)
                {
                    if(count!=0){
                        points-=0;
                        count=0;
                    }
                }
                break;
        }

    }

    public void showScore (View view) {
        TextView scoreTextView = (TextView) findViewById(R.id.aantalpunten);
        scoreTextView.setText("Aantal Punten:" + points);
    }
}
