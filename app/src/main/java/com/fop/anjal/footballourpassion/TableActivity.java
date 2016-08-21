package com.fop.anjal.footballourpassion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TableActivity extends AppCompatActivity {
    ArrayList<Players> FullPlayersList = new ArrayList<Players>();
    TextView name;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        name = (TextView) findViewById(R.id.name);
        listview = (ListView) findViewById(R.id.listview);


        FullPlayersList =  (ArrayList<Players>)getIntent().getSerializableExtra("FILES_TO_SEND");

//        name.setText(FullPlayersList.get(1).getPlayer_first_name());

        AdapterPlayer Person;

        Person= new AdapterPlayer (TableActivity.this, 0, FullPlayersList);
        listview.setAdapter(Person);
    }
}
