package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PointActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
