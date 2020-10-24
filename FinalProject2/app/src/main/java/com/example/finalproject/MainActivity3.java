package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        RecyclerView recyclerView = findViewById(R.id.recycler);

        ArrayList<Books> booksArrayList = new ArrayList<>();

        Books bk1 = new Books("The Diary Of a Young Girl",R.drawable.hist1,8.4,93,"It tells the story of her family who live in Frankfurt, Germany and suddenly have to go into hiding as a result of Hitler and the Nazi Party's treatment of Jews in Europe during the second world war. They escape to Amsterdam where they go into hiding with other Jews. The diary ends suddenly on 1 August 1944.");
        Books bk2 = new Books("Caste: The Origins of Our Discontents",R.drawable.hist2,9.2,89,"Wilkerson does so by comparing aspects of the experience of American people of color to the caste systems of India and Nazi Germany, and she explores the impact of castes on societies shaped by them, and their people.");
        Books bk3 = new Books("The Splendid and the Vile: A Saga of Churchill, Family, and Defiance During the Blitz",R.drawable.hist3,8.4,80,"The Splendid and the Vile takes readers out of today's political dysfunction and back to a time of true leadership, when, in the face of unrelenting horror, Churchill's eloquence, courage, and perseverance bound a country, and a family, together. The day was warm and still, the sky blue above a rising haze.");
        Books bk4 = new Books("Man's Search for Meaning",R.drawable.hist4,8.8,93,"Man's Search for Meaning is a 1946 book by Viktor Frankl chronicling his experiences as a prisoner in Nazi concentration camps during World War II, and describing his psychotherapeutic method, which involved identifying a purpose in life to feel positive about, and then immersively imagining that outcome.");
        Books bk5 = new Books("The Warmth of Other Suns",R.drawable.hist5,8.8,88,"The Warmth of Other Suns is a re-telling of The Great Migration, in which six million black southerners migrated to the northern and western regions of the United States in the eight decades between World War I and 1970.");
        Books bk6 = new Books("The Silk Roads: A New History of the World",R.drawable.hist6,8.4,88,"The Silk Road was a vast trade network connecting Eurasia and North Africa via land and sea routes. The Silk Road earned its name from Chinese silk, a highly valued commodity that merchants transported along these trade networks. Advances in technology and increased political stability caused an increase in trade.");
        Books bk7 = new Books("Killing Crazy Horse: The Merciless Indian Wars in America",R.drawable.hist7,7.6,82,"The bloody Battle of Tippecanoe was only the beginning. It’s 1811 and President James Madison has ordered the destruction of Shawnee warrior chief Tecumseh’s alliance of tribes in the Great Lakes region. But while General William Henry Harrison would win this fight, the armed conflict between Native Americans and the newly formed United States would rage on for decades.");
        Books bk8 = new Books("Night",R.drawable.hist8,8.6,88,"Night is a 1960 book by Elie Wiesel about his experience with his father in the Nazi German concentration camps at Auschwitz and Buchenwald in 1944–1945, at the height of the Holocaust toward the end of the Second World War.");

        booksArrayList.add(bk1);
        booksArrayList.add(bk2);
        booksArrayList.add(bk3);
        booksArrayList.add(bk4);
        booksArrayList.add(bk5);
        booksArrayList.add(bk6);
        booksArrayList.add(bk7);
        booksArrayList.add(bk8);

        RecyclerView rv = findViewById(R.id.recycler3);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        BookAdapter ba = new BookAdapter(booksArrayList,this);
        rv.setAdapter(ba);

    }
}