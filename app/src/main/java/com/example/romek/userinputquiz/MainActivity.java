package com.example.romek.userinputquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton veae, veat, vtae, vtat, vtad, vdae, vdat, vdad;
    Button submit;
    int erve, ervt, ervd, ervo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        veae = (RadioButton) findViewById(R.id.question1awnser1);
        veat = (RadioButton) findViewById(R.id.question1awnser2);
        vtae = (RadioButton) findViewById(R.id.question2awnser1);
        vtat = (RadioButton) findViewById(R.id.question2awnser2);
        vtad = (RadioButton) findViewById(R.id.question2awnser3);
        vdae = (RadioButton) findViewById(R.id.question3awnser1);
        vdat = (RadioButton) findViewById(R.id.question3awnser2);
        vdad = (RadioButton) findViewById(R.id.question3awnser3);
        submit = (Button) findViewById(R.id.submitbutton);
        erve = 0;
        ervt = 0;
        ervd = 0;
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //vraag een antwoorden goed of fout
                if (veae.isChecked()) {
                    erve = erve + 1;
                } else if (veat.isChecked()) {
                    erve = erve + 0;
                }
                //vraag twee goed of fout
                if (vtat.isChecked()) {
                    ervt = ervt + 1;
                } else if (vtae.isChecked()) {
                    ervt = ervt + 0;
                } else if (vtad.isChecked()) {
                    ervt = ervt + 0;
                }
                //Vraag drie goed of fout
                if (vdae.isChecked()) {
                    ervd = ervd + 1;
                } else if (vdat.isChecked()) {
                    ervd = ervd + 0;
                } else if (vdad.isChecked()) {
                    ervd = ervd + 0;
                }
                ervo = erve + ervd + ervt;
                clearCheck();
                Display();
            }
            private void clearCheck(){
                veae.setChecked(false);
                veat.setChecked(false);
                vtae.setChecked(false);
                vtat.setChecked(false);
                vtad.setChecked(false);
                vdae.setChecked(false);
                vdat.setChecked(false);
                vdad.setChecked(false);
            }
            private void Display(){
                TextView resultaten = (TextView) findViewById(R.id.aantalpunten);
                resultaten.setText("Punten: " + ervo);
            }

        });

    }
}
