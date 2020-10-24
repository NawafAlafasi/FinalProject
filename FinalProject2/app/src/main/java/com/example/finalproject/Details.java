package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView img = findViewById(R.id.imageView2);
        TextView name = findViewById(R.id.name);
        TextView rating = findViewById(R.id.rating);
        TextView comment = findViewById(R.id.comment);

        Bundle book = getIntent().getExtras();
        Books books = (Books) book.getSerializable("books");

        img.setImageResource(books.getImage());
        name.setText(books.getName());
        rating.setText("Rating: "+ books.getRating()+"/10");
        comment.setText(books.getCommments());

    }
}