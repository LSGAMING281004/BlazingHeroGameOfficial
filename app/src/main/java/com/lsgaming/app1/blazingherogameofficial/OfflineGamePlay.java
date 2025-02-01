package com.lsgaming.app1.blazingherogameofficial;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class OfflineGamePlay extends AppCompatActivity {
    View view1,view2,view3,view4,view5,view6,view7,view8,view9,view10;
    ImageView book1,book2;
    Random random;
    TextView textView1,textView2,attacktv,blue_header,red_header;
    int min = 1,max = 5;
    int randomNumber,blue_kills=0,red_kills=0;
    int b1=0,b2=0,b3=0,b4=0,b5=0,r1=0,r2=0,r3=0,r4=0,r5=0;
    String winplayer="";

    ImageView bh1,bh2,bh3,bh4,bh5,rh1,rh2,rh3,rh4,rh5;
    ImageView bb1,bb2,bb3,bb4,bb5,rb1,rb2,rb3,rb4,rb5;
    ImageView bl1,bl2,bl3,bl4,bl5,rl1,rl2,rl3,rl4,rl5;
    ImageView bf1,bf2,bf3,bf4,bf5,rf1,rf2,rf3,rf4,rf5;
    ImageView bg1,bg2,bg3,bg4,bg5,rg1,rg2,rg3,rg4,rg5;
    Boolean blueplace1=false,blueplace2=false,blueplace3=false,blueplace4=false,blueplace5=false,redplace1=false,redplace2=false,redplace3=false,redplace4=false,redplace5=false;

    GradientDrawable drawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_offline_game_play);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        random = new Random();

        textView1 = findViewById(R.id.blue_tv);
        textView2 = findViewById(R.id.red_tv);
        attacktv = findViewById(R.id.attackview);
        blue_header = findViewById(R.id.blue_header);
        red_header = findViewById(R.id.red_header);

        view1 = findViewById(R.id.blueplayer1);
        view2 = findViewById(R.id.blueplayer2);
        view3 = findViewById(R.id.blueplayer3);
        view4 = findViewById(R.id.blueplayer4);
        view5 = findViewById(R.id.blueplayer5);

        view6 = findViewById(R.id.redplayer1);
        view7 = findViewById(R.id.redplayer2);
        view8 = findViewById(R.id.redplayer3);
        view9 = findViewById(R.id.redplayer4);
        view10 = findViewById(R.id.redplayer5);

        view1.setEnabled(false);
        view2.setEnabled(false);
        view3.setEnabled(false);
        view4.setEnabled(false);
        view5.setEnabled(false);
        view6.setEnabled(false);
        view7.setEnabled(false);
        view8.setEnabled(false);
        view9.setEnabled(false);
        view10.setEnabled(false);

        book1 = findViewById(R.id.blue_book);
        book2 = findViewById(R.id.red_book);

        bh1 = findViewById(R.id.bh1);
        bh2 = findViewById(R.id.bh2);
        bh3 = findViewById(R.id.bh3);
        bh4 = findViewById(R.id.bh4);
        bh5 = findViewById(R.id.bh5);
        rh1 = findViewById(R.id.rh1);
        rh2 = findViewById(R.id.rh2);
        rh3 = findViewById(R.id.rh3);
        rh4 = findViewById(R.id.rh4);
        rh5 = findViewById(R.id.rh5);

        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bb3 = findViewById(R.id.bb3);
        bb4 = findViewById(R.id.bb4);
        bb5 = findViewById(R.id.bb5);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        rb5 = findViewById(R.id.rb5);

        bl1 = findViewById(R.id.bl1);
        bl2 = findViewById(R.id.bl2);
        bl3 = findViewById(R.id.bl3);
        bl4 = findViewById(R.id.bl4);
        bl5 = findViewById(R.id.bl5);
        rl1 = findViewById(R.id.rl1);
        rl2 = findViewById(R.id.rl2);
        rl3 = findViewById(R.id.rl3);
        rl4 = findViewById(R.id.rl4);
        rl5 = findViewById(R.id.rl5);

        bf1 = findViewById(R.id.bf1);
        bf2 = findViewById(R.id.bf2);
        bf3 = findViewById(R.id.bf3);
        bf4 = findViewById(R.id.bf4);
        bf5 = findViewById(R.id.bf5);
        rf1 = findViewById(R.id.rf1);
        rf2 = findViewById(R.id.rf2);
        rf3 = findViewById(R.id.rf3);
        rf4 = findViewById(R.id.rf4);
        rf5 = findViewById(R.id.rf5);

        bg1 = findViewById(R.id.bg1);
        bg2 = findViewById(R.id.bg2);
        bg3 = findViewById(R.id.bg3);
        bg4 = findViewById(R.id.bg4);
        bg5 = findViewById(R.id.bg5);
        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);
        rg4 = findViewById(R.id.rg4);
        rg5 = findViewById(R.id.rg5);


        //All player images hide
        bh1.setVisibility(View.GONE);
        bh2.setVisibility(View.GONE);
        bh3.setVisibility(View.GONE);
        bh4.setVisibility(View.GONE);
        bh5.setVisibility(View.GONE);
        rh1.setVisibility(View.GONE);
        rh2.setVisibility(View.GONE);
        rh3.setVisibility(View.GONE);
        rh4.setVisibility(View.GONE);
        rh5.setVisibility(View.GONE);

        bb1.setVisibility(View.GONE);
        bb2.setVisibility(View.GONE);
        bb3.setVisibility(View.GONE);
        bb4.setVisibility(View.GONE);
        bb5.setVisibility(View.GONE);
        rb1.setVisibility(View.GONE);
        rb2.setVisibility(View.GONE);
        rb3.setVisibility(View.GONE);
        rb4.setVisibility(View.GONE);
        rb5.setVisibility(View.GONE);

        bl1.setVisibility(View.GONE);
        bl2.setVisibility(View.GONE);
        bl3.setVisibility(View.GONE);
        bl4.setVisibility(View.GONE);
        bl5.setVisibility(View.GONE);
        rl1.setVisibility(View.GONE);
        rl2.setVisibility(View.GONE);
        rl3.setVisibility(View.GONE);
        rl4.setVisibility(View.GONE);
        rl5.setVisibility(View.GONE);

        bf1.setVisibility(View.GONE);
        bf2.setVisibility(View.GONE);
        bf3.setVisibility(View.GONE);
        bf4.setVisibility(View.GONE);
        bf5.setVisibility(View.GONE);
        rf1.setVisibility(View.GONE);
        rf2.setVisibility(View.GONE);
        rf3.setVisibility(View.GONE);
        rf4.setVisibility(View.GONE);
        rf5.setVisibility(View.GONE);

        bg1.setVisibility(View.GONE);
        bg2.setVisibility(View.GONE);
        bg3.setVisibility(View.GONE);
        bg4.setVisibility(View.GONE);
        bg5.setVisibility(View.GONE);
        rg1.setVisibility(View.GONE);
        rg2.setVisibility(View.GONE);
        rg3.setVisibility(View.GONE);
        rg4.setVisibility(View.GONE);
        rg5.setVisibility(View.GONE);

        attacktv.setVisibility(View.GONE);

        drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE);
        drawable.setStroke(5, Color.YELLOW); // Set the outline color and width here
        drawable.setColor(Color.TRANSPARENT);

        MediaPlayer mp1 = MediaPlayer.create(this,R.raw.pressx);
        MediaPlayer mp2 = MediaPlayer.create(this,R.raw.presso);
        mp1.setVolume(0.1f, 0.1f);
        mp2.setVolume(0.1f, 0.1f);

        book1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                mp1.start();
                book1.setVisibility(View.GONE);
                book2.setVisibility(View.VISIBLE);
                red_header.setBackgroundColor(Color.RED);
                blue_header.setBackgroundColor(Color.TRANSPARENT);
                randomNumber = random.nextInt((max - min) + 1) + min;
                textView1.setText(String.valueOf(randomNumber));
                textView2.setText("");
                setUpBlueside();
            }
        });
        book2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                mp2.start();
                book2.setVisibility(View.GONE);
                book1.setVisibility(View.VISIBLE);
                blue_header.setBackgroundColor(Color.BLUE);
                red_header.setBackgroundColor(Color.TRANSPARENT);
                randomNumber = random.nextInt((max - min) + 1) + min;
                textView2.setText(String.valueOf(randomNumber));
                textView1.setText("");
                setUpRedside();
            }
        });

    }

    public void setUpBlueside()
    {
        if(randomNumber==1 && !blueplace1) {
            bh1.setVisibility(View.VISIBLE);
            if(b1==1)
                bb1.setVisibility(View.VISIBLE);
            if(b1==2)
                bl1.setVisibility(View.VISIBLE);
            if(b1==3)
                bf1.setVisibility(View.VISIBLE);
            if(b1>=4) {
                bg1.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
                blueAttackLogic();
            }
            b1++;
        } else if (randomNumber==2 && !blueplace2) {
            bh2.setVisibility(View.VISIBLE);
            if(b2==1)
                bb2.setVisibility(View.VISIBLE);
            if(b2==2)
                bl2.setVisibility(View.VISIBLE);
            if(b2==3)
                bf2.setVisibility(View.VISIBLE);
            if(b2>=4) {
                bg2.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
                blueAttackLogic();
            }
            b2++;
        } else if (randomNumber==3 && !blueplace3) {
            bh3.setVisibility(View.VISIBLE);
            if(b3==1)
                bb3.setVisibility(View.VISIBLE);
            if(b3==2)
                bl3.setVisibility(View.VISIBLE);
            if(b3==3)
                bf3.setVisibility(View.VISIBLE);
            if(b3>=4) {
                bg3.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
                blueAttackLogic();
            }
            b3++;
        }else if (randomNumber==4  && !blueplace4) {
            bh4.setVisibility(View.VISIBLE);
            if(b4==1)
                bb4.setVisibility(View.VISIBLE);
            if(b4==2)
                bl4.setVisibility(View.VISIBLE);
            if(b4==3)
                bf4.setVisibility(View.VISIBLE);
            if(b4>=4) {
                bg4.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
                blueAttackLogic();
            }
            b4++;
        }else if (randomNumber==5 && !blueplace5) {
            bh5.setVisibility(View.VISIBLE);
            if(b5==1)
                bb5.setVisibility(View.VISIBLE);
            if(b5==2)
                bl5.setVisibility(View.VISIBLE);
            if(b5==3)
                bf5.setVisibility(View.VISIBLE);
            if(b5>=4) {
                bg5.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
                blueAttackLogic();
            }
            b5++;
        }
    }

    public void setUpRedside()
    {
        if(randomNumber==1 && !redplace1) {
            rh1.setVisibility(View.VISIBLE);
            if(r1==1)
                rb1.setVisibility(View.VISIBLE);
            if(r1==2)
                rl1.setVisibility(View.VISIBLE);
            if(r1==3)
                rf1.setVisibility(View.VISIBLE);
            if(r1>=4) {
                rg1.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
                redAttackLogic();
            }

            r1++;
        } else if (randomNumber==2 && !redplace2) {
            rh2.setVisibility(View.VISIBLE);
            if(r2==1)
                rb2.setVisibility(View.VISIBLE);
            if(r2==2)
                rl2.setVisibility(View.VISIBLE);
            if(r2==3)
                rf2.setVisibility(View.VISIBLE);
            if(r2>=4) {
                rg2.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
                redAttackLogic();
            }
            r2++;
        } else if (randomNumber==3 && !redplace3) {
            rh3.setVisibility(View.VISIBLE);
            if(r3==1)
                rb3.setVisibility(View.VISIBLE);
            if(r3==2)
                rl3.setVisibility(View.VISIBLE);
            if(r3==3)
                rf3.setVisibility(View.VISIBLE);
            if(r3>=4) {
                rg3.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
                redAttackLogic();
            }
            r3++;
        }else if (randomNumber==4 && !redplace4) {
            rh4.setVisibility(View.VISIBLE);
            if(r4==1)
                rb4.setVisibility(View.VISIBLE);
            if(r4==2)
                rl4.setVisibility(View.VISIBLE);
            if(r4==3)
                rf4.setVisibility(View.VISIBLE);
            if(r4>=4) {
                rg4.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
                redAttackLogic();

            }
            r4++;
        }else if (randomNumber==5 && !redplace5) {
            rh5.setVisibility(View.VISIBLE);
            if(r5==1)
                rb5.setVisibility(View.VISIBLE);
            if(r5==2)
                rl5.setVisibility(View.VISIBLE);
            if(r5==3)
                rf5.setVisibility(View.VISIBLE);
            if(r5>=4) {
                rg5.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
                redAttackLogic();
            }
            r5++;
        }
    }

    void blueAttackLogic()
    {
        if(!redplace1)
        {
            view6.setEnabled(true);
            view6.setBackground(drawable);
            view6.setOnClickListener(view -> {
                redplace1 = true;
                view6.setEnabled(false);
                view6.setBackgroundColor(Color.GRAY);
                blue_kills++;
                resetBlueRule();
                killCount();
            });
        }
        if(!redplace2)
        {
            view7.setEnabled(true);
            view7.setBackground(drawable);
            view7.setOnClickListener(view -> {
                redplace2 = true;
                view7.setEnabled(false);
                view7.setBackgroundColor(Color.GRAY);
                blue_kills++;
                resetBlueRule();
                killCount();
            });
        }
        if(!redplace3)
        {
            view8.setEnabled(true);
            view8.setBackground(drawable);
            view8.setOnClickListener(view -> {
                redplace3 = true;
                view8.setEnabled(false);
                view8.setBackgroundColor(Color.GRAY);
                blue_kills++;
                resetBlueRule();
                killCount();
            });
        }
        if(!redplace4)
        {
            view9.setEnabled(true);
            view9.setBackground(drawable);
            view9.setOnClickListener(view -> {
                redplace4 = true;
                view9.setEnabled(false);
                view9.setBackgroundColor(Color.GRAY);
                blue_kills++;
                resetBlueRule();
                killCount();
            });
        }
        if(!redplace5)
        {
            view10.setEnabled(true);
            view10.setBackground(drawable);
            view10.setOnClickListener(view -> {
                redplace5 = true;
                view10.setEnabled(false);
                view10.setBackgroundColor(Color.GRAY);
                blue_kills++;
                resetBlueRule();
                killCount();
            });
        }
    }
    void redAttackLogic()
    {
        if(!blueplace1)
        {
            view1.setEnabled(true);
            view1.setBackground(drawable);
            view1.setOnClickListener(view -> {
                blueplace1 = true;
                view1.setEnabled(false);
                view1.setBackgroundColor(Color.GRAY);
                red_kills++;
                resetBlueRule();
                killCount();
            });
        }
        if(!blueplace2)
        {
            view2.setEnabled(true);
            view2.setBackground(drawable);
            view2.setOnClickListener(view -> {
                blueplace2 = true;
                view2.setEnabled(false);
                view2.setBackgroundColor(Color.GRAY);
                red_kills++;
                resetBlueRule();
                killCount();
            });
        }
        if(!blueplace3)
        {
            view3.setEnabled(true);
            view3.setBackground(drawable);
            view3.setOnClickListener(view -> {
                blueplace3 = true;
                view3.setEnabled(false);
                view3.setBackgroundColor(Color.GRAY);
                red_kills++;
                resetBlueRule();
                killCount();
            });
        }
        if(!blueplace4)
        {
            view4.setEnabled(true);
            view4.setBackground(drawable);
            view4.setOnClickListener(view -> {
                blueplace4 = true;
                view4.setEnabled(false);
                view4.setBackgroundColor(Color.GRAY);
                red_kills++;
                resetBlueRule();
                killCount();
            });
        }
        if(!blueplace5)
        {
            view5.setEnabled(true);
            view5.setBackground(drawable);
            view5.setOnClickListener(view -> {
                blueplace5 = true;
                view5.setEnabled(false);
                view5.setBackgroundColor(Color.GRAY);
                red_kills++;
                resetBlueRule();
                killCount();
            });
        }
    }

    private void gameOverAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Game Over");
        builder.setMessage(winplayer);
        builder.setPositiveButton("Restart", (dialog, which) -> {
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        });
        builder.setNegativeButton("Home", (dialog, which) -> finish());

        AlertDialog alertDialog = builder.create();
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }

    //Back button pressed
    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        MediaPlayer mpq = MediaPlayer.create(this,R.raw.quite);
        mpq.setVolume(0.1f, 0.1f);
        mpq.start();
        // Create a dialog to confirm exit
        new AlertDialog.Builder(this)
                .setTitle("End Game")
                .setMessage("Are you sure you want to Exit Gameplay?")
                .setPositiveButton(android.R.string.yes, (dialog, which) -> {
                    // Exit the activity
                    OfflineGamePlay.super.onBackPressed();
                })
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }



    void resetBlueRule()
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.gunshot);
        mediaPlayer.setVolume(0.1f, 0.1f);
        mediaPlayer.start();

        if((blueplace1 && blueplace2 && blueplace3 && blueplace4 && blueplace5)) {
            winplayer="Red Player Win";
            gameOverAlert();
        }
        if((redplace1 && redplace2 && redplace3 && redplace4 && redplace5)){
            winplayer="Blue Player Win";
            gameOverAlert();
        }

        if(!blueplace1)
            view1.setBackgroundResource(R.drawable.blue_bg);
        if(!blueplace2)
            view2.setBackgroundResource(R.drawable.blue_bg);
        if(!blueplace3)
            view3.setBackgroundResource(R.drawable.blue_bg);
        if(!blueplace4)
            view4.setBackgroundResource(R.drawable.blue_bg);
        if(!blueplace5)
            view5.setBackgroundResource(R.drawable.blue_bg);

        if (!redplace1)
            view6.setBackgroundResource(R.drawable.red_bg);
        if (!redplace2)
            view7.setBackgroundResource(R.drawable.red_bg);
        if (!redplace3)
            view8.setBackgroundResource(R.drawable.red_bg);
        if(!redplace4)
            view9.setBackgroundResource(R.drawable.red_bg);
        if(!redplace5)
            view10.setBackgroundResource(R.drawable.red_bg);


        view1.setEnabled(false);
        view2.setEnabled(false);
        view3.setEnabled(false);
        view4.setEnabled(false);
        view5.setEnabled(false);
        view6.setEnabled(false);
        view7.setEnabled(false);
        view8.setEnabled(false);
        view9.setEnabled(false);
        view10.setEnabled(false);
        attacktv.setVisibility(View.GONE);
        book1.setEnabled(true);
        book2.setEnabled(true);
    }

    void killCount()
    {
        blue_header.setText("Kill:"+blue_kills);
        red_header.setText("Kill:"+red_kills);
    }

}