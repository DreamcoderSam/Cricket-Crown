package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SrilankaActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srilanka);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.playerList);

        final ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player("Dimith Karunaratne (c)","Batsman",R.drawable.sl_dimith_karunaratne));
        players.add(new Player("Angelo Mathews","Batting Allrounder",R.drawable.sl_angelo_mathews));
        players.add(new Player("Dhananjaya de Silva","Batting Allrounder",R.drawable.sl_dhananjaya_silva));
        players.add(new Player("Isuru Udana","Batting Allrounder",R.drawable.sl_isuru_udana));
        players.add(new Player("Milinda Siriwardana","Batting Allrounder",R.drawable.sl_milinda_siriwardana));
        players.add(new Player("Thisara Perera","Bowling Allrounder",R.drawable.sl_thisara_perera));
        players.add(new Player("Jeevan Mendis","Bowling Allrounder",R.drawable.sl_jeevan_mendis));
        players.add(new Player("Kusal Perera (wk)","Batsman",R.drawable.sl_kusal_perera));
        players.add(new Player("Kusal Mendis (wk)","Batsman",R.drawable.sl_kusal_mendis));
        players.add(new Player("Avishka Fernando","Batsman",R.drawable.notfound));
        players.add(new Player("Lahiru Thirimanne","Batsman",R.drawable.sl_lahiru_thirimanne));
        players.add(new Player("Jeffrey Vandersay","Bowler",R.drawable.sl_jeffrey_vandersay));
        players.add(new Player("Lasith Malinga","Bowler",R.drawable.sl_lasith_malinga));
        players.add(new Player("Nuwan Pradeep","Bowler",R.drawable.sl_nuwan_pradeep));
        players.add(new Player("Suranga Lakmal","Bowler",R.drawable.sl_suranga_lakmal));

        PlayerAdapter adapter = new PlayerAdapter(this, players, R.color.country_sl);



        //ListView listView = (ListView) findViewById(R.id.playerList);

        listView.setAdapter(adapter);

    }
}
