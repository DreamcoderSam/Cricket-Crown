package com.codersam.cricketcrown;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    // For CountDown
    private TextView txtDay, txtHour, txtMinute, txtSecond;
    private Handler handler;
    private Runnable runnable;
    // CountDown Ends
    //LinearLayout calling for going different layout
    LinearLayout fixtureLayout, venueLayout, pointLayout, teamsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDay = (TextView) findViewById(R.id.days);
        txtHour = (TextView) findViewById(R.id.hours);
        txtMinute = (TextView) findViewById(R.id.minutes);
        txtSecond = (TextView) findViewById(R.id.seconds);
        countDownStart();

        //LinearLayout Starts
        fixtureLayout = findViewById(R.id.fixture_layout);
        venueLayout = findViewById(R.id.venue_layout);
        pointLayout = findViewById(R.id.point_layout);
        teamsLayout = findViewById(R.id.teamsPlayers);

        //LinearLayouts Ends

        fixtureLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoFixture = new Intent(MainActivity.this,FixtureActivity.class);
                startActivity(gotoFixture);
            }
        });
        venueLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoVenue = new Intent(MainActivity.this,VenueActivity.class);
                startActivity(gotoVenue);
            }
        });
        pointLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoPoint = new Intent(MainActivity.this,PointActivity.class);
                startActivity(gotoPoint);
            }
        });
        teamsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTeam = new Intent(MainActivity.this,TeamsActivity.class);
                startActivity(gotoTeam);
            }
        });

    }
    // CountDown Started
    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                    // Please here set your event date//YYYY-MM-DD
                    Date futureDate = dateFormat.parse("2019-5-30");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        txtDay.setText("" + String.format("%02d", days));
                        txtHour.setText("" + String.format("%02d", hours));
                        txtMinute.setText(""
                                + String.format("%02d", minutes));
                        txtSecond.setText(""
                                + String.format("%02d", seconds));
                    } else {
                        textViewGone();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
    }

    public void textViewGone() {
        findViewById(R.id.countDownDay).setVisibility(View.GONE);
        findViewById(R.id.countDownHour).setVisibility(View.GONE);
        findViewById(R.id.countDownMinute).setVisibility(View.GONE);
        findViewById(R.id.countDownSeconds).setVisibility(View.GONE);
        findViewById(R.id.countDownMain).setVisibility(View.GONE);
        findViewById(R.id.countDownText).setVisibility(View.GONE);
    }
    //CountDown End
}
