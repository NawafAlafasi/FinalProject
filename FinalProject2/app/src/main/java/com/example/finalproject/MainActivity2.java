package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recyclerView = findViewById(R.id.recycler);

        ArrayList<Books> booksArrayList = new ArrayList<>();

        Books bk1 = new Books("A Short History of Nearly Everything",R.drawable.sci1,8.4,92, "A Short History of Nearly Everything by American-British author Bill Bryson is a popular science book that explains some areas of science, using easily accessible language that appeals more to the general public than many other books dedicated to the subject.");
        Books bk2 = new Books("Thinking, Fast and Slow",R.drawable.sci2,8.4,93,"Thinking Fast And Slow shows you how two systems in your brain are constantly fighting over control of your behavior and actions, and teaches you the many ways in which this leads to errors in memory, judgment and decisions, and what you can do about it.");
        Books bk3 = new Books("The Immortal Life of Henrietta Lacks",R.drawable.sci3,8.2,87,"The immortal life of Henrietta Lacks / Rebecca Skloot. Documents the story of how scientists took cells from an unsuspecting descendant of freed slaves and created a human cell line that has been kept alive indefinitely, enabling discoveries in such areas as cancer research, in vitro fertilization, and gene mapping.");
        Books bk4 = new Books("A Brief History of Time: From the Big Bang to Black Holes",R.drawable.sci4,8.4,96,"A Brief History Of Time is Stephen Hawking’s way of explaining the most complex concepts and ideas of physics, such as space, time, black holes, planets, stars and gravity to the average Joe, so that even you and I can better understand how our planet was created, where it came from, and where it’s going.");
        Books bk5 = new Books("The Elegant Universe",R.drawable.sci5,8.2,94,"The Elegant Universe: Superstrings, Hidden Dimensions, and the Quest for the Ultimate Theory is a book by Brian Greene published in 1999, which introduces string and superstring theory, and provides a comprehensive though non-technical assessment of the theory and some of its shortcomings.");
        Books bk6 = new Books("The Body: A Guide for Occupants",R.drawable.sci6,8.6,92,"The Body: A Guide for Occupants is an extraordinary exploration of the human body which will have you marvelling at the form you occupy. If you've ever wondered what really goes on inside your head, heart and beyond, Bill Bryson will help you understand the miracle of our physical and neurological make up.");
        Books bk7 = new Books("Why We Sleep",R.drawable.sci7,10,93,"It is a summary of scientific research on sleep to date, providing insight on how sleep affects cognitive and physical performance in both the short and long term, and what you can do improve your own sleep.");

        booksArrayList.add(bk1);
        booksArrayList.add(bk2);
        booksArrayList.add(bk3);
        booksArrayList.add(bk4);
        booksArrayList.add(bk5);
        booksArrayList.add(bk6);
        booksArrayList.add(bk7);

        RecyclerView rv = findViewById(R.id.recycler2);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        BookAdapter ba = new BookAdapter(booksArrayList,this);
        rv.setAdapter(ba);

    }
}