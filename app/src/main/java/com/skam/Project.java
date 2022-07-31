package com.skam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Project extends AppCompatActivity {
    Button mbtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        mbtnBack=(Button)findViewById(R.id.btnBack);
        mbtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutUs();
            }
        });
    }
    public void openAboutUs(){
        Intent intent=new Intent(this, AboutUs.class);
        startActivity(intent);
    }
}
