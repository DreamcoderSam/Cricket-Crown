package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WestIndiesActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west_indies);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.playerList);

        final ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player("Jason Holder (c)","Bowling Allrounder",R.drawable.wi_jason_holder));
        players.add(new Player("Fabian Allen","Batting Allrounder",R.drawable.notfound));
        players.add(new Player("Andre Russell","Bowling Allrounder",R.drawable.wi_andre_russell));
        players.add(new Player("Carlos Brathwaite","Bowling Allrounder",R.drawable.wi_carlos_brathwaite));
        players.add(new Player("Evin Lewis","Batsman",R.drawable.wi_evin_lewis));
        players.add(new Player("Darren Bravo","Batsman",R.drawable.wi_darren_bravo));
        players.add(new Player("Chris Gayle","Batsman",R.drawable.wi_chris_gayle));
        players.add(new Player("Nicholas Pooran","Batsman",R.drawable.wi_nicholas_pooran));
        players.add(new Player("Shai Hope (wk)","Batsman",R.drawable.wi_shai_hope));
        players.add(new Player("Shimron Hetmyer","Batsman",R.drawable.wi_shimron_hetmyer));
        players.add(new Player("Oshane Thomas","Bowler",R.drawable.notfound));
        players.add(new Player("Sheldon Cottrell","Bowler",R.drawable.wi_sheldon_cottrell));
        players.add(new Player("Shannon Gabriel","Bowler",R.drawable.wi_shannon_gabriel));
        players.add(new Player("Kemar Roach","Bowler",R.drawable.wi_kemar_roach));
        players.add(new Player("Ashley Nurse","Bowler",R.drawable.wi_ashley_nurse));

        PlayerAdapter adapter = new PlayerAdapter(this, players, R.color.country_wi);



        //ListView listView = (ListView) findViewById(R.id.playerList);

        listView.setAdapter(adapter);

    }
}