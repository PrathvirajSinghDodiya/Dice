package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    LottieAnimationView lottieAnimationViewDice, lottieAnimationViewNum;
    TextView textView, textView1, textView2, textView3;
    TextView textViewOne, textViewTwo, textViewFour, textViewThree;
    ImageView imageView;
    int player = 0;
    MediaPlayer mediaPlayer,mediaPlayer1;


    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mediaPlayer = MediaPlayer.create(this,R.raw.magic);
        mediaPlayer1 = MediaPlayer.create(this,R.raw.countdown);
        lottieAnimationViewDice = findViewById(R.id.lottieAnimationView2);
        lottieAnimationViewNum = findViewById(R.id.num);
        textView = findViewById(R.id.textViewO);
        textView1 = findViewById(R.id.textViewT);
        textView2 = findViewById(R.id.textViewC);
        textView3 = findViewById(R.id.textViewD);
        imageView = findViewById(R.id.imageView3);
        textView.setTextColor(getResources().getColor(R.color.teal_700));
        Random random = new Random();
        lottieAnimationViewDice.setAnimation(R.raw.tap);
        lottieAnimationViewDice.loop(true);
        lottieAnimationViewDice.playAnimation();
        lottieAnimationViewNum.setAnimation(R.raw.counting);
        lottieAnimationViewNum.setSpeed(0.9f);


        dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_box);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        textViewOne = dialog.findViewById(R.id.text1);
        textViewTwo = dialog.findViewById(R.id.text21);
        textViewThree = dialog.findViewById(R.id.text3);
        textViewFour = dialog.findViewById(R.id.text4);
        dialog.show();


        textViewOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lottieAnimationViewNum.setAnimation(R.raw.counting);
                mediaPlayer1.start();
                lottieAnimationViewNum.playAnimation();
                dialog.dismiss();
                textView1.setText("");
                textView.setText("A");
                textView.setTextColor(getResources().getColor(R.color.teal_700));

            textView2.setText("");
            textView3.setText("");
            for (int i = 0; i < 2; i++) {
                lottieAnimationViewDice.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaPlayer.start();
                        lottieAnimationViewDice.loop(false);
                        lottieAnimationViewDice.setAnimation(R.raw.dice);


                        lottieAnimationViewDice.playAnimation();
                        lottieAnimationViewDice.setSpeed(2);
                        int num = random.nextInt(6) + 1;
                        if (num == 1) {
                            lottieAnimationViewNum.setAnimation(R.raw.one);
                        } else if (num == 2) {
                            lottieAnimationViewNum.setAnimation(R.raw.two);
                        } else if (num == 3) {
                            lottieAnimationViewNum.setAnimation(R.raw.three);
                        } else if (num == 4) {
                            lottieAnimationViewNum.setAnimation(R.raw.four);
                        } else if (num == 5) {
                            lottieAnimationViewNum.setAnimation(R.raw.five);
                        }
                        if (num == 6) {
                            lottieAnimationViewNum.setAnimation(R.raw.six);
                        }
                        lottieAnimationViewNum.playAnimation();
                    }
                });
            }
            }
        });
        textViewTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                lottieAnimationViewNum.setAnimation(R.raw.counting);
                mediaPlayer1.start();
                lottieAnimationViewNum.playAnimation();
                textView2.setText("");
                textView1.setText("B");
                textView3.setText("");
                dialog.dismiss();
                for (int i = 0; i < 2; i++) {
                    lottieAnimationViewDice.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mediaPlayer.start();
                            lottieAnimationViewDice.loop(false);
                            lottieAnimationViewDice.setAnimation(R.raw.dice);


                            if(player==0){
                                textView1.setTextColor(getResources().getColor(R.color.teal_700));
                                textView.setTextColor(getResources().getColor(R.color.white));
                                player++;
                            }
                            else if(player==1){
                                textView.setTextColor(getResources().getColor(R.color.teal_700));
                                textView1.setTextColor(getResources().getColor(R.color.white));
                                player=0;
                            }

                            lottieAnimationViewDice.playAnimation();
                            lottieAnimationViewDice.setSpeed(2);
                            int num = random.nextInt(6) + 1;
                            if (num == 1) {
                                lottieAnimationViewNum.setAnimation(R.raw.one);
                            } else if (num == 2) {
                                lottieAnimationViewNum.setAnimation(R.raw.two);
                            } else if (num == 3) {
                                lottieAnimationViewNum.setAnimation(R.raw.three);
                            } else if (num == 4) {
                                lottieAnimationViewNum.setAnimation(R.raw.four);
                            } else if (num == 5) {
                                lottieAnimationViewNum.setAnimation(R.raw.five);
                            }
                            if (num == 6) {
                                lottieAnimationViewNum.setAnimation(R.raw.six);
                            }
                            lottieAnimationViewNum.playAnimation();

                        }
                    });
                }
            }
        });
        textViewThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();

                lottieAnimationViewNum.setAnimation(R.raw.counting);
                lottieAnimationViewNum.playAnimation();
                dialog.dismiss();
                textView2.setText("C");
                textView1.setText("B");
                textView3.setText("");
                for (int i = 0; i < 2; i++) {

                    lottieAnimationViewDice.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mediaPlayer.start();
                            lottieAnimationViewDice.loop(false);
                            lottieAnimationViewDice.setAnimation(R.raw.dice);


                            if(player==0){
                                textView1.setTextColor(getResources().getColor(R.color.teal_700));
                                textView.setTextColor(getResources().getColor(R.color.white));
                                textView2.setTextColor(getResources().getColor(R.color.white));
                                player++;
                            }
                            else if(player==1){
                                textView2.setTextColor(getResources().getColor(R.color.teal_700));
                                textView1.setTextColor(getResources().getColor(R.color.white));
                                textView.setTextColor(getResources().getColor(R.color.white));
                                player++;
                            }
                            else if(player==2){
                                textView.setTextColor(getResources().getColor(R.color.teal_700));
                                textView1.setTextColor(getResources().getColor(R.color.white));
                                textView2.setTextColor(getResources().getColor(R.color.white));
                                player=0;
                            }

                            lottieAnimationViewDice.playAnimation();
                            lottieAnimationViewDice.setSpeed(2);
                            int num = random.nextInt(6) + 1;
                            if (num == 1) {
                                lottieAnimationViewNum.setAnimation(R.raw.one);
                            } else if (num == 2) {
                                lottieAnimationViewNum.setAnimation(R.raw.two);
                            } else if (num == 3) {
                                lottieAnimationViewNum.setAnimation(R.raw.three);
                            } else if (num == 4) {
                                lottieAnimationViewNum.setAnimation(R.raw.four);
                            } else if (num == 5) {
                                lottieAnimationViewNum.setAnimation(R.raw.five);
                            }
                            if (num == 6) {
                                lottieAnimationViewNum.setAnimation(R.raw.six);
                            }
                            lottieAnimationViewNum.playAnimation();

                        }
                    });
                }
            }
        });
        textViewFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();


                lottieAnimationViewNum.setAnimation(R.raw.counting);
                lottieAnimationViewNum.playAnimation();
                dialog.dismiss();
                textView2.setText("C");
                textView1.setText("B");
                textView3.setText("D");
                for (int i = 0; i < 2; i++) {
                    lottieAnimationViewDice.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mediaPlayer.start();
                            lottieAnimationViewDice.loop(false);
                            lottieAnimationViewDice.setAnimation(R.raw.dice);


                            if(player==0){
                                textView1.setTextColor(getResources().getColor(R.color.teal_700));
                                textView.setTextColor(getResources().getColor(R.color.white));
                                textView2.setTextColor(getResources().getColor(R.color.white));
                                textView3.setTextColor(getResources().getColor(R.color.white));
                                player++;
                            }
                            else if(player==1){
                                textView2.setTextColor(getResources().getColor(R.color.teal_700));
                                textView1.setTextColor(getResources().getColor(R.color.white));
                                textView.setTextColor(getResources().getColor(R.color.white));
                                textView3.setTextColor(getResources().getColor(R.color.white));
                                player++;
                            }
                            else if(player==2){
                                textView3.setTextColor(getResources().getColor(R.color.teal_700));
                                textView2.setTextColor(getResources().getColor(R.color.white));
                                textView1.setTextColor(getResources().getColor(R.color.white));
                                textView.setTextColor(getResources().getColor(R.color.white));
                                player++;
                            }
                            else if(player==3){
                                textView.setTextColor(getResources().getColor(R.color.teal_700));
                                textView1.setTextColor(getResources().getColor(R.color.white));
                                textView2.setTextColor(getResources().getColor(R.color.white));
                                textView3.setTextColor(getResources().getColor(R.color.white));
                                player=0;
                            }

                            lottieAnimationViewDice.playAnimation();
                            lottieAnimationViewDice.setSpeed(2);
                            int num = random.nextInt(6) + 1;
                            if (num == 1) {
                                lottieAnimationViewNum.setAnimation(R.raw.one);
                            } else if (num == 2) {
                                lottieAnimationViewNum.setAnimation(R.raw.two);
                            } else if (num == 3) {
                                lottieAnimationViewNum.setAnimation(R.raw.three);
                            } else if (num == 4) {
                                lottieAnimationViewNum.setAnimation(R.raw.four);
                            } else if (num == 5) {
                                lottieAnimationViewNum.setAnimation(R.raw.five);
                            }
                            if (num == 6) {
                                lottieAnimationViewNum.setAnimation(R.raw.six);
                            }
                            lottieAnimationViewNum.playAnimation();

                        }
                    });
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
                player=0;
                textView.setTextColor(getResources().getColor(R.color.teal_700));
                textView1.setTextColor(getResources().getColor(R.color.white));
                textView2.setTextColor(getResources().getColor(R.color.white));
                textView3.setTextColor(getResources().getColor(R.color.white));
                lottieAnimationViewDice.setAnimation(R.raw.tap);
                lottieAnimationViewDice.playAnimation();
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
        mediaPlayer1.pause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mediaPlayer1.start();
    }
}