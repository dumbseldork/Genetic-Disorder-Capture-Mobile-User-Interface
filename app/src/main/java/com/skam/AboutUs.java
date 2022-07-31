package com.skam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AboutUs extends AppCompatActivity {
    Button mbtnProj;
    Button mbtnProp;
    Button mbtnAd;
    Button mbtnBack1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        mbtnProj = (Button)findViewById(R.id.btnProj);
        mbtnProj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProject();
            }
        });

        mbtnProp = (Button)findViewById(R.id.btnProp);
        mbtnProp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAbout();
            }
        });

        mbtnAd = (Button)findViewById(R.id.btnAd);
        mbtnAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdviser();
            }
        });

        mbtnBack1=(Button)findViewById(R.id.btnBack1);
        mbtnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogInScreen();
            }
        });

    }
    public void openProject(){
        Intent intent = new Intent(this, Project.class);
        startActivity(intent);
    }

    public void openAbout(){
        Intent intent1 = new Intent(this, About.class);
        startActivity(intent1);
    }
    public void openAdviser(){
        Intent intent2 = new Intent(this, Adviser.class);
        startActivity(intent2);
    }
    public void openLogInScreen(){
        Intent intent3 = new Intent(this, LogInScreen.class);
        startActivity(intent3);
    }
    }
