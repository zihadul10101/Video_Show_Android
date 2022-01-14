package com.zihadul.video_show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 =findViewById(R.id.button1);
        button2 =findViewById(R.id.button2);
        button3 =findViewById(R.id.button3);


// button 1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url="https://www.youtube.com/embed/U0ykvdNF_Po";
                Intent myIntent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(myIntent);

            }
        });

        // button 2

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url="https://www.youtube.com/embed/HV7DtH3J2PU";
                Intent myIntent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(myIntent);

            }
        });

        // button 3

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video_Player.video_url="https://www.youtube.com/embed/U0ykvdNF_Po";
                Intent myIntent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(myIntent);

            }
        });

    }
}