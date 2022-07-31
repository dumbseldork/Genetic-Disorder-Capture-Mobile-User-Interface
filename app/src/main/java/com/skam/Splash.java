package com.skam;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
TextView text;
    MediaPlayer ourSound;
    Typeface tfc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        text = (TextView) findViewById(R.id.textView);


        tfc1 = Typeface.createFromAsset(getAssets(),"fonts/twoten.ttf");
        text.setTypeface(tfc1);

        ImageView imageView = findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        imageView.startAnimation(animation);

        MediaPlayer ourSound = MediaPlayer.create(this, R.raw.sfx);
        ourSound.start();


        Thread timer = new Thread(){

            @Override
            public void run() {

                try {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),LogInScreen.class);
                    startActivity(intent);
                    finish();
                    super.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



            }
        };

        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSound.release();
        finish();
    }
}
