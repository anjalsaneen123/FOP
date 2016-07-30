package com.fop.anjal.footballourpassion.Teams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.fop.anjal.footballourpassion.Players;
import com.fop.anjal.footballourpassion.R;

import java.util.ArrayList;

public class Team9 extends AppCompatActivity {

    ArrayList<Players> PlayersList = new ArrayList<Players>();
    TextView name1,name2,name3,name4,name5,name6,name7,total,score1,score2,score3,score4,score5,score6,score7;

    int total_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team9);

        PlayersList =  (ArrayList<Players>)getIntent().getSerializableExtra("FILES_TO_SEND");

        name1=(TextView) findViewById(R.id.name1);
        name2=(TextView) findViewById(R.id.name2);
        name3=(TextView) findViewById(R.id.name3);
        name4=(TextView) findViewById(R.id.name4);
        name5=(TextView) findViewById(R.id.name5);
        name6=(TextView) findViewById(R.id.name6);
        name7=(TextView) findViewById(R.id.name7);

        total = (TextView)findViewById(R.id.total);

        score1=(TextView) findViewById(R.id.score1);
        score2=(TextView) findViewById(R.id.score2);
        score3=(TextView) findViewById(R.id.score3);
        score4=(TextView) findViewById(R.id.score4);
        score5=(TextView) findViewById(R.id.score5);
        score6=(TextView) findViewById(R.id.score6);
        score7=(TextView) findViewById(R.id.score7);

        for(int i=0;i<PlayersList.size();i++)
        {
            if((PlayersList.get(i).getEntry()).equals("30325")){
                name1.setText((PlayersList.get(i).getPlayer_first_name())+" "+(PlayersList.get(i).getPlayer_last_name()));
                score1.setText(PlayersList.get(i).getEntry());
                total_score=total_score+Integer.parseInt(PlayersList.get(i).getEntry());
                break;
            }
        }
        for(int i=0;i<PlayersList.size();i++)
        {
            if((PlayersList.get(i).getEntry()).equals("253604")){
                name2.setText((PlayersList.get(i).getPlayer_first_name())+" "+(PlayersList.get(i).getPlayer_last_name()));
                score2.setText(PlayersList.get(i).getEntry());
                total_score=total_score+Integer.parseInt(PlayersList.get(i).getEntry());
                break;
            }
        }
        for(int i=0;i<PlayersList.size();i++)
        {
            if((PlayersList.get(i).getEntry()).equals("38110")){
                name3.setText((PlayersList.get(i).getPlayer_first_name())+" "+(PlayersList.get(i).getPlayer_last_name()));
                score3.setText(PlayersList.get(i).getEntry());
                total_score=total_score+Integer.parseInt(PlayersList.get(i).getEntry());
                break;
            }
        }
        for(int i=0;i<PlayersList.size();i++)
        {
            if((PlayersList.get(i).getEntry()).equals("294565")){
                name4.setText((PlayersList.get(i).getPlayer_first_name())+" "+(PlayersList.get(i).getPlayer_last_name()));
                score4.setText(PlayersList.get(i).getEntry());
                total_score=total_score+Integer.parseInt(PlayersList.get(i).getEntry());
                break;
            }
        }
        for(int i=0;i<PlayersList.size();i++)
        {
            if((PlayersList.get(i).getEntry()).equals("6721")){
                name5.setText((PlayersList.get(i).getPlayer_first_name())+" "+(PlayersList.get(i).getPlayer_last_name()));
                score5.setText(PlayersList.get(i).getEntry());
                total_score=total_score+Integer.parseInt(PlayersList.get(i).getEntry());
                break;
            }
        }
        for(int i=0;i<PlayersList.size();i++)
        {
            if((PlayersList.get(i).getEntry()).equals("32")){
                name6.setText((PlayersList.get(i).getPlayer_first_name())+" "+(PlayersList.get(i).getPlayer_last_name()));
                score6.setText(PlayersList.get(i).getEntry());
                total_score=total_score+Integer.parseInt(PlayersList.get(i).getEntry());
                break;
            }
        }
        for(int i=0;i<PlayersList.size();i++)
        {
            if((PlayersList.get(i).getEntry()).equals("260706")){
                name7.setText((PlayersList.get(i).getPlayer_first_name())+" "+(PlayersList.get(i).getPlayer_last_name()));
                score7.setText(PlayersList.get(i).getEntry());
                total_score=total_score+Integer.parseInt(PlayersList.get(i).getEntry());
                break;
            }
        }
        total.setText(String.valueOf(total_score));
    }
}
