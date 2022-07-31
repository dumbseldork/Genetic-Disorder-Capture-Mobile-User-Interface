package com.skam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Vtiligo extends AppCompatActivity {
    Button mbtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vtiligo);

        mbtnBack = (Button) findViewById(R.id.btnBack);
        mbtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiseaseInfo();
            }
        });
    }

    public void openDiseaseInfo() {
        Intent intent = new Intent(this, DiseaseInfo.class);
        startActivity(intent);
    }
}