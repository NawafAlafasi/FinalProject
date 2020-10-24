package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ImageView novel = findViewById(R.id.novel);
        ImageView sci = findViewById(R.id.science);
        ImageView hist = findViewById(R.id.hist);

        novel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home_page.this, MainActivity.class);

                startActivity(i);
            }
        });

        sci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home_page.this, MainActivity2.class);

                startActivity(i);
            }
        });

        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home_page.this, MainActivity3.class);

                startActivity(i);
            }
        });
    }
}