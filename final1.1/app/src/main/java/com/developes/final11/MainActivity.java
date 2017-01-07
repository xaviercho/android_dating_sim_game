package com.developes.final11;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;
import static com.developes.final11.R.id.button1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout rl;
        rl = (RelativeLayout) findViewById(R.id.activity_main);
        rl.setBackground(getResources().getDrawable(R.drawable.ll0));

       // final ImageButton play = (ImageButton) findViewById(R.id.imageButton3);
       Button start = (Button) findViewById(R.id.button4);
        Button next = (Button) findViewById(R.id.button5);
        Button ok = (Button) findViewById(R.id.button11);
        Button op1 = (Button) findViewById(R.id.button1);
        Button op2 = (Button) findViewById(R.id.button2);
        Button op3 = (Button) findViewById(R.id.button3);
        Button restart = (Button) findViewById(R.id.button10);
        final ImageButton ibtn = (ImageButton)findViewById(R.id.ib);
        final ImageButton aa = (ImageButton)findViewById(R.id.aa);
        final ImageButton bb = (ImageButton)findViewById(R.id.bb);
        final MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.starving);
        final MediaPlayer mp2 = MediaPlayer.create(MainActivity.this,R.raw.strangerthings);
        final MediaPlayer mp3 = MediaPlayer.create(MainActivity.this,R.raw.whatislove);
        final MediaPlayer mp4 = MediaPlayer.create(MainActivity.this,R.raw.allstar);
        final MediaPlayer mp5 = MediaPlayer.create(MainActivity.this,R.raw.wontwanttoknow);
        final MediaPlayer mp6 = MediaPlayer.create(MainActivity.this,R.raw.closer);
        final MediaPlayer mp7 = MediaPlayer.create(MainActivity.this,R.raw.lovemelikeudo);
        final MediaPlayer mp8 = MediaPlayer.create(MainActivity.this,R.raw.fireflies);
        final MediaPlayer mp9 = MediaPlayer.create(MainActivity.this,R.raw.pkstdm);



        //play.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View v) {

               // mp.start();
           // }
      //  });

        mp.setOnPreparedListener( new MediaPlayer.OnPreparedListener() {


            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });



        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // ImageButton play = (ImageButton) findViewById(R.id.imageButton3);
                score =0;
                slide = 0;
                RelativeLayout rl;
                rl = (RelativeLayout) findViewById(R.id.activity_main);
                rl.setBackground(getResources().getDrawable(R.drawable.ll0));
                btn4.setVisibility(View.VISIBLE);
              //  play.setVisibility(View.VISIBLE);
                btn10.setVisibility(View.INVISIBLE);
ibtn.setVisibility(View.INVISIBLE);


               mp.reset();
                mp2.reset();
               mp3.reset();
              mp4.reset();
              mp5.reset();
              mp6.reset();
              mp7.reset();
              mp8.reset();
            }
        });


        start.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {

                btn1 = (Button) findViewById(R.id.button1);
                btn2 = (Button) findViewById(R.id.button2);
                btn3 = (Button) findViewById(R.id.button3);
                btn4 = (Button) findViewById(R.id.button4);
                btn5 = (Button) findViewById(R.id.button5);
                btn6 = (Button) findViewById(R.id.button6);
                btn7 = (Button) findViewById(R.id.button7);
                btn8 = (Button) findViewById(R.id.button8);
                btn9 = (Button) findViewById(R.id.button9);
                btn10 = (Button) findViewById(R.id.button10);
                btn11 = (Button) findViewById(R.id.button11);

               // ImageButton play = (ImageButton) findViewById(R.id.imageButton3);
               // start = "st";
                btn4.setVisibility(View.INVISIBLE);
                btn11.setVisibility(View.VISIBLE);
               // btn1.setVisibility(View.VISIBLE);
              //  btn2.setVisibility(View.VISIBLE);
              //  btn3.setVisibility(View.VISIBLE);
                //play.setVisibility(View.INVISIBLE);

                RelativeLayout rl;
                rl = (RelativeLayout) findViewById(R.id.activity_main);
                rl.setBackground(getResources().getDrawable(R.drawable.ll2));

                mp.stop();
                mp3.start();
                //mp.release();
                btn11.setVisibility(View.VISIBLE);
            }
      });
        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "TORB TORB", Toast.LENGTH_SHORT).show();
                score++;
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 btn1.setVisibility(View.VISIBLE);
                  btn2.setVisibility(View.VISIBLE);
                  btn3.setVisibility(View.VISIBLE);
                  btn11.setVisibility(View.INVISIBLE);
                RelativeLayout rl;
                rl = (RelativeLayout) findViewById(R.id.activity_main);
                rl.setBackground(getResources().getDrawable(R.drawable.ll1));
            }
        });


        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1 = (Button) findViewById(R.id.button1);
                RelativeLayout rl;
                rl = (RelativeLayout) findViewById(R.id.activity_main);

                rl.setBackgroundColor(Color.BLUE);
                btn1.setVisibility(View.INVISIBLE);
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);
                btn5.setVisibility(View.VISIBLE);
                story ="irl";
                mp3.stop();
                mp6.start();
                rl.setBackground(getResources().getDrawable(R.drawable.ng0));

            }
        });


        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2 = (Button) findViewById(R.id.button2);

                RelativeLayout rl;
                rl = (RelativeLayout) findViewById(R.id.activity_main);

               // rl.setBackgroundColor(Color.RED);
                btn1.setVisibility(View.INVISIBLE);
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);
                btn5.setVisibility(View.VISIBLE);
                story = "online";
                mp3.stop();
                mp5.start();
                rl.setBackground(getResources().getDrawable(R.drawable.h0));
            }
        });


        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3 = (Button) findViewById(R.id.button3);

                RelativeLayout rl;
                rl = (RelativeLayout) findViewById(R.id.activity_main);

                //rl.setBackgroundColor(Color.YELLOW);
                btn1.setVisibility(View.INVISIBLE);
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);
                btn5.setVisibility(View.VISIBLE);

                story = "plant";
                rl.setBackground(getResources().getDrawable(R.drawable.t0));
                mp3.stop();
                mp4.start();
                slide++;
            }
        });






        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slide++;
                TextView t1 = (TextView) findViewById(R.id.slide);
                t1.setText(Integer.toString(slide));
                if (story == "irl"){
                    RelativeLayout rl;
                    rl = (RelativeLayout) findViewById(R.id.activity_main);
                    if (slide == 1){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng1));
                    }
                    if (slide == 2){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng2));
                    }
                    if (slide == 3){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng3));
                    }
                    if (slide == 4){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng4));
                    }
                    if (slide == 5){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng5));
                    }
                    if (slide == 6){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng6));
                    }
                    if (slide == 7){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng7));
                    }
                    if (slide == 8){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng8));
                    }
                    if (slide == 9){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng9));
                    }
                    if (slide == 10){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng10));
                    }
                    if (slide == 11){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng11));
                    }
                    if (slide == 12){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng12));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        btn9.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }
                    if (slide == 13){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng13));
                    }
                    if (slide == 14){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng14));
                    }
                    if (slide == 15){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng15));
                    }
                    if (slide == 16){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng16));
                    }
                    if (slide == 17){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng17));
                    }
                    if (slide == 18){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng18));
                    }
                    if (slide == 19){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng19));
                    }
                    if (slide == 20){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng20));
                    }
                    if (slide == 21){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng21));
                    }
                    if (slide == 22){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng22));
                    }
                    if (slide == 23){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng23));
                    }
                    if (slide == 24){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng24));
                    }
                    if (slide == 25){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng25));
                    }
                    if (slide == 26){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng26));
                    }
                    if (slide == 27){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng27));
                    }
                    if (slide == 28){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng28));
                    }
                    if (slide == 29){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng29));
                    }
                    if (slide == 30){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng30));
                    }
                    if (slide == 31){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng31));
                    }
                    if (slide == 32){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng32));
                    }
                    if (slide == 33){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng33));
                    }
                    if (slide == 34){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng34));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        btn9.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);

                    }
                    if (slide == 35){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng35));
                    }
                    if (slide == 36){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng36));
                    }
                    if (slide == 37){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng37));
                    }
                    if (slide == 38){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng38));
                    }
                    if (slide == 39){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng39));
                    }
                    if (slide == 40){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng40));
                    }
                    if (slide == 41){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng41));
                    }
                    if (slide == 42){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng42));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        btn9.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }
                    if (slide == 43){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng43));
                    }
                    if (slide == 44){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng44));
                    }
                    if (slide == 45){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng45));
                    }
                    if (slide == 46){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng46));
                    }
                    if (slide == 47){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng47));
                    }
                    if (slide == 48){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng48));
                    }
                    if (slide == 49){
                        rl.setBackground(getResources().getDrawable(R.drawable.ng49));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }
                    if (slide == 50 && ending == "1"){
                        mp6.stop();
                        mp7.start();

                        rl.setBackground(getResources().getDrawable(R.drawable.ng50));
                    }

                    if (slide == 51 && ending == "1"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng51));
                        btn5.setVisibility(View.INVISIBLE);
                        btn10.setVisibility(View.VISIBLE);
                    }
                    if (slide == 50 && ending == "2"){
                        mp6.stop();
                        mp7.start();

                        rl.setBackground(getResources().getDrawable(R.drawable.ng53));
                    }
                    if (slide == 51 && ending == "2"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng54));
                    }
                    if (slide == 52 && ending == "2"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng55));
                    }
                    if (slide == 53 && ending == "2"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng56));
                    }
                    if (slide == 54 && ending == "2"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng57));
                    }
                    if (slide == 55 && ending == "2"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng58));
                    }
                    if (slide == 56 && ending == "2"){
                      mp7.stop();
                        rl.setBackground(getResources().getDrawable(R.drawable.ng59));
                    }
                    if (slide == 57 && ending == "2"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng60));
                    }
                    if (slide == 58 && ending == "2"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng61));
                    }
                    if (slide == 59 && ending == "2"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng62));
                    }
                    if (slide == 60 && ending == "2"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng63));
                    }
                    if (slide == 61 && ending == "2"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng64));
                    }
                    if (slide == 62 && ending == "2"){
                            mp8.start();
                        rl.setBackground(getResources().getDrawable(R.drawable.ng65));
                    }
                    if (slide == 63 && ending == "2"){

                        rl.setBackground(getResources().getDrawable(R.drawable.ng66));
                        btn5.setVisibility(View.INVISIBLE);
                        btn10.setVisibility(View.VISIBLE);
                        ibtn.setVisibility(View.VISIBLE);
                    }









                }
                if (story == "online"){
                    RelativeLayout rl;
                    rl = (RelativeLayout) findViewById(R.id.activity_main);

                    if (slide == 1){
                        rl.setBackground(getResources().getDrawable(R.drawable.h1));
                    }
                    if (slide == 2){
                        rl.setBackground(getResources().getDrawable(R.drawable.h2));
                    }
                    if (slide == 3){
                        rl.setBackground(getResources().getDrawable(R.drawable.h3));
                    }
                    if (slide == 4){
                        rl.setBackground(getResources().getDrawable(R.drawable.h4));
                    }
                    if (slide == 5){
                        rl.setBackground(getResources().getDrawable(R.drawable.h5));
                    }
                    if (slide == 6){
                        rl.setBackground(getResources().getDrawable(R.drawable.h6));
                    }
                    if (slide == 7){
                        rl.setBackground(getResources().getDrawable(R.drawable.h7));
                    }
                    if (slide == 8){
                        rl.setBackground(getResources().getDrawable(R.drawable.h8));
                    }
                    if (slide == 9){
                        rl.setBackground(getResources().getDrawable(R.drawable.h9));
                    }
                    if (slide == 10){
                        rl.setBackground(getResources().getDrawable(R.drawable.h10));
                    }
                    if (slide == 11){
                        rl.setBackground(getResources().getDrawable(R.drawable.h11));
                    }
                    if (slide == 12){
                        rl.setBackground(getResources().getDrawable(R.drawable.h12));
                    }
                    if (slide == 13){
                        rl.setBackground(getResources().getDrawable(R.drawable.h13));
                    }
                    if (slide == 14){
                        rl.setBackground(getResources().getDrawable(R.drawable.h14));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        btn9.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);

                    }
                    if (slide == 15){
                        rl.setBackground(getResources().getDrawable(R.drawable.h15));
                    }
                    if (slide == 16){
                        rl.setBackground(getResources().getDrawable(R.drawable.h16));
                    }
                    if (slide == 17){
                        rl.setBackground(getResources().getDrawable(R.drawable.h17));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        btn9.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }
                    if (slide == 18){
                        rl.setBackground(getResources().getDrawable(R.drawable.h18));
                    }

                    if (slide == 19){
                        rl.setBackground(getResources().getDrawable(R.drawable.h19));
                    }

                    if (slide == 20){
                        rl.setBackground(getResources().getDrawable(R.drawable.h20));
                    }
                    if (slide == 21){
                        rl.setBackground(getResources().getDrawable(R.drawable.h21));
                    }
                    if (slide == 22){
                        rl.setBackground(getResources().getDrawable(R.drawable.h22));
                    }
                    if (slide == 23){
                        rl.setBackground(getResources().getDrawable(R.drawable.h23));
                    }
                    if (slide == 24){
                        rl.setBackground(getResources().getDrawable(R.drawable.h25));
                    }
                    if (slide == 25){
                        rl.setBackground(getResources().getDrawable(R.drawable.h26));
                    }
                    if (slide == 26){
                        rl.setBackground(getResources().getDrawable(R.drawable.h27));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        btn9.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }
                    if (slide == 27){
                        rl.setBackground(getResources().getDrawable(R.drawable.h28));
                    }
                    if (slide == 28){
                        rl.setBackground(getResources().getDrawable(R.drawable.h29));
                    }
                    if (slide == 29){
                        rl.setBackground(getResources().getDrawable(R.drawable.h30));
                    }
                    if (slide == 30){
                        rl.setBackground(getResources().getDrawable(R.drawable.h31));
                    }
                    if (slide == 31){
                        rl.setBackground(getResources().getDrawable(R.drawable.h32));
                    }
                    if (slide == 32){
                        rl.setBackground(getResources().getDrawable(R.drawable.h33));
                    }
                    if (slide == 33){
                        rl.setBackground(getResources().getDrawable(R.drawable.h34));
                    }
                    if (slide == 34){
                        rl.setBackground(getResources().getDrawable(R.drawable.h35));
                    }
                    if (slide == 35){
                        rl.setBackground(getResources().getDrawable(R.drawable.h36));
                    }
                    if (slide == 36){
                        rl.setBackground(getResources().getDrawable(R.drawable.h37));
                    }
                    if (slide == 37){
                        rl.setBackground(getResources().getDrawable(R.drawable.h38));
                    }
                    if (slide == 38){
                        rl.setBackground(getResources().getDrawable(R.drawable.h39));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        btn9.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }
                    if (slide == 39){
                        rl.setBackground(getResources().getDrawable(R.drawable.h40));
                    }
                    if (slide == 40){
                        rl.setBackground(getResources().getDrawable(R.drawable.h41));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                       // btn8.setVisibility(View.VISIBLE);
                       // btn9.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }

                    if (slide == 41 && ending == "1"){
                        mp5.stop();
                        mp2.start();
                        rl.setBackground(getResources().getDrawable(R.drawable.h43));
                    }
                    if (slide == 42 && ending == "1"){
                        rl.setBackground(getResources().getDrawable(R.drawable.h44));
                        btn5.setVisibility(View.INVISIBLE);
                        btn10.setVisibility(View.VISIBLE);
                    }
                    if (slide == 41 && ending == "2"){
                        rl.setBackground(getResources().getDrawable(R.drawable.h42));

                        btn5.setVisibility(View.INVISIBLE);
                        btn10.setVisibility(View.VISIBLE);
                    }









                }
                if (story == "plant"){
                    RelativeLayout rl;
                    rl = (RelativeLayout) findViewById(R.id.activity_main);


                if (slide == 1){
                    rl.setBackground(getResources().getDrawable(R.drawable.t0));
                }
                    if (slide == 2){
                        rl.setBackground(getResources().getDrawable(R.drawable.t1));
                    }
                    if (slide == 3){
                        rl.setBackground(getResources().getDrawable(R.drawable.t2));
                    }
                    if (slide == 4){
                        rl.setBackground(getResources().getDrawable(R.drawable.t3));
                    }

                    if (slide == 5){
                        rl.setBackground(getResources().getDrawable(R.drawable.t4));
                    }

                    if (slide == 6){
                        rl.setBackground(getResources().getDrawable(R.drawable.t5));
                    }


                    if (slide == 7){
                        rl.setBackground(getResources().getDrawable(R.drawable.t6));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        btn9.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }

                    if (slide == 8){
                        rl.setBackground(getResources().getDrawable(R.drawable.t7));
                    }
                    if (slide == 9){
                        rl.setBackground(getResources().getDrawable(R.drawable.t8));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        btn9.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }
                    if (slide == 10){
                        rl.setBackground(getResources().getDrawable(R.drawable.t9));
                    }
                    if (slide == 11){
                        rl.setBackground(getResources().getDrawable(R.drawable.t8));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        btn9.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }
                    if (slide == 12){
                        rl.setBackground(getResources().getDrawable(R.drawable.t10));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }

                    if (slide == 13){
                        rl.setBackground(getResources().getDrawable(R.drawable.t11));
                    }
                    if (slide == 14){
                        rl.setBackground(getResources().getDrawable(R.drawable.t12));
                    }

                    if (slide == 15){
                        rl.setBackground(getResources().getDrawable(R.drawable.t13));
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.INVISIBLE);
                    }

                    if (ending == "1" && slide == 16 ){
                        rl.setBackground(getResources().getDrawable(R.drawable.t14));
                        btn5.setVisibility(View.INVISIBLE);
                        btn10.setVisibility(View.VISIBLE);
                    }

                    if (ending == "2"&& slide == 16 ){
                        rl.setBackground(getResources().getDrawable(R.drawable.t15));

                    }
                    if(slide == 17&& ending == "2"){
                        rl.setBackground(getResources().getDrawable(R.drawable.t16));
                    }
                    if(slide == 18 && ending == "2"){
                        rl.setBackground(getResources().getDrawable(R.drawable.t17));
                        btn5.setVisibility(View.INVISIBLE);
                        btn10.setVisibility(View.VISIBLE);

                    }

                    if (ending == "3" && slide == 16 ){
                        rl.setBackground(getResources().getDrawable(R.drawable.t14));
                        btn5.setVisibility(View.INVISIBLE);
                        btn10.setVisibility(View.VISIBLE);
                    }





                }
            }
        });

    }

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11;

    String story;
    String ending;
    int score = 0;
    int slide = 0;


    public void choice1(View ch1) {
        score+= 0;
       // slide++;
        TextView t1 = (TextView) findViewById(R.id.slide);
        t1.setText(Integer.toString(slide));
        btn6.setVisibility(View.INVISIBLE);
        btn7.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
        btn9.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.VISIBLE);
        ending = "1";
    }

    public void choice2(View ch2) {
        score+= 1;
       // slide++;
        TextView t1 = (TextView) findViewById(R.id.slide);
        t1.setText(Integer.toString(slide));
        btn6.setVisibility(View.INVISIBLE);
        btn7.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
        btn9.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.VISIBLE);
        ending = "2";
    }
    public void choice3(View ch3) {
        score+= 2;
        //slide++;
        TextView t1 = (TextView) findViewById(R.id.slide);
        t1.setText(Integer.toString(slide));
        btn6.setVisibility(View.INVISIBLE);
        btn7.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
        btn9.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.VISIBLE);
        ending = "3";
    }
    public void choice4(View ch4) {
        score+= 3;
       // slide++;
        TextView t1 = (TextView) findViewById(R.id.slide);
        t1.setText(Integer.toString(slide));
        btn6.setVisibility(View.INVISIBLE);
        btn7.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
        btn9.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.VISIBLE);
        ending = "4";
    }






}


