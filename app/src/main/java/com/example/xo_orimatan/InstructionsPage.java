package com.example.xo_orimatan;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class InstructionsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions_page);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.movie_btn);
        CheckBox btnaccpet = (CheckBox) findViewById(R.id.checkBox);
        button1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if(btnaccpet.isChecked()) {
                    Intent intent = new Intent(InstructionsPage.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(InstructionsPage.this, "נא לאשר את התקנון!",Toast.LENGTH_LONG).show();
                }
            }
        } );

        button2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(InstructionsPage.this, MovieExample.class);
                    startActivity(intent);
                    finish();


            }
        } );

        btnaccpet.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                ImageView aniView = (ImageView) findViewById (R.id.imageView3);
                ObjectAnimator mover = ObjectAnimator.ofFloat(aniView , "translationX", 400f, 0f);
                mover.setDuration(3500);
                ObjectAnimator fadeIn = ObjectAnimator.ofFloat(aniView , "alpha", 0f, 1f);
                fadeIn.setDuration(3500);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(fadeIn).with(mover);
                animatorSet.start();

            }
        } );

    }

}