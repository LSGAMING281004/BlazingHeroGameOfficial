package com.lsgaming.app1.blazingherogameofficial;

import android.content.DialogInterface;
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
    AlertDialog alertDialog;

    Button play_offline;
    Toolbar toolbar;
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

        MediaPlayer mp = MediaPlayer.create(this,R.raw.pinksoldiers);
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.buttonclick);
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
            startActivity(new Intent(this, OfflineGamePlay.class));
        });


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
        if(id == R.id.item4)
        {
            showAlert();
        }
        return super.onOptionsItemSelected(item);
    }

    // Quit geme Alert dialog method
    private void showAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirmation to quit");
        builder.setMessage("Sure you want to quit?");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Do something when OK button is clicked
                finish();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Do something when Cancel button is clicked
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}