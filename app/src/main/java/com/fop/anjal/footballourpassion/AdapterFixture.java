package com.fop.anjal.footballourpassion;

/**
 * Created by anjal on 7/8/16.
 */

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
public class AdapterFixture extends ArrayAdapter<Fixtures> {
    private Activity activity;
    private ArrayList<Fixtures> lPerson;
    private static LayoutInflater inflater = null;

    public AdapterFixture (Activity activity, int textViewResourceId,ArrayList<Fixtures> _lPerson) {
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

    public Fixtures getItem(Fixtures position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        public TextView gw,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        final ViewHolder holder;
        try {
            if (convertView == null) {
                vi = inflater.inflate(R.layout.fixture_item, null);
                holder = new ViewHolder();

                holder.gw = (TextView) vi.findViewById(R.id.gw);
                holder.t1 = (TextView) vi.findViewById(R.id.t1);
                holder.t2 = (TextView) vi.findViewById(R.id.t2);
                holder.t3 = (TextView) vi.findViewById(R.id.t3);
                holder.t4 = (TextView) vi.findViewById(R.id.t4);
                holder.t5 = (TextView) vi.findViewById(R.id.t5);
                holder.t6 = (TextView) vi.findViewById(R.id.t6);
                holder.t7 = (TextView) vi.findViewById(R.id.t7);
                holder.t8 = (TextView) vi.findViewById(R.id.t8);
                holder.t9 = (TextView) vi.findViewById(R.id.t9);
                holder.t10 = (TextView) vi.findViewById(R.id.t10);

                vi.setTag(holder);
            } else {
                holder = (ViewHolder) vi.getTag();
            }



            holder.gw.setText(lPerson.get(position).getGw());
            holder.t1.setText(lPerson.get(position).getT1());
            holder.t2.setText(lPerson.get(position).getT2());
            holder.t3.setText(lPerson.get(position).getT3());
            holder.t4.setText(lPerson.get(position).getT4());
            holder.t5.setText(lPerson.get(position).getT5());
            holder.t6.setText(lPerson.get(position).getT6());
            holder.t7.setText(lPerson.get(position).getT7());
            holder.t8.setText(lPerson.get(position).getT8());
            holder.t9.setText(lPerson.get(position).getT9());
            holder.t10.setText(lPerson.get(position).getT10());


        } catch (Exception e) {


        }
        return vi;
    }
}