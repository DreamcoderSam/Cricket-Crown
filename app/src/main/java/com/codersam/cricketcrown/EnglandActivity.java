package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglandActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_england);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.playerList);

        final ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player("Eoin Morgan (c)","Batsman",R.drawable.eng_eoin_morgan));
        players.add(new Player("Jos Buttler (vc & wk)","Batsman",R.drawable.eng_jos_buttler));
        players.add(new Player("Moeen Ali","Batting Allrounder",R.drawable.eng_moeen_ali));
        players.add(new Player("Joe Denly","Batting Allrounder",R.drawable.eng_joe_denly));
        players.add(new Player("Ben Stokes","Batting Allrounder",R.drawable.eng_ben_stokes));
        players.add(new Player("Tom Curran","Bowling Allrounder",R.drawable.eng_tom_curran));
        players.add(new Player("David Willey","Bowling Allrounder",R.drawable.eng_david_willey));
        players.add(new Player("Chris Woakes","Bowling Allrounder",R.drawable.eng_chris_woakes));
        players.add(new Player("Jonny Bairstow (wk)","Batsman",R.drawable.eng_jonny_bairstow));
        players.add(new Player("Joe Root","Batsman",R.drawable.eng_joe_root));
        players.add(new Player("Jason Roy","Batsman",R.drawable.eng_jason_roy));
        players.add(new Player("Liam Plunkett","Bowler",R.drawable.eng_liam_plunkett));
        players.add(new Player("Adil Rashid","Bowler",R.drawable.eng_adil_rashid));
        players.add(new Player("Mark Wood","Bowler",R.drawable.eng_mark_wood));

        PlayerAdapter adapter = new PlayerAdapter(this, players, R.color.country_en);



        //ListView listView = (ListView) findViewById(R.id.playerList);

        listView.setAdapter(adapter);

    }
}
