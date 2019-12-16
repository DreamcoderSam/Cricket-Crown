package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NewzelandActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newzeland);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.playerList);

        final ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player("Kane Williamson (c)","Batsman",R.drawable.nz_kane_williamson));
        players.add(new Player("Tim Southee (vc)","Bowler",R.drawable.nz_tim_southee));
        players.add(new Player("Colin de Grandhomme","Batting Allrounder",R.drawable.nz_colin_grandhomme));
        players.add(new Player("Colin Munro","Batting Allrounder",R.drawable.nz_colin_munro));
        players.add(new Player("James Neesham","Batting Allrounder",R.drawable.nz_james_neesham));
        players.add(new Player("Mitchell Santner","Bowling Allrounder",R.drawable.nz_mitchell_santner));
        players.add(new Player("Tom Blundell (wk)","Batsman",R.drawable.nz_tom_blundell));
        players.add(new Player("Tom Latham (wk)","Batsman",R.drawable.nz_tom));
        players.add(new Player("Martin Guptill","Batsman",R.drawable.nz_martin_guptill));
        players.add(new Player("Henry Nicholls","Batsman",R.drawable.nz_henry_nicholls));
        players.add(new Player("Ross Taylor","Batsman",R.drawable.nz_ross_taylor));
        players.add(new Player("Trent Boult","Bowler",R.drawable.nz_trent));
        players.add(new Player("Lockie Ferguson","Bowler",R.drawable.nz_lockie_ferguson));
        players.add(new Player("Matt Henry","Bowler",R.drawable.nz_matt_henry));
        players.add(new Player("Ish Sodhi","Bowler",R.drawable.nz_ish_sodhi));

        PlayerAdapter adapter = new PlayerAdapter(this, players, R.color.country_nz);



        //ListView listView = (ListView) findViewById(R.id.playerList);

        listView.setAdapter(adapter);

    }
}
