package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SouthafricaActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_southafrica);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.playerList);

        final ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player("Faf du Plessis (c)","Batsman",R.drawable.sa_faf_duplessis));
        players.add(new Player("Quinton de Kock (vc & wk)","Batsman",R.drawable.sa_quinton_dekock));
        players.add(new Player("Jean-Paul Duminy","Batting Allrounder",R.drawable.sa_jean_paul));
        players.add(new Player("Dwaine Pretorius","Bowling Allrounder",R.drawable.sa_dwaine_pretorius));
        players.add(new Player("Andile Phehlukwayo","Bowling Allrounder",R.drawable.sa_andile_phehlukwayo));
        players.add(new Player("Chris Morris","Bowling Allrounder",R.drawable.sa_chris_morris));
        players.add(new Player("David Miller","Batsman",R.drawable.sa_david_miller));
        players.add(new Player("Hashim Amla","Batsman",R.drawable.sa_hashim_amla));
        players.add(new Player("Aiden Markram","Batsman",R.drawable.sa_aiden_markram));
        players.add(new Player("Rassie van der Dussen","Batsman",R.drawable.notfound));
        players.add(new Player("Kagiso Rabada","Bowler",R.drawable.sa_kagiso_rabada));
        players.add(new Player("Dale Steyn","Bowler",R.drawable.sa_dale_steyn));
        players.add(new Player("Lungi Ngidi","Bowler",R.drawable.sa_lungi_ngidi));
        players.add(new Player("Imran Tahir","Bowler",R.drawable.sa_imran_tahir));
        players.add(new Player("Tabraiz Shamsi","Bowler",R.drawable.sa_tabraiz_shamsi));

        PlayerAdapter adapter = new PlayerAdapter(this, players, R.color.country_sa);



        //ListView listView = (ListView) findViewById(R.id.playerList);

        listView.setAdapter(adapter);

    }
}
