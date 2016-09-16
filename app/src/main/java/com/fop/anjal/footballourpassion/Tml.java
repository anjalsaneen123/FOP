package com.fop.anjal.footballourpassion;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tml extends AppCompatActivity {
    ArrayList<Players> PlayersList = new ArrayList<Players>();
    ArrayList<HitData> Hits = new ArrayList<HitData>();

    String current;
    int avg;
    ProgressBar spinner;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,
                t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40;
    TextView s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,
            s21,s22,s23,s24,s25,s26,s27,s28,s29,s30,s31,s32,s33,s34,s35,s36,s37,s38,s39,s40;
    TextView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20;
    TextView avg_textview;
    ScrollView scrollView;

    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tml);

        PlayersList =  (ArrayList<Players>)getIntent().getSerializableExtra("FILES_TO_SEND");
        Hits = (ArrayList<HitData>)getIntent().getSerializableExtra("FILES_TO");

        scrollView = (ScrollView)findViewById(R.id.scrollView);

        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.t2);
        t3=(TextView) findViewById(R.id.t3);
        t4=(TextView) findViewById(R.id.t4);
        t5=(TextView) findViewById(R.id.t5);
        t6=(TextView) findViewById(R.id.t6);
        t7=(TextView) findViewById(R.id.t7);
        t8=(TextView) findViewById(R.id.t8);
        t9=(TextView) findViewById(R.id.t9);
        t10=(TextView) findViewById(R.id.t10);

        t11=(TextView) findViewById(R.id.t11);
        t12=(TextView) findViewById(R.id.t12);
        t13=(TextView) findViewById(R.id.t13);
        t14=(TextView) findViewById(R.id.t14);
        t15=(TextView) findViewById(R.id.t15);
        t16=(TextView) findViewById(R.id.t16);
        t17=(TextView) findViewById(R.id.t17);
        t18=(TextView) findViewById(R.id.t18);
        t19=(TextView) findViewById(R.id.t19);
        t20=(TextView) findViewById(R.id.t20);

        t21=(TextView) findViewById(R.id.t21);
        t22=(TextView) findViewById(R.id.t22);
        t23=(TextView) findViewById(R.id.t23);
        t24=(TextView) findViewById(R.id.t24);
        t25=(TextView) findViewById(R.id.t25);
        t26=(TextView) findViewById(R.id.t26);
        t27=(TextView) findViewById(R.id.t27);
        t28=(TextView) findViewById(R.id.t28);
        t29=(TextView) findViewById(R.id.t29);
        t30=(TextView) findViewById(R.id.t30);

        t31=(TextView) findViewById(R.id.t31);
        t32=(TextView) findViewById(R.id.t32);
        t33=(TextView) findViewById(R.id.t33);
        t34=(TextView) findViewById(R.id.t34);
        t35=(TextView) findViewById(R.id.t35);
        t36=(TextView) findViewById(R.id.t36);
        t37=(TextView) findViewById(R.id.t37);
        t38=(TextView) findViewById(R.id.t38);
        t39=(TextView) findViewById(R.id.t39);
        t40=(TextView) findViewById(R.id.t40);

        a1=(TextView) findViewById(R.id.a1);
        a2=(TextView) findViewById(R.id.a2);
        a3=(TextView) findViewById(R.id.a3);
        a4=(TextView) findViewById(R.id.a4);
        a5=(TextView) findViewById(R.id.a5);
        a6=(TextView) findViewById(R.id.a6);
        a7=(TextView) findViewById(R.id.a7);
        a8=(TextView) findViewById(R.id.a8);
        a9=(TextView) findViewById(R.id.a9);
        a10=(TextView) findViewById(R.id.a10);

        a11=(TextView) findViewById(R.id.a11);
        a12=(TextView) findViewById(R.id.a12);
        a13=(TextView) findViewById(R.id.a13);
        a14=(TextView) findViewById(R.id.a14);
        a15=(TextView) findViewById(R.id.a15);
        a16=(TextView) findViewById(R.id.a16);
        a17=(TextView) findViewById(R.id.a17);
        a18=(TextView) findViewById(R.id.a18);
        a19=(TextView) findViewById(R.id.a19);
        a20=(TextView) findViewById(R.id.a20);

        s1=(TextView) findViewById(R.id.s1);
        s2=(TextView) findViewById(R.id.s2);
        s3=(TextView) findViewById(R.id.s3);
        s4=(TextView) findViewById(R.id.s4);
        s5=(TextView) findViewById(R.id.s5);
        s6=(TextView) findViewById(R.id.s6);
        s7=(TextView) findViewById(R.id.s7);
        s8=(TextView) findViewById(R.id.s8);
        s9=(TextView) findViewById(R.id.s9);
        s10=(TextView) findViewById(R.id.s10);

        s11=(TextView) findViewById(R.id.s11);
        s12=(TextView) findViewById(R.id.s12);
        s13=(TextView) findViewById(R.id.s13);
        s14=(TextView) findViewById(R.id.s14);
        s15=(TextView) findViewById(R.id.s15);
        s16=(TextView) findViewById(R.id.s16);
        s17=(TextView) findViewById(R.id.s17);
        s18=(TextView) findViewById(R.id.s18);
        s19=(TextView) findViewById(R.id.s19);
        s20=(TextView) findViewById(R.id.s20);

        s21=(TextView) findViewById(R.id.s21);
        s22=(TextView) findViewById(R.id.s22);
        s23=(TextView) findViewById(R.id.s23);
        s24=(TextView) findViewById(R.id.s24);
        s25=(TextView) findViewById(R.id.s25);
        s26=(TextView) findViewById(R.id.s26);
        s27=(TextView) findViewById(R.id.s27);
        s28=(TextView) findViewById(R.id.s28);
        s29=(TextView) findViewById(R.id.s29);
        s30=(TextView) findViewById(R.id.s30);

        s31=(TextView) findViewById(R.id.s31);
        s32=(TextView) findViewById(R.id.s32);
        s33=(TextView) findViewById(R.id.s33);
        s34=(TextView) findViewById(R.id.s34);
        s35=(TextView) findViewById(R.id.s35);
        s36=(TextView) findViewById(R.id.s36);
        s37=(TextView) findViewById(R.id.s37);
        s38=(TextView) findViewById(R.id.s38);
        s39=(TextView) findViewById(R.id.s39);
        s40=(TextView) findViewById(R.id.s40);

        avg_textview = (TextView)findViewById(R.id.avg);

        spinner = (ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.VISIBLE);

        new HttpAsyncTask().execute("https://fantasy.premierleague.com/drf/bootstrap-static");

    }
    public static String GET(String url){
        InputStream inputStream = null;
        String result = "";
        try {

            // create HttpClient
            HttpClient httpclient = new DefaultHttpClient();

            // make GET request to the given URL
            HttpResponse httpResponse = httpclient.execute(new HttpGet(url));

            // receive response as inputStream
            inputStream = httpResponse.getEntity().getContent();

            // convert inputstream to string
            if(inputStream != null)
                result = convertInputStreamToString(inputStream);
            else
                result = "Did not work!";

        } catch (Exception e) {
            Log.d("InputStream", e.getLocalizedMessage());
        }

        return result;
    }

    private static String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while((line = bufferedReader.readLine()) != null)
            result += line;

        inputStream.close();
        return result;
    }

    private class HttpAsyncTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
            return GET(urls[0]);
        }

        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {
            try {
                JSONObject jsonRootObject = new JSONObject(result);
                JSONArray events = jsonRootObject.optJSONArray("events");

                for (i= 0; i < events.length(); i++) {
                    JSONObject object = events.getJSONObject(i);

                    current = object.getString("is_current");
                    if(current.equals("true")){
                        avg = Integer.parseInt(object.getString("average_entry_score"));
                        scrollView.setVisibility(View.VISIBLE);
                        spinner.setVisibility(View.GONE);
                        avg_textview.setText("Overall Average: "+String.valueOf(avg));
                        break;
                    }
                }
                if(i==events.length()){
                    Toast.makeText(getBaseContext(), "oops.something wrong!!!", Toast.LENGTH_SHORT).show();
                }
                Log.d("avg:",String.valueOf(avg));

                findgoal("811","30325",s1,s2,t1,t2,a1);
                findgoal("108","218915",s3,s4,t3,t4,a2);

                findgoal("32","133834",s5,s6,t5,t6,a3);
                findgoal("7519","33905",s7,s8,t7,t8,a4);

                findgoal("8167","823",s9,s10,t9,t10,a5);
                findgoal("541","27006",s11,s12,t11,t12,a6);

                findgoal("24091","326",s13,s14,t13,t14,a7);
                findgoal("260706","204558",s15,s16,t15,t16,a8);

                findgoal("50973","2475",s17,s18,t17,t18,a9);
                findgoal("12066","49972",s19,s20,t19,t20,a10);

                findgoal("102","2101",s21,s22,t21,t22,a11);
                findgoal("1750","57414",s23,s24,t23,t24,a12);

                findgoal("47810","342",s25,s26,t25,t26,a13);
                findgoal("52439","591",s27,s28,t27,t28,a14);

                findgoal("34815","21538",s29,s30,t29,t30,a15);
                findgoal("6721","24132",s31,s32,t31,t32,a16);

                findgoal("26487","4183",s33,s34,t33,t34,a17);
                findgoal("6480","40184",s35,s36,t35,t36,a18);

                findgoal("166225","258027",s37,s38,t37,t38,a19);
                findgoal("22739","1488",s39,s40,t39,t40,a20);







            }
            catch (Exception e) {
            }
        }
    }
    void findgoal(String p1,String p2,TextView q1,TextView q2,TextView n1,TextView n2,TextView tttt){
        int sc1=0,sc2=0,rr,g1=0,g2=0;
        for(int i=0;i<PlayersList.size();i++)
        {
            if((PlayersList.get(i).getEntry()).equals(p1)){
                sc1=Integer.parseInt(PlayersList.get(i).getGw_score())-(Integer.parseInt(Hits.get(i).getHit()));
                n1.setText(PlayersList.get(i).getPlayer_name()+"  "+String.valueOf(sc1));
                Log.e("Hit",String.valueOf(Integer.parseInt(Hits.get(i).getHit())));
                final String link= "http://fantasy.premierleague.com/a/team/"+PlayersList.get(i).getEntry()+"/event/"+Hits.get(i).getCurrent();
                n1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                        startActivity(myIntent);
                    }
                });
            }
            if((PlayersList.get(i).getEntry()).equals(p2)){
                sc2=Integer.parseInt(PlayersList.get(i).getGw_score())-(Integer.parseInt(Hits.get(i).getHit()));
                n2.setText(PlayersList.get(i).getPlayer_name()+"  "+String.valueOf(sc2));
                Log.e("Hit",String.valueOf(Integer.parseInt(Hits.get(i).getHit())));
                final String link= "http://fantasy.premierleague.com/a/team/"+PlayersList.get(i).getEntry()+"/event/"+Hits.get(i).getCurrent();
                n2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                        startActivity(myIntent);
                    }
                });
            }
        }
        int avgg=avg+6;
        if(sc1>avgg){
            g1=((sc1-avgg)/10)+1;
        }
        else if(sc1<avgg){
            avgg=avg-5;
            g1=-((avgg-sc1)/10+1);
        }
        else {
            g1=0;
        }
        g1=diff(sc1-avg);
        g2=diff(sc2-avg);


        tttt.setText(String.valueOf(g1+g2));
        q1.setText(String.valueOf(g1));
        q2.setText(String.valueOf(g2));

    }
    int diff(int w){
        if(w>0 && w<=5){
            return  0;
        }
        else  if(w>0 &&w<=15){
            return 1;
        }
        else  if(w>0 &&w<=25){
            return 2;
        }
        else  if(w>0 &&w<=35){
            return 3;
        }
        else  if(w>0 &&w<=45){
            return 4;
        }
        else  if(w>0 &&w<=55){
            return 5;
        }
        else  if(w>0 &&w<=65){
            return 6;
        }
        else  if(w>0 &&w<=75){
            return 7;
        }
        else  if(w>0 &&w<=85){
            return 8;
        }
        else  if(w>0 &&w<=95){
            return 9;
        }
        else  if(w>0 &&w<=105){
            return 10;
        }
        else  if(w>0 &&w<=115){
            return 11;
        }
        else  if(w>0 &&w<=125){
            return 12;
        }
        else  if(w>0 &&w<=135){
            return 13;
        }
        else  if(w>0 &&w<=145){
            return 14;
        }
        else  if(w>0 &&w<=155){
            return 14;
        }
        else  if(w<0 &&w>-5){
            return 0;
        }
        else  if(w<0 &&w>-15){
            return -1;
        }
        else  if(w<0 &&w>-25){
            return -2;
        }
        else  if(w<0 &&w>-35){
            return -3;
        }
        else  if(w<0 &&w>-45){
            return -4;
        }
        else  if(w<0 &&w>-55){
            return -5;
        }
        else  if(w<0 &&w>-65){
            return -6;
        }
        else  if(w<0 &&w>-75){
            return -7;
        }
        else  if(w<0 &&w>-85){
            return -8;
        }
        else  if(w<0 &&w>-95){
            return -9;
        }
        else if(w==0)
        {
            return 0;
        }
        else
            return 100;
    }
}
