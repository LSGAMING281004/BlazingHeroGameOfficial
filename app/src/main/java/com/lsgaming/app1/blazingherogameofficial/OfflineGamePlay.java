package com.lsgaming.app1.blazingherogameofficial;

import android.annotation.SuppressLint;
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
    TextView textView1,textView2;
    int min;
    int max;

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

        book1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                book1.setVisibility(View.GONE);
                book2.setVisibility(View.VISIBLE);
                relativeLayout.setBackground(getResources().getDrawable(R.drawable.red_bg));
                min = 1;
                max = 5;
                int randomNumber = random.nextInt((max - min) + 1) + min;
                textView1.setText(String.valueOf(randomNumber));
                textView2.setText("");
            }
        });
        book2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                book2.setVisibility(View.GONE);
                book1.setVisibility(View.VISIBLE);
                relativeLayout.setBackground(getResources().getDrawable(R.drawable.blue_bg));
                min = 6;
                max = 10;
                int randomNumber = random.nextInt((max - min) + 1) + min;
                textView2.setText(String.valueOf(randomNumber));
                textView1.setText("");
            }
        });

    }

}