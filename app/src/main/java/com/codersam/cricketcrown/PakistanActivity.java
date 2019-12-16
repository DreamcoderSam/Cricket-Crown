package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PakistanActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakistan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.playerList);

        final ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player("Sarfaraz Ahmed (c & wk)","Batsman",R.drawable.pk_sarfaraz_ahmed));
        players.add(new Player("Shoaib Malik (vc)","Batting Allrounder",R.drawable.pk_shoaib_malik));
        players.add(new Player("Mohammad Hafeez","Batting Allrounder",R.drawable.pk_mohammad_hafeez));
        players.add(new Player("Haris Sohail","Batting Allrounder",R.drawable.pk_haris_sohail));
        players.add(new Player("Shadab Khan","Bowling Allrounder",R.drawable.pk_shadab_khan));
        players.add(new Player("Imad Wasim","Bowling Allrounder",R.drawable.pk_imad_wasim));
        players.add(new Player("Fakhar Zaman","Batsman",R.drawable.pk_fakhar_zaman));
        players.add(new Player("Imam-ul-Haq","Batsman",R.drawable.pk_imam_haq));
        players.add(new Player("Babar Azam","Batsman",R.drawable.pk_babar_azam));
        players.add(new Player("Asif Ali","Batsman",R.drawable.notfound));
        players.add(new Player("Hasan Ali","Bowler",R.drawable.pk_hasan_ali));
        players.add(new Player("Mohammad Hasnain","Bowler",R.drawable.notfound));
        players.add(new Player("Shaheen Afridi","Bowler",R.drawable.pk_shaheen_afridi));
        players.add(new Player("Mohammad Amir","Bowler",R.drawable.pk_mohammad_amir));
        players.add(new Player("Wahab Riaz","Bowler",R.drawable.pk_wahab_riaz));

        PlayerAdapter adapter = new PlayerAdapter(this, players, R.color.country_pk);



        //ListView listView = (ListView) findViewById(R.id.playerList);

        listView.setAdapter(adapter);

    }
}
