package com.example.abmoiz.smartlarder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class splashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        ImageView imgrotation =(ImageView) findViewById(R.id.image_splash);




        //Rotation rotation = new Rotation(imgrotation,0,350,0,0,Rotation.RELATIVE_TO_SELF,Rotation.RELATIVE_TO_SELF);
        //rotation.roatateView(1000);
        //rotation.stopRotation(2000);

        PulseAnimation.create().with(imgrotation)
                .setDuration(310)
                .setRepeatCount(PulseAnimation.INFINITE)
                .setRepeatMode(PulseAnimation.REVERSE)
                .start();




    }
}
