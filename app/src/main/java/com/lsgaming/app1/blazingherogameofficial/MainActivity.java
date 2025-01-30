package com.lsgaming.app1.blazingherogameofficial;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button play_offline;
    Toolbar toolbar;
    MediaPlayer mp,mediaPlayer,mpq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mp = MediaPlayer.create(this,R.raw.pinksoldiers);
        mp.setLooping(true);
        mediaPlayer = MediaPlayer.create(this,R.raw.buttonclick);
        mp.setVolume(0.1f, 0.1f);
        mediaPlayer.setVolume(0.1f,0.1f);
        mp.start();


        //Toolbar menu setup
        toolbar = findViewById(R.id.tb);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null)
            getSupportActionBar().setDisplayShowTitleEnabled(false);

        play_offline = findViewById(R.id.play_offline);
        play_offline.setOnClickListener(v -> {
            mediaPlayer.start();
            mp.pause();
            startActivity(new Intent(this, OfflineGamePlay.class));
        });


    }
    @Override
    protected void onStart() {
        super.onStart();
        // Start or resume playback
        if (mp != null) {
            mp.start();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.item3)
        {
            startActivity(new Intent(this, About.class));
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        // Create a dialog to confirm exit
        mpq = MediaPlayer.create(this,R.raw.quite);
        mpq.setVolume(0.1f, 0.1f);
        mpq.start();
        new AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false) // Ensure the dialog cannot be dismissed by tapping outside
                .setPositiveButton(android.R.string.yes, (dialog, which) -> {
                    mp.stop();
                    // Exit the activity
                    finish();
                })
                .setNegativeButton(android.R.string.no, (dialog, which) -> {
                    // Do nothing, just close the dialog
                    dialog.dismiss();
                })
                .setIcon(R.drawable.emojipng)
                .show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.pause();
    }
}