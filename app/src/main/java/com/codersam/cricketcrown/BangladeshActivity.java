package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BangladeshActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangladesh);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.playerList);

        final ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player("Mashrafe Mortaza (c)","Bowler",R.drawable.bdmashrafe));
        players.add(new Player("Shakib Al Hasan (vc)","Batting Allrounder",R.drawable.bdshakib));
        players.add(new Player("Tamim Iqbal","Batsman",R.drawable.bdtamim));
        players.add(new Player("Soumya Sarkar","Batsman",R.drawable.bdsoumya));
        players.add(new Player("Liton Das","Batsman",R.drawable.notfound));
        players.add(new Player("Sabbir Rahman","Batsman",R.drawable.bdsabbir));
        players.add(new Player("Mushfiqur Rahim (wk)","Batsman",R.drawable.bdmushfiqur));
        players.add(new Player("Mohammad Mithun (wk)","Batsman",R.drawable.bdmohammad));
        players.add(new Player("Mahmudullah Riyad","Batting Allrounder",R.drawable.bdmahmudullah));
        players.add(new Player("Mosaddek Hossain","Batting Allrounder",R.drawable.bdmosaddek));
        players.add(new Player("Mohammad Saifuddin","Batting Allrounder",R.drawable.notfound));
        players.add(new Player("Mehidy Hasan","Bowling Allrounder",R.drawable.bdmehidy));
        players.add(new Player("Rubel Hossain","Bowler",R.drawable.bdrubel));
        players.add(new Player("Mustafizur Rahman","Bowler",R.drawable.bdmustafizur));
        players.add(new Player("Abu Jayed","Bowler",R.drawable.bdjayed));

        PlayerAdapter adapter = new PlayerAdapter(this, players, R.color.country_bd);



        //ListView listView = (ListView) findViewById(R.id.playerList);

        listView.setAdapter(adapter);

    }
}
