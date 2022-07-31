package com.skam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    Button mInsbtn;
    Button mInfobtn;
    Button mStartbtn;
    Button mbtnAbout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInsbtn=(Button)findViewById(R.id.Insbtn);
        mInsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInstructions();
            }
        });

        mInfobtn=(Button)findViewById(R.id.Infobtn);
        mInfobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiseaseInfo();
            }
        });

        mbtnAbout=(Button)findViewById(R.id.btnAbout);
        mbtnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAbout();
            }
        });

        mStartbtn=(Button)findViewById(R.id.Startbtn);
        mStartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStart();
            }
        });



    }
    public void openInstructions() {
        Intent intent1= new Intent(this, Instructions.class);
        startActivity(intent1);
    }
    public void openDiseaseInfo() {
        Intent intent2= new Intent(this, DiseaseInfo.class);
        startActivity(intent2);
    }
    public void openStart() {
        Intent intent3= new Intent(this, Start.class);
        startActivity(intent3);
    }
    public void openAbout(){
        Intent intent4=new Intent(this, About.class);
        startActivity(intent4);
    }
}
