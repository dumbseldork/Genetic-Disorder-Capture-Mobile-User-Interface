package com.skam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DiseaseInfo extends AppCompatActivity {
    Button mbtnChic;
    Button mbtnAcne;
    Button mbtnEcz;
    Button mbtnPity;
    Button mbtnPso;
    Button mbtnTinea;
    Button mbtnBack;
    Button mbtnVtligo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_info);

        mbtnChic = (Button)findViewById(R.id.chicpox_btn);
        mbtnChic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChickenPox();
            }
        });

        mbtnAcne = (Button)findViewById(R.id.acne_btn);
        mbtnAcne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcne();
            }
        });

        mbtnEcz = (Button)findViewById(R.id.ecz_btn);
        mbtnEcz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEczema();
            }
        });

        mbtnPity=(Button)findViewById(R.id.pity_btn);
        mbtnPity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPityriasisRosea();
            }
        });

        mbtnPso = (Button)findViewById(R.id.pso_btn);
        mbtnPso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPsoriasis();
            }
        });

        mbtnVtligo = (Button)findViewById(R.id.vt_btn);
        mbtnVtligo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVtiligo();
            }
        });

        mbtnBack = (Button) findViewById(R.id.btnBack);
        mbtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });

    }
    public void openChickenPox(){
        Intent intent = new Intent(this, ChickenPox.class);
        startActivity(intent);
    }

    public void openAcne(){
        Intent intent1 = new Intent(this, Acne.class);
        startActivity(intent1);
    }
    public void openEczema(){
        Intent intent2 = new Intent(this, Eczema.class);
        startActivity(intent2);
    }
    public void openPityriasisRosea(){
        Intent intent3 = new Intent(this, PityriasisRosea.class);
        startActivity(intent3);
    }
    public void openPsoriasis(){
        Intent intent4 = new Intent(this, Psoriasis.class);
        startActivity(intent4);
    }

    public void openVtiligo(){
        Intent intent6 = new Intent(this, Vtiligo.class);
        startActivity(intent6);
    }
    public void openMain(){
        Intent intent7 = new Intent(this, Main.class);
        startActivity(intent7);
    }
}
