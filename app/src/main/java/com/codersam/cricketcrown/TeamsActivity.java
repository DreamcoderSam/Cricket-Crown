package com.codersam.cricketcrown;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class TeamsActivity extends AppCompatActivity {
    LinearLayout bdTeam, inTeam, pkTeam, auTeam, nzTeam, slTeam, saTeam, wiTeam, enTeam, afTeam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bdTeam = findViewById(R.id.teambd);
        inTeam = findViewById(R.id.teamIndia);
        pkTeam = findViewById(R.id.teamPaki);
        auTeam = findViewById(R.id.teamAus);
        nzTeam = findViewById(R.id.teamNew);
        slTeam = findViewById(R.id.teamSri);
        saTeam = findViewById(R.id.teamSouth);
        wiTeam = findViewById(R.id.teamWest);
        enTeam = findViewById(R.id.teamEngland);
        afTeam = findViewById(R.id.teamAfg);

        bdTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTeamBD = new Intent(TeamsActivity.this,BangladeshActivity.class);
                startActivity(gotoTeamBD);
            }
        });
        inTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTeamIN = new Intent(TeamsActivity.this,IndiaActivity.class);
                startActivity(gotoTeamIN);
            }
        });
        pkTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTeamPK = new Intent(TeamsActivity.this,PakistanActivity.class);
                startActivity(gotoTeamPK);
            }
        });
        auTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTeamAU = new Intent(TeamsActivity.this,AustraliaActivity.class);
                startActivity(gotoTeamAU);
            }
        });
        nzTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTeamNZ = new Intent(TeamsActivity.this,NewzelandActivity.class);
                startActivity(gotoTeamNZ);
            }
        });
        slTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTeamSL = new Intent(TeamsActivity.this,SrilankaActivity.class);
                startActivity(gotoTeamSL);
            }
        });
        saTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTeamSA = new Intent(TeamsActivity.this,SouthafricaActivity.class);
                startActivity(gotoTeamSA);
            }
        });
        wiTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTeamWI = new Intent(TeamsActivity.this,WestIndiesActivity.class);
                startActivity(gotoTeamWI);
            }
        });
        enTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTeamEN = new Intent(TeamsActivity.this,EnglandActivity.class);
                startActivity(gotoTeamEN);
            }
        });
        afTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTeamAF = new Intent(TeamsActivity.this,AfghanistanActivity.class);
                startActivity(gotoTeamAF);
            }
        });
    }
}
