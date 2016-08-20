package com.fop.anjal.footballourpassion;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anjal on 30-Jul-16.
 */
public class AdapterPlayer extends ArrayAdapter<Players> {
    private Activity activity;
    private ArrayList<Players> lPerson;
    private static LayoutInflater inflater = null;

    public AdapterPlayer (Activity activity, int textViewResourceId,ArrayList<Players> _lPerson) {
        super(activity, textViewResourceId, _lPerson);
        try {
            this.activity = activity;
            this.lPerson = _lPerson;

            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        } catch (Exception e) {

        }
    }

    public int getCount() {
        return lPerson.size();
    }

    public Players getItem(Players position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        public TextView name,date,id,team_name,rank,total_point,fop;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        final ViewHolder holder;
        try {
            if (convertView == null) {
                vi = inflater.inflate(R.layout.player_item, null);
                holder = new ViewHolder();

                holder.team_name = (TextView) vi.findViewById(R.id.team_name);
                holder.name = (TextView) vi.findViewById(R.id.name);
                holder.fop = (TextView) vi.findViewById(R.id.fop_team);
                holder.date = (TextView) vi.findViewById(R.id.date);
                holder.rank = (TextView) vi.findViewById(R.id.rank);
                holder.total_point = (TextView) vi.findViewById(R.id.total_point);

                vi.setTag(holder);
            } else {
                holder = (ViewHolder) vi.getTag();
            }



            holder.team_name.setText(lPerson.get(position).getEntry_name());
            holder.name.setText((lPerson.get(position).getPlayer_name()));
            holder.date.setText(lPerson.get(position).getGw_score());
            holder.rank.setText(lPerson.get(position).getRank());
            holder.total_point.setText(lPerson.get(position).getTotal_score());

            int rr=Integer.parseInt(lPerson.get(position).getEntry());

            if (rr==811
                    ||rr==76418
                    ||rr==65975
                    ||rr==202150
                    ||rr==5912
                    ||rr==10598
                    ||rr==49972){
                    holder.fop.setText("White wankers");
            }
            else if (rr==218915
                    ||rr==108
                    ||rr==34815
                    ||rr==153210
                    ||rr==26487
                    ||rr==204558
                    ||rr==33905){
                holder.fop.setText("Faceless men");
            }
            else if (rr==18848
                    ||rr==2475
                    ||rr==258027
                    ||rr==314710
                    ||rr==2101
                    ||rr==169616
                    ||rr==1488){
                holder.fop.setText("Targaryrns");
            }
            else if (rr==591
                    ||rr==50973
                    ||rr==28466
                    ||rr==77009
                    ||rr==27006
                    ||rr==24132
                    ||rr==21538){
                holder.fop.setText("Night's Watch");
            }
            else if (rr==59795
                    ||rr==166225
                    ||rr==7519
                    ||rr==57414
                    ||rr==4183
                    ||rr==12066
                    ||rr==8167){
                holder.fop.setText("Starks");
            }
            else if (rr==779
                    ||rr==326
                    ||rr==140848
                    ||rr==54270
                    ||rr==171201
                    ||rr==246771
                    ||rr==24091){
                holder.fop.setText("Lannisters");
            }
            else if (rr==52439
                    ||rr==111640
                    ||rr==167014
                    ||rr==275735
                    ||rr==195304
                    ||rr==959
                    ||rr==4375){
                holder.fop.setText("Dothraki");
            }
            else if (rr==342
                    ||rr==103470
                    ||rr==1750
                    ||rr==124666
                    ||rr==541
                    ||rr==823
                    ||rr==22739){
                holder.fop.setText("Brotherhood");
            }
            else if (rr==30325
                    ||rr==253604
                    ||rr==38110
                    ||rr==294565
                    ||rr==6721
                    ||rr==32
                    ||rr==260706){
                holder.fop.setText("Valyrians");
            }
            else if (rr==133834
                    ||rr==47810
                    ||rr==40184
                    ||rr==105706
                    ||rr==102
                    ||rr==6480
                    ||rr==62002){
                holder.fop.setText("Second Son");
            }
            else {
                holder.fop.setText("N/A");
            }



        } catch (Exception e) {


        }
        return vi;
    }
}