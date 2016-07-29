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
        public TextView name,date,id,team_name;

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
                holder.id = (TextView) vi.findViewById(R.id.id);
                holder.date = (TextView) vi.findViewById(R.id.date);


                vi.setTag(holder);
            } else {
                holder = (ViewHolder) vi.getTag();
            }



            holder.team_name.setText(lPerson.get(position).getEntry_name());
            holder.name.setText((lPerson.get(position).getPlayer_first_name())+" "+(lPerson.get(position).getPlayer_last_name()));
            holder.date.setText(lPerson.get(position).getJoined_time());
            holder.id.setText(lPerson.get(position).getEntry());

        } catch (Exception e) {


        }
        return vi;
    }
}