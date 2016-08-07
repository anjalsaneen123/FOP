package com.fop.anjal.footballourpassion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import org.json.JSONObject;

import java.util.ArrayList;

public class FixtureActivity extends AppCompatActivity {

    ArrayList<Fixtures> FixtureList = new ArrayList<Fixtures>();
    ListView listView;

    String json_fixture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixture);

        addtoList("GW1","The Brotherhood",
                "The White Walkers",


                "The Dothrakis",
                "The Valyrians",


                "The Faceless Men",
                "The Targaryens",


                "The Lannisters",
                "The Starks",


                "The Night's Watch",
                "The Second Sons"
                );
        addtoList("GW2","The Starks",
                "The Dothrakis",


                "The Targaryens",
                "The Brotherhood",


                "The White Walkers",
                "The Valyrians",


                "The Second Sons",
                "The Faceless Men",


                "The Night's Watch",
                "The Lannisters"
                );

        addtoList("GW3",

                "The Valyrians",
                "The Targaryens",


                "The Brotherhood",
                "The Starks",


                "The Second Sons",
                "The Dothrakis",


                "The Night's Watch",
                "The Faceless Men",
                "The Lannisters",
                "The White Walkers"
                );

        addtoList("GW4",

                "The Valyrians",
                "The Starks",


                "The Second Sons",
                "The Brotherhood",


                "The Lannisters",
                "The Faceless Men",


                "The White Walkers",
                "The Targaryens",


                "The Dothrakis",
                "The Night's Watch");

        addtoList("GW5",

                "The Valyrians",
                "The Faceless Men",


                "The Targaryens",
                "The Lannisters",


                "The Dothrakis",
                "The Brotherhood",


                "The Starks",
                "The Night's Watch",


                "The White Walkers",
                "The Second Sons");
        addtoList("GW6",

                "The Brotherhood",
                "The Lannisters",


                "The Faceless Men",
                "The Dothrakis",


                "The Starks",
                "The White Walkers",


                "The Targaryens",
                "The Second Sons",


                "The Night's Watch",
                "The Valyrians");
        addtoList("GW7",

                "The Faceless Men",
                "The Brotherhood",


                "The White Walkers",
                "The Dothrakis",


                "The Starks",
                "The Second Sons",


                "The Targaryens",
                "The Night's Watch",


                "The Valyrians",
                "The Lannisters");

        addtoList("GW8",

                "The Faceless Men",
                "The Starks",


                "The Dothrakis",
                "The Targaryens",


                "The Brotherhood",
                "The Valyrians",


                "The Night's Watch",
                "The White Walkers",


                "The Second Sons",
                "The Lannisters");

        addtoList("GW9",

                "The Targaryens",
                "The Starks",


                "The White Walkers",
                "The Faceless Men",


                "The Brotherhood",
                "The Night's Watch",


                "The Lannisters",
                "The Dothrakis",


                "The Second Sons",
                "The Valyrians");

        addtoList("GW10",

                "The White Walkers",
                "The Brotherhood",


                "The Valyrians",
                "The Dothrakis",


                "The Targaryens",
                "The Faceless Men",


                "The Starks",
                "The Lannisters",


                "The Second Sons",
                "The Night's Watch");

        addtoList("GW11",

                "The Dothrakis",
                "The Starks",


                "The Brotherhood",
                "The Targaryens",


                "The Valyrians",
                "The White Walkers",


                "The Faceless Men",
                "The Second Sons",


                "The Lannisters",
                "The Night's Watch");


        addtoList("GW12",

                "The Targaryens",
                "The Valyrians",


                "The Starks",
                "The Brotherhood",


                "The Dothrakis",
                "The Second Sons",


                "The Faceless Men",
                "The Night's Watch",


                "The White Walkers",
                "The Lannisters");




        addtoList("GW13",

                "The Starks",
                "The Valyrians",


                "The Brotherhood",
                "The Second Sons",


                "The Faceless Men",
                "The Lannisters",


                "The Targaryens",
                "The White Walkers",


                "The Night's Watch",
                "The Dothrakis");




        addtoList("GW14",

                "The Faceless Men",
                "The Valyrians",


                "The Lannisters",
                "The Targaryens",


                "The Brotherhood",
                "The Dothrakis",


                "The Night's Watch",
                "The Starks",


                "The Second Sons",
                "The White Walkers");




        addtoList("GW15",

                "The Lannisters",
                "The Brotherhood",


                "The Dothrakis",
                "The Faceless Men",


                "The White Walkers",
                "The Starks",


                "The Second Sons",
                "The Targaryens",


                "The Valyrians",
                "The Night's Watch");




        addtoList("GW16",

                "The Brotherhood",
                "The Faceless Men",


                "The Dothrakis",
                "The White Walkers",


                "The Second Sons",
                "The Starks",


                "The Night's Watch",
                "The Targaryens",


                "The Lannisters",
                "The Valyrians");




        addtoList("GW17",

                "The Starks",
                "The Faceless Men",


                "The Targaryens",
                "The Dothrakis",


                "The Valyrians",
                "The Brotherhood",


                "The White Walkers",
                "The Night's Watch",


                "The Lannisters",
                "The Second Sons");




        addtoList("GW18",

                "The Starks",
                "The Targaryens",


                "The Faceless Men",
                "The White Walkers",


                "The Night's Watch",
                "The Brotherhood",


                "The Dothrakis",
                "The Lannisters",


                "The Valyrians",
                "The Second Sons");




        addtoList("GW19",

                "The Brotherhood",
                "The White Walkers",


                "The Dothrakis",
                "The Valyrians",


                "The Faceless Men",
                "The Targaryens",


                "The Lannisters",
                "The Starks",


                "The Night's Watch",
                "The Second Sons");




        addtoList("GW20",

                "The Starks",
                "The Dothrakis",


                "The Targaryens",
                "The Brotherhood",


                "The White Walkers",
                "The Valyrians",


                "The Second Sons",
                "The Faceless Men",


                "The Night's Watch",
                "The Lannisters");




        addtoList("GW21",

                "The Valyrians",
                "The Targaryens",


                "The Brotherhood",
                "The Starks",


                "The Second Sons",
                "The Dothrakis",


                "The Night's Watch",
                "The Faceless Men",


                "The Lannisters",
                "The White Walkers");




        addtoList("GW22",

                "The Valyrians",
                "The Starks",


                "The Second Sons",
                "The Brotherhood",


                "The Lannisters",
                "The Faceless Men",


                "The White Walkers",
                "The Targaryens",


                "The Dothrakis",
                "The Night's Watch");




        addtoList("GW23",

                "The Valyrians",
                "The Faceless Men",


                "The Targaryens",
                "The Lannisters",


                "The Dothrakis",
                "The Brotherhood",


                "The Starks",
                "The Night's Watch",


                "The White Walkers",
                "The Second Sons");




        addtoList("GW24",

                "The Brotherhood",
                "The Lannisters",


                "The Faceless Men",
                "The Dothrakis",


                "The Starks",
                "The White Walkers",


                "The Targaryens",
                "The Second Sons",


                "The Night's Watch",
                "The Valyrians");




        addtoList("GW25",

                "The Faceless Men",
                "The Brotherhood",


                "The White Walkers",
                "The Dothrakis",


                "The Starks",
                "The Second Sons",


                "The Targaryens",
                "The Night's Watch",


                "The Valyrians",
                "The Lannisters");




        addtoList("GW26",

                "The Faceless Men",
                "The Starks",


                "The Dothrakis",
                "The Targaryens",


                "The Brotherhood",
                "The Valyrians",


                "The Night's Watch",
                "The White Walkers",


                "The Second Sons",
                "The Lannisters");




        addtoList("GW27",

                "The Targaryens",
                "The Starks",


                "The White Walkers",
                "The Faceless Men",


                "The Brotherhood",
                "The Night's Watch",


                "The Lannisters",
                "The Dothrakis",


                "The Second Sons",
                "The Valyrians");




        addtoList("GW28",

                "The White Walkers",
                "The Brotherhood",


                "The Valyrians",
                "The Dothrakis",


                "The Targaryens",
                "The Faceless Men",


                "The Starks",
                "The Lannisters",


                "The Second Sons",
                "The Night's Watch");




        addtoList("GW29",

                "The Dothrakis",
                "The Starks",


                "The Brotherhood",
                "The Targaryens",


                "The Valyrians",
                "The White Walkers",


                "The Faceless Men",
                "The Second Sons",


                "The Lannisters",
                "The Night's Watch");




        addtoList("GW30",

                "The Targaryens",
                "The Valyrians",


                "The Starks",
                "The Brotherhood",


                "The Dothrakis",
                "The Second Sons",


                "The Faceless Men",
                "The Night's Watch",


                "The White Walkers",
                "The Lannisters");




        addtoList("GW31",

                "The Starks",
                "The Valyrians",


                "The Brotherhood",
                "The Second Sons",


                "The Faceless Men",
                "The Lannisters",


                "The Targaryens",
                "The White Walkers",


                "The Night's Watch",
                "The Dothrakis");




        addtoList("GW32",

                "The Faceless Men",
                "The Valyrians",


                "The Lannisters",
                "The Targaryens",


                "The Brotherhood",
                "The Dothrakis",


                "The Night's Watch",
                "The Starks",


                "The Second Sons",
                "The White Walkers");




        addtoList("GW33",

                "The Lannisters",
                "The Brotherhood",


                "The Dothrakis",
                "The Faceless Men",


                "The White Walkers",
                "The Starks",


                "The Second Sons",
                "The Targaryens",


                "The Valyrians",
                "The Night's Watch");




        addtoList("GW34",

                "The Brotherhood",
                "The Faceless Men",


                "The Dothrakis",
                "The White Walkers",


                "The Second Sons",
                "The Starks",


                "The Night's Watch",
                "The Targaryens",


                "The Lannisters",
                "The Valyrians");




            addtoList("GW35",

                    "The Starks",
                    "The Faceless Men",


                    "The Targaryens",
                    "The Dothrakis",


                    "The Valyrians",
                    "The Brotherhood",


                    "The White Walkers",
                    "The Night's Watch",


                    "The Lannisters",
                    "The Second Sons");




            addtoList("GW36",

                    "The Starks",
                    "The Targaryens",


                    "The Faceless Men",
                    "The White Walkers",


                    "The Night's Watch",
                    "The Brotherhood",


                    "The Dothrakis",
                    "The Lannisters",


                    "The Valyrians",
                    "The Second Sons");














        listView = (ListView) findViewById(R.id.listview);

        AdapterFixture Fixture;

        Fixture= new AdapterFixture (FixtureActivity.this, 0, FixtureList);
        listView.setAdapter(Fixture);


    }

    void addtoList(String gw,String t1,String t2,String t3,String t4,String t5,String t6,String t7,String t8,String t9,String t10){

        Fixtures fixture = new Fixtures();

        fixture.setGw(gw);
        fixture.setT1(t1);
        fixture.setT2(t2);
        fixture.setT3(t3);
        fixture.setT4(t4);
        fixture.setT5(t5);
        fixture.setT6(t6);
        fixture.setT7(t7);
        fixture.setT8(t8);
        fixture.setT9(t9);
        fixture.setT10(t10);

        FixtureList.add(fixture);

    };
}
