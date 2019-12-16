package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class IndiaActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.playerList);

        final ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player("Virat Kohli (c)","Batsman",R.drawable.ind_virat_kohli));
        players.add(new Player("Rohit Sharma (vc)","Batsman",R.drawable.ind_rohit_sharma));
        players.add(new Player("Kedar Jadhav","Batting Allrounder",R.drawable.ind_keda_jadhav));
        players.add(new Player("Hardik Pandya","Batting Allrounder",R.drawable.ind_hardik_pandya));
        players.add(new Player("Vijay Shankar","Batting Allrounder",R.drawable.ind_vijay_shankar));
        players.add(new Player("Ravindra Jadeja","Bowling Allrounder",R.drawable.ind_ravindra_jadeja));
        players.add(new Player("Shikhar Dhawan","Batsman",R.drawable.ind_shikhar_dhawan));
        players.add(new Player("MS Dhoni (wk)","Batsman",R.drawable.ind_dhoni));
        players.add(new Player("Dinesh Karthik (wk)","Batsman",R.drawable.ind_dinesh_karthik));
        players.add(new Player("Lokesh Rahul","Batsman",R.drawable.ind_lokesh));
        players.add(new Player("Bhuvneshwar Kumar","Bowler",R.drawable.ind_bhuvneshwar_kumar));
        players.add(new Player("Kuldeep Yadav","Bowler",R.drawable.ind_kuldeep_yadav));
        players.add(new Player("Yuzvendra Chahal","Bowler",R.drawable.ind_yuzvendra_chahal));
        players.add(new Player("Jasprit Bumrah","Bowler",R.drawable.ind_jasprit_bumrah));
        players.add(new Player("Mohammed Shami","Bowler",R.drawable.ind_mohammed_shami));

        PlayerAdapter adapter = new PlayerAdapter(this, players, R.color.country_in);



        //ListView listView = (ListView) findViewById(R.id.playerList);

        listView.setAdapter(adapter);

    }
}
