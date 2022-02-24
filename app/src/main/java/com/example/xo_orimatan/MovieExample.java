package com.example.xo_orimatan;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.MediaController;
import androidx.appcompat.app.AppCompatActivity;


public class MovieExample extends AppCompatActivity {
    private VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_example);
        video=(VideoView) findViewById(R.id.videoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.tic_tac_tow_movie;
        video.setVideoURI(Uri.parse(path));
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(video);
        video.setMediaController(mediaController);
        video.start();
        Button btn_return=(Button) findViewById(R.id.button11);
        btn_return.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(MovieExample.this, InstructionsPage.class);
                    startActivity(intent);
                    finish();

            }
        } );


    }

}