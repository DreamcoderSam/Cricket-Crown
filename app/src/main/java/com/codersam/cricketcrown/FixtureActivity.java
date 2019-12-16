package com.codersam.cricketcrown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FixtureActivity extends AppCompatActivity {
    TextView match1, match2, match3, match4, match5, match6, match7, match8, match9, match10, match11, match12, match13, match14, match15, match16, match17, match18, match19, match20, match21, match22, match23, match24, match25
            , match26, match27, match28, match29, match30, match31, match32, match33, match34, match35, match36, match37, match38, match39, match40, match41, match42, match43, match44, match45, match46, match47, match48;
    private SimpleDateFormat df = new SimpleDateFormat("MMM dd, EE hh:mm a", Locale.ENGLISH);
    private Date date = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixture);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        match1 = findViewById(R.id.m1);
        match2 = findViewById(R.id.m2);
        match3 = findViewById(R.id.m3);
        match4 = findViewById(R.id.m4);
        match5 = findViewById(R.id.m5);
        match6 = findViewById(R.id.m6);
        match7 = findViewById(R.id.m7);
        match8 = findViewById(R.id.m8);
        match9 = findViewById(R.id.m9);
        match10 = findViewById(R.id.m10);
        match11 = findViewById(R.id.m11);
        match12 = findViewById(R.id.m12);
        match13 = findViewById(R.id.m13);
        match14 = findViewById(R.id.m14);
        match15 = findViewById(R.id.m15);
        match16 = findViewById(R.id.m16);
        match17 = findViewById(R.id.m17);
        match18 = findViewById(R.id.m18);
        match19 = findViewById(R.id.m19);
        match20 = findViewById(R.id.m20);
        match21 = findViewById(R.id.m21);
        match22 = findViewById(R.id.m22);
        match23 = findViewById(R.id.m23);
        match24 = findViewById(R.id.m24);
        match25 = findViewById(R.id.m25);
        match26 = findViewById(R.id.m26);
        match27 = findViewById(R.id.m27);
        match28 = findViewById(R.id.m28);
        match29 = findViewById(R.id.m29);
        match30 = findViewById(R.id.m30);
        match31 = findViewById(R.id.m31);
        match32 = findViewById(R.id.m32);
        match33 = findViewById(R.id.m33);
        match34 = findViewById(R.id.m34);
        match35 = findViewById(R.id.m35);
        match36 = findViewById(R.id.m36);
        match37 = findViewById(R.id.m37);
        match38 = findViewById(R.id.m38);
        match39 = findViewById(R.id.m39);
        match40 = findViewById(R.id.m40);
        match41 = findViewById(R.id.m41);
        match42 = findViewById(R.id.m42);
        match43 = findViewById(R.id.m43);
        match44 = findViewById(R.id.m44);
        match45 = findViewById(R.id.m45);
        match46 = findViewById(R.id.m46);
        match47 = findViewById(R.id.m47);
        match48 = findViewById(R.id.m48);

        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm1 = "May 30, Thu 09:30 AM";
        try {
            date = df.parse(tdm1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm1 = df.format(date);
        match1.setText(ftdm1);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm2 = "May 31, Fri 09:30 AM";
        try {
            date = df.parse(tdm2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm2 = df.format(date);
        match2.setText(ftdm2);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm3 = "Jun 01, Sat 09:30 AM";
        try {
            date = df.parse(tdm3);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm3 = df.format(date);
        match3.setText(ftdm3);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm4 = "Jun 01, Sat 12:30 PM";
        try {
            date = df.parse(tdm4);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm4 = df.format(date);
        match4.setText(ftdm4);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm5 = "Jun 02, Sun 09:30 AM";
        try {
            date = df.parse(tdm5);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm5 = df.format(date);
        match5.setText(ftdm5);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm6 = "Jun 03, Mon 09:30 AM";
        try {
            date = df.parse(tdm6);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm6 = df.format(date);
        match6.setText(ftdm6);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm7 = "Jun 04, Tue 09:30 AM";
        try {
            date = df.parse(tdm7);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm7 = df.format(date);
        match7.setText(ftdm7);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm8 = "Jun 05, Wed 09:30 AM";
        try {
            date = df.parse(tdm8);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm8 = df.format(date);
        match8.setText(ftdm8);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm9 = "Jun 05, Wed 12:30 PM";
        try {
            date = df.parse(tdm9);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm9 = df.format(date);
        match9.setText(ftdm9);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm10 = "Jun 06, Thu 09:30 AM";
        try {
            date = df.parse(tdm10);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm10 = df.format(date);
        match10.setText(ftdm10);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm11 = "Jun 07, Fri 09:30 AM";
        try {
            date = df.parse(tdm11);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm11 = df.format(date);
        match11.setText(ftdm11);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm12 = "Jun 08, Sat 09:30 AM";
        try {
            date = df.parse(tdm12);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm12 = df.format(date);
        match12.setText(ftdm12);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm13 = "Jun 08, Sat 12:30 PM";
        try {
            date = df.parse(tdm13);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm13 = df.format(date);
        match13.setText(ftdm13);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm14 = "Jun 09, Sun 09:30 AM";
        try {
            date = df.parse(tdm14);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm14 = df.format(date);
        match14.setText(ftdm14);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm15 = "Jun 10, Mon 09:30 AM";
        try {
            date = df.parse(tdm15);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm15 = df.format(date);
        match15.setText(ftdm15);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm16 = "Jun 11, Tue 09:30 AM";
        try {
            date = df.parse(tdm16);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm16 = df.format(date);
        match16.setText(ftdm16);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm17 = "Jun 12, Wed 09:30 AM";
        try {
            date = df.parse(tdm17);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm17 = df.format(date);
        match17.setText(ftdm17);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm18 = "Jun 13, Thu 09:30 AM";
        try {
            date = df.parse(tdm18);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm18 = df.format(date);
        match18.setText(ftdm18);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm19 = "Jun 14, Fri 09:30 AM";
        try {
            date = df.parse(tdm19);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm19 = df.format(date);
        match19.setText(ftdm19);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm20 = "Jun 15, Sat 09:30 AM";
        try {
            date = df.parse(tdm20);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm20 = df.format(date);
        match20.setText(ftdm20);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm21 = "Jun 15, Sat 12:30 PM";
        try {
            date = df.parse(tdm21);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm21 = df.format(date);
        match21.setText(ftdm21);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm22 = "Jun 16, Sun 09:30 AM";
        try {
            date = df.parse(tdm22);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm22 = df.format(date);
        match22.setText(ftdm22);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm23 = "Jun 17, Mon 09:30 AM";
        try {
            date = df.parse(tdm23);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm23 = df.format(date);
        match23.setText(ftdm23);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm24 = "Jun 18, Tue 09:30 AM";
        try {
            date = df.parse(tdm24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm24 = df.format(date);
        match24.setText(ftdm24);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm25 = "Jun 19, Wed 09:30 AM";
        try {
            date = df.parse(tdm25);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm25 = df.format(date);
        match25.setText(ftdm25);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm26 = "Jun 20, Thu 09:30 AM";
        try {
            date = df.parse(tdm26);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm26 = df.format(date);
        match26.setText(ftdm26);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm27 = "Jun 21, Fri 09:30 AM";
        try {
            date = df.parse(tdm27);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm27 = df.format(date);
        match27.setText(ftdm27);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm28 = "Jun 22, Sat 09:30 AM";
        try {
            date = df.parse(tdm28);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm28 = df.format(date);
        match28.setText(ftdm28);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm29 = "Jun 22, Sat 12:30 PM";
        try {
            date = df.parse(tdm29);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm29 = df.format(date);
        match29.setText(ftdm29);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm30 = "Jun 23, Sun 09:30 AM";
        try {
            date = df.parse(tdm30);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm30 = df.format(date);
        match30.setText(ftdm30);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm31 = "Jun 24, Mon 09:30 AM";
        try {
            date = df.parse(tdm31);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm31 = df.format(date);
        match31.setText(ftdm31);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm32 = "Jun 25, Tue 09:30 AM";
        try {
            date = df.parse(tdm32);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm32 = df.format(date);
        match32.setText(ftdm32);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm33 = "Jun 26, Wed 09:30 AM";
        try {
            date = df.parse(tdm33);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm33 = df.format(date);
        match33.setText(ftdm33);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm34 = "Jun 27, Thu 09:30 AM";
        try {
            date = df.parse(tdm34);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm34 = df.format(date);
        match34.setText(ftdm34);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm35 = "Jun 28, Fri 09:30 AM";
        try {
            date = df.parse(tdm35);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm35 = df.format(date);
        match35.setText(ftdm35);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm36 = "Jun 29, Sat 09:30 AM";
        try {
            date = df.parse(tdm36);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm36 = df.format(date);
        match36.setText(ftdm36);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm37 = "Jun 29, Sat 12:30 PM";
        try {
            date = df.parse(tdm37);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm37 = df.format(date);
        match37.setText(ftdm37);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm38 = "Jun 30, Sun 09:30 AM";
        try {
            date = df.parse(tdm38);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm38 = df.format(date);
        match38.setText(ftdm38);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm39 = "Jul 01, Mon 09:30 AM";
        try {
            date = df.parse(tdm39);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm39 = df.format(date);
        match39.setText(ftdm39);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm40 = "Jul 02, Tue 09:30 AM";
        try {
            date = df.parse(tdm40);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm40 = df.format(date);
        match40.setText(ftdm40);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm41 = "Jul 03, Wed 09:30 AM";
        try {
            date = df.parse(tdm41);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm41 = df.format(date);
        match41.setText(ftdm41);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm42 = "Jul 04, Thu 09:30 AM";
        try {
            date = df.parse(tdm42);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm42 = df.format(date);
        match42.setText(ftdm42);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm43 = "Jul 05, Fri 09:30 AM";
        try {
            date = df.parse(tdm43);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm43 = df.format(date);
        match43.setText(ftdm43);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm44 = "Jul 06, Sat 09:30 AM";
        try {
            date = df.parse(tdm44);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm44 = df.format(date);
        match44.setText(ftdm44);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm45 = "Jul 06, Sat 12:30 PM";
        try {
            date = df.parse(tdm45);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm45 = df.format(date);
        match45.setText(ftdm45);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm46 = "Jul 09, Tue 09:30 AM";
        try {
            date = df.parse(tdm46);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm46 = df.format(date);
        match46.setText(ftdm46);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm47 = "Jul 11, Thu 09:30 AM";
        try {
            date = df.parse(tdm47);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm47 = df.format(date);
        match47.setText(ftdm47);

        /////
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String tdm48 = "Jul 14, Sun 09:30 AM";
        try {
            date = df.parse(tdm48);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.setTimeZone(TimeZone.getDefault());
        String ftdm48 = df.format(date);
        match48.setText(ftdm48);
    }
}
