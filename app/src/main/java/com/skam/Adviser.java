package com.skam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Adviser extends AppCompatActivity {
    Button mbtnBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adviser);

        mbtnBack2=(Button)findViewById(R.id.btnBack2);
        mbtnBack2.setOnClickListener(new View.OnClickListener() {
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
