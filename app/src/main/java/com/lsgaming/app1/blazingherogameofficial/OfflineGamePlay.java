package com.lsgaming.app1.blazingherogameofficial;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class OfflineGamePlay extends AppCompatActivity {
    View view1,view2,view3,view4,view5,view6,view7,view8,view9,view10;
    ImageView book1,book2;
    Random random;
    TextView textView1,textView2,attacktv;
    int min = 0,max = 5;
    int randomNumber;
    int b1=0,b2=0,b3=0,b4=0,b5=0,r1=0,r2=0,r3=0,r4=0,r5=0;

    ImageView bh1,bh2,bh3,bh4,bh5,rh1,rh2,rh3,rh4,rh5;
    ImageView bb1,bb2,bb3,bb4,bb5,rb1,rb2,rb3,rb4,rb5;
    ImageView bl1,bl2,bl3,bl4,bl5,rl1,rl2,rl3,rl4,rl5;
    ImageView bf1,bf2,bf3,bf4,bf5,rf1,rf2,rf3,rf4,rf5;
    ImageView bg1,bg2,bg3,bg4,bg5,rg1,rg2,rg3,rg4,rg5;
    Boolean blueplace1=false,blueplace2=false,blueplace3=false,blueplace4=false,blueplace5=false,redplace1=false,redplace2=false,redplace3=false,redplace4=false,redplace5=false;

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

        RelativeLayout relativeLayout = findViewById(R.id.main);

        random = new Random();

        textView1 = findViewById(R.id.blue_tv);
        textView2 = findViewById(R.id.red_tv);
        attacktv = findViewById(R.id.attackview);

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
                relativeLayout.setBackground(getResources().getDrawable(R.drawable.red_bg));
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
                relativeLayout.setBackground(getResources().getDrawable(R.drawable.blue_bg));
                randomNumber = random.nextInt((max - min) + 1) + min;
                textView2.setText(String.valueOf(randomNumber));
                textView1.setText("");
                setUpRedside();
            }
        });

    }

    public void setUpBlueside()
    {
        if(randomNumber==1) {
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
            }
            b1++;
        } else if (randomNumber==2) {
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
            }
            b2++;
        } else if (randomNumber==3) {
            bh3.setVisibility(View.VISIBLE);
            if(b3==1)
                bb3.setVisibility(View.VISIBLE);
            if(b3==2)
                bl3.setVisibility(View.VISIBLE);
            if(b3==3)
                bf3.setVisibility(View.VISIBLE);
            if(b3==4) {
                bg3.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
            }
            b3++;
        }else if (randomNumber==4) {
            bh4.setVisibility(View.VISIBLE);
            if(b4==1)
                bb4.setVisibility(View.VISIBLE);
            if(b4==2)
                bl4.setVisibility(View.VISIBLE);
            if(b4==3)
                bf4.setVisibility(View.VISIBLE);
            if(b4==4) {
                bg4.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
            }
            b4++;
        }else if (randomNumber==5) {
            bh5.setVisibility(View.VISIBLE);
            if(b5==1)
                bb5.setVisibility(View.VISIBLE);
            if(b5==2)
                bl5.setVisibility(View.VISIBLE);
            if(b5==3)
                bf5.setVisibility(View.VISIBLE);
            if(b5==4) {
                bg5.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
            }
            b5++;
        }
    }

    public void setUpRedside()
    {
        if(randomNumber==1) {
            rh1.setVisibility(View.VISIBLE);
            if(r1==1)
                rb1.setVisibility(View.VISIBLE);
            if(r1==2)
                rl1.setVisibility(View.VISIBLE);
            if(r1==3)
                rf1.setVisibility(View.VISIBLE);
            if(r1==4) {
                rg1.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
            }

            r1++;
        } else if (randomNumber==2) {
            rh2.setVisibility(View.VISIBLE);
            if(r2==1)
                rb2.setVisibility(View.VISIBLE);
            if(r2==2)
                rl2.setVisibility(View.VISIBLE);
            if(r2==3)
                rf2.setVisibility(View.VISIBLE);
            if(r2==4) {
                rg2.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
            }
            r2++;
        } else if (randomNumber==3) {
            rh3.setVisibility(View.VISIBLE);
            if(r3==1)
                rb3.setVisibility(View.VISIBLE);
            if(r3==2)
                rl3.setVisibility(View.VISIBLE);
            if(r3==3)
                rf3.setVisibility(View.VISIBLE);
            if(r3==4) {
                rg3.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
            }
            r3++;
        }else if (randomNumber==4) {
            rh4.setVisibility(View.VISIBLE);
            if(r4==1)
                rb4.setVisibility(View.VISIBLE);
            if(r4==2)
                rl4.setVisibility(View.VISIBLE);
            if(r4==3)
                rf4.setVisibility(View.VISIBLE);
            if(r4==4) {
                rg4.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
            }
            r4++;
        }else if (randomNumber==5) {
            rh5.setVisibility(View.VISIBLE);
            if(r5==1)
                rb5.setVisibility(View.VISIBLE);
            if(r5==2)
                rl5.setVisibility(View.VISIBLE);
            if(r5==3)
                rf5.setVisibility(View.VISIBLE);
            if(r5==4) {
                rg5.setVisibility(View.VISIBLE);
                attacktv.setVisibility(View.VISIBLE);
                book1.setEnabled(false);
                book2.setEnabled(false);
            }
            r5++;
        }
    }

}