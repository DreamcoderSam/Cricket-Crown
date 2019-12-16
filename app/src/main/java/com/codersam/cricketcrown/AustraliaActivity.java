package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AustraliaActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.playerList);

        final ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player("Aaron Finch (c)","Batsman",R.drawable.au_aaron_finch));
        players.add(new Player("Alex Carey (vc & wk)","Batsman",R.drawable.au_alex_carey));
        players.add(new Player("Glenn Maxwell","Batting Allrounder",R.drawable.au_glenn_maxwell));
        players.add(new Player("Marcus Stoinis","Batting Allrounder",R.drawable.au_marcus_stoinis));
        players.add(new Player("Usman Khawaja","Batsman",R.drawable.au_usman_khawaja));
        players.add(new Player("Shaun Marsh","Batsman",R.drawable.au_shaun_marsh));
        players.add(new Player("Steven Smith","Batsman",R.drawable.au_steven_smith));
        players.add(new Player("David Warner","Batsman",R.drawable.au_david_warner));
        players.add(new Player("Kane Richardson","Bowler",R.drawable.au_kane_richardson));
        players.add(new Player("Mitchell Starc","Bowler",R.drawable.au_mitchell_starc));
        players.add(new Player("Adam Zampa","Bowler",R.drawable.au_adam_zampa));
        players.add(new Player("Jason Behrendorff","Bowler",R.drawable.au_jason_behrendorff));
        players.add(new Player("Nathan Coulter-Nile","Bowler",R.drawable.au_nathan_coulter));
        players.add(new Player("Pat Cummins","Bowler",R.drawable.au_pat_cummins));
        players.add(new Player("Nathan Lyon","Bowler",R.drawable.au_nathan_lyon));

        PlayerAdapter adapter = new PlayerAdapter(this, players, R.color.country_aus);



        //ListView listView = (ListView) findViewById(R.id.playerList);

        listView.setAdapter(adapter);

    }
}
