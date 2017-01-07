package com.developes.final11;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by choxa on 11/9/2016.
 */

public class splash extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_zone);
        Thread mythread = new Thread(){
            @Override
            public void run(){
                try {




                    sleep(3000);
                    Intent startMainScreen = new Intent(getApplicationContext(), MainActivity.class);

                    startActivity(startMainScreen);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        mythread.start();
    }
}
