package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler);

        ArrayList<Books> booksArrayList = new ArrayList<>();

        Books bk1 = new Books("Percy Jackson and the Lightning Thief", R.drawable.percy1,5.9,84,
                "Twelve-year-old Percy Jackson is on the most dangerous quest of his life. With the help of a satyr and a daughter of Athena, Percy must journey across the United States to catch a thief who has stolen the original weapon of mass destruction — Zeus' master bolt.");
        Books bk2 = new Books("Percy Jackson and the Sea Of Monsters", R.drawable.percy2,5.8,84,
                "Young demigod Percy Jackson sets off on a quest to find the Golden Fleece in the Sea of Monsters. His half-brother Tyson and friends Annabeth and Grover join hands with him to help him find it.");
        Books bk3 = new Books("Percy Jackson and the Titan's Curse", R.drawable.percy3,8.8,96,
                "The book tells the story of the adventures of the fourteen-year-old demigod Percy Jackson as he and his friends go on a dangerous adventure. In this quest, they have to rescue his friend Annabeth and the Greek goddess Artemis, who have both been kidnapped.");
        Books bk4 = new Books("Percy Jackson and the Battle Of The Labyrinth", R.drawable.percy4,8.8,97,
                "The story tells of Annabeth Chase as she leads her friends in a quest to find the inventor of the infamous Labyrinth when they discover its role in a dark plot against the camp by Kronos' Army.");
        Books bk5 = new Books("Percy Jackson and the Last Olympian", R.drawable.percy5,9,97,
                "The Last Olympian revolves around the demigod Percy Jackson as he leads his friends in a last stand to protect Mount Olympus.");
        Books bk6 = new Books("Harry Potter and the Prisoner of Azkaban", R.drawable.harry1,7.9,94,
                "The book follows Harry Potter, a young wizard, in his third year at Hogwarts School of Witchcraft and Wizardry. Along with friends Ronald Weasley and Hermione Granger, Harry investigates Sirius Black, an escaped prisoner from Azkaban, the wizard prison, believed to be one of Lord Voldemort's old allies.");
        Books bk7 = new Books("Harry Potter and the Deathly Hallows", R.drawable.harry2,7.7,95,
                "After Voldemort takes over the Ministry of Magic, Harry, Ron and Hermione are forced into hiding. They try to decipher the clues left to them by Dumbledore to find and destroy Voldemort's Horcruxes.");
        Books bk8 = new Books("Harry Potter and the Half-Blood Prince", R.drawable.harry3,7.6,95,
                "Dumbledore and Harry Potter learn more about Voldemort's past and his rise to power. Meanwhile, Harry stumbles upon an old potions textbook belonging to a person calling himself the Half-Blood Prince.");
        Books bk9 = new Books("Harry Potter and the Goblet Of Fire", R.drawable.harry4,7.7,95,
                "When Harry is chosen as a fourth participant of the inter-school Triwizard Tournament, he is unwittingly pulled into a dark conspiracy that endangers his life.");
        Books bk10 = new Books("Harry Potter and the Order Of The Phoenix", R.drawable.harry5,7.5,95,
                "Harry Potter and Dumbledore's warning about the return of Lord Voldemort is not heeded by the wizard authorities who, in turn, look to undermine Dumbledore's authority at Hogwarts and discredit Harry.");
        Books bk11 = new Books("Harry Potter and the Sorcerer's Stone", R.drawable.harry6,7.6,93,
                "Harry Potter, an eleven-year-old orphan, discovers that he is a wizard and is invited to study at Hogwarts. Even as he escapes a dreary life and enters a world of magic, he finds trouble awaiting him.");
        Books bk12 = new Books("Harry Potter and the Chamber Of Secrets", R.drawable.harry7,7.4,94,
                "A house-elf warns Harry against returning to Hogwarts, but he decides to ignore it. When students and creatures at the school begin to get petrified, Harry finds himself surrounded in mystery.");

        booksArrayList.add(bk1);
        booksArrayList.add(bk2);
        booksArrayList.add(bk3);
        booksArrayList.add(bk4);
        booksArrayList.add(bk5);
        booksArrayList.add(bk6);
        booksArrayList.add(bk7);
        booksArrayList.add(bk8);
        booksArrayList.add(bk9);
        booksArrayList.add(bk10);
        booksArrayList.add(bk11);
        booksArrayList.add(bk12);

        RecyclerView rv = findViewById(R.id.recycler);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        BookAdapter ba = new BookAdapter(booksArrayList,this);
        rv.setAdapter(ba);

    }
}