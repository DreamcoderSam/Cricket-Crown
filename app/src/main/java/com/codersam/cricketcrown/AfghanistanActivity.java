package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AfghanistanActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afghanistan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.playerList);

        final ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player("Gulbadin Naib (c)","Bowling Allrounder",R.drawable.afg_gulbadin_naib));
        players.add(new Player("Mohammad Nabi","Bowling Allrounder",R.drawable.afg_mohammad_nabi));
        players.add(new Player("Rahmat Shah","Batting Allrounder",R.drawable.afg_rahmat_shah));
        players.add(new Player("Samiullah Shinwari","Batting Allrounder",R.drawable.afg_samiullah_shinwari));
        players.add(new Player("Mohammad Shahzad (wk)","Batsman",R.drawable.afg_mohammad_shahzad));
        players.add(new Player("Noor Ali Zadran","Batsman",R.drawable.afg_noor_ali));
        players.add(new Player("Hazratullah Zazai","Batsman",R.drawable.notfound));
        players.add(new Player("Asghar Afghan","Batsman",R.drawable.afgasgharafghan));
        players.add(new Player("Hashmatullah Shahidi","Batsman",R.drawable.notfound));
        players.add(new Player("Najibullah Zadran","Batsman",R.drawable.afg_najibullah_zadran));
        players.add(new Player("Rashid Khan","Bowler",R.drawable.afg_rashid_khan));
        players.add(new Player("Dawlat Zadran","Bowler",R.drawable.afg_dawlat_zadran));
        players.add(new Player("Aftab Alam","Bowler",R.drawable.afgaftabalam));
        players.add(new Player("Hamid Hassan","Bowler",R.drawable.afg_hamid_hassan));
        players.add(new Player("Mujeeb ur Rahman","Bowler",R.drawable.afg_mujeeb_rahman));

        PlayerAdapter adapter = new PlayerAdapter(this, players, R.color.country_af);



        //ListView listView = (ListView) findViewById(R.id.playerList);

        listView.setAdapter(adapter);

    }
}
