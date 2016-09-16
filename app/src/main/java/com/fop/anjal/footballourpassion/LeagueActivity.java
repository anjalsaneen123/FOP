package com.fop.anjal.footballourpassion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

import com.fop.anjal.footballourpassion.Teams.Team1;
import com.fop.anjal.footballourpassion.Teams.Team10;
import com.fop.anjal.footballourpassion.Teams.Team2;
import com.fop.anjal.footballourpassion.Teams.Team3;
import com.fop.anjal.footballourpassion.Teams.Team4;
import com.fop.anjal.footballourpassion.Teams.Team5;
import com.fop.anjal.footballourpassion.Teams.Team6;
import com.fop.anjal.footballourpassion.Teams.Team7;
import com.fop.anjal.footballourpassion.Teams.Team8;
import com.fop.anjal.footballourpassion.Teams.Team9;


public class LeagueActivity extends AppCompatActivity{

    ArrayList<Players> FullPlayerList = new ArrayList<Players>();
    ArrayList<HitData> Hits = new ArrayList<HitData>();
    ArrayList<Players> PlayerList = new ArrayList<Players>();
    ImageView button;
    ImageView button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,fixture,link,tml,link2;
    RelativeLayout bg;
    int j=0,p=2;
    private ProgressBar spinner;
    Context context;
    String current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league);
        bg = (RelativeLayout) findViewById(R.id.bg);
        button = (ImageView) findViewById(R.id.button);
        button1 = (ImageView) findViewById(R.id.button1);
        button2 = (ImageView) findViewById(R.id.button2);
        button3 = (ImageView) findViewById(R.id.button3);
        button4 = (ImageView) findViewById(R.id.button4);
        button5 = (ImageView) findViewById(R.id.button5);
        button6 = (ImageView) findViewById(R.id.button6);
        button7 = (ImageView) findViewById(R.id.button7);
        button8 = (ImageView) findViewById(R.id.button8);
        button9 = (ImageView) findViewById(R.id.button9);
        button10 = (ImageView) findViewById(R.id.button10);
        link = (ImageView) findViewById(R.id.link);
        tml = (ImageView) findViewById(R.id.tml);
        link2 = (ImageView) findViewById(R.id.link2);
        fixture = (ImageView) findViewById(R.id.fixture);
        spinner = (ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.VISIBLE);
        // get reference to the views

        new HttpAsyncTaskDynamic().execute("https://fantasy.premierleague.com/drf/bootstrap-dynamic");

        // call AsynTask to perform network operation on separate thread

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, TableActivity.class);
                intent.putExtra("FILES_TO_SEND", FullPlayerList);

                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team1.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                intent.putExtra("FILES_TO",Hits);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team2.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                intent.putExtra("FILES_TO",Hits);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team3.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                intent.putExtra("FILES_TO",Hits);

                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team4.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                intent.putExtra("FILES_TO",Hits);

                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team5.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                intent.putExtra("FILES_TO",Hits);

                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team6.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                intent.putExtra("FILES_TO",Hits);

                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team7.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                intent.putExtra("FILES_TO",Hits);

                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team8.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                intent.putExtra("FILES_TO",Hits);

                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team9.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                intent.putExtra("FILES_TO",Hits);

                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team10.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                intent.putExtra("FILES_TO",Hits);

                startActivity(intent);
            }
        });

        fixture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, FixtureActivity.class);
                startActivity(intent);
            }
        });

        tml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Tml.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                intent.putExtra("FILES_TO",Hits);
                startActivity(intent);
            }
        });
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://fop.maruthamon.com/FPLWeb/FOPLaunch.jsp"));
                startActivity(myIntent);
            }
        });
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://fantasy.premierleague.com/a/leagues/standings/569/classic"));
                startActivity(myIntent);
            }
        });

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
//        Log.d("result:",result);
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

//            Log.d("RESULT:",result);
            try
            {
                JSONObject jsonRootObject = new JSONObject(result);

                JSONObject JSONnew_entries  = jsonRootObject.getJSONObject("standings");

//                JSONObject jSON_has_next =JSONnew_entries.getJSONObject("has_next");

                Log.d("ASDF",JSONnew_entries.getString("has_next"));


                JSONArray jsonResults = JSONnew_entries.optJSONArray("results");

                for (int i = 0; i < jsonResults.length(); i++) {
                    JSONObject object = jsonResults.getJSONObject(i);

                    Players player = new Players();
                    
                    int rr=Integer.parseInt(object.getString("entry"));

                    player.setEntry_name(object.getString("entry_name"));
                    player.setId(object.getString("id"));
                    player.setPlayer_name(object.getString("player_name"));

                    Log.d(String.valueOf(i),player.getPlayer_name());

                    player.setEntry(object.getString("entry"));
                    player.setRank(object.getString("rank"));
                    player.setGw_score(object.getString("event_total"));

                    player.setTotal_score(object.getString("total"));

                    FullPlayerList.add(player);


                    int ss=Integer.parseInt(object.getString("entry"));
                    if(ss==811
                            || ss==76418
                            || ss==65975
                            || ss==202150
                            || ss==5912
                            || ss==10598
                            || ss==49972

                            || ss==218915
                            || ss==108
                            || ss==34815
                            || ss==153210
                            || ss==26487
                            || ss==204558
                            || ss==33905

                            || ss==18848
                            || ss==2475
                            || ss==258027
                            || ss==314710
                            || ss==2101
                            || ss==169616
                            || ss==1488

                            || ss==591
                            || ss==50973
                            || ss==28466
                            || ss==77009
                            || ss==27006
                            || ss==24132
                            || ss==21538

                            || ss==59795
                            || ss==166225
                            || ss==7519
                            || ss==57414
                            || ss==4183
                            || ss==12066
                            || ss==8167

                            || ss==779
                            || ss==326
                            || ss==140848
                            || ss==54270
                            || ss==171201
                            || ss==246771
                            || ss==24091

                            || ss==52439
                            || ss==111640
                            || ss==167014
                            || ss==275735
                            || ss==195304
                            || ss==959
                            || ss==4375

                            || ss==342
                            || ss==103470
                            || ss==1750
                            || ss==124666
                            || ss==541
                            || ss==823
                            || ss==22739

                            || ss==30325
                            || ss==253604
                            || ss==38110
                            || ss==294565
                            || ss==6721
                            || ss==32
                            || ss==260706

                            || ss==133834
                            || ss==47810
                            || ss==40184
                            || ss==105706
                            || ss==102
                            || ss==6480
                            || ss==62002)
                    {
                        Log.d(String.valueOf(i)+"to",player.getPlayer_name());
                        PlayerList.add(player);
                        new HttpAsyncTaskHit().execute("https://fantasy.premierleague.com/drf/entry/"+object.getString("entry")+"/event/"+current+"/picks");

                    }

                }
                if((JSONnew_entries.getString("has_next")).equals("true")) {
                    new HttpAsyncTask().execute("https://fantasy.premierleague.com/drf/leagues-classic-standings/569?phase=1&le-page="+String.valueOf(p)+"&ls-page="+String.valueOf(p));
                    p++;
                }
                else
                {
                    bg.setBackgroundResource(R.drawable.cl);
                    Toast.makeText(getBaseContext(), " Data Received!", Toast.LENGTH_SHORT).show();
                    button.setVisibility(View.VISIBLE);
                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    button4.setVisibility(View.VISIBLE);
                    button5.setVisibility(View.VISIBLE);
                    button6.setVisibility(View.VISIBLE);
                    button7.setVisibility(View.VISIBLE);
                    button8.setVisibility(View.VISIBLE);
                    button9.setVisibility(View.VISIBLE);
                    button10.setVisibility(View.VISIBLE);
                    fixture.setVisibility(View.VISIBLE);
                    tml.setVisibility(View.VISIBLE);
                    spinner.setVisibility(View.GONE);
                }
            }
            catch (JSONException e)
            {
                e.printStackTrace();
                Log.d("LeagueActivity:",e.toString());
            }
        }
    }

    private class HttpAsyncTaskDynamic extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
            return GET(urls[0]);
        }
        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {

//            Log.d("RESULT:",result);
            try
            {
                JSONObject jsonRootObject = new JSONObject(result);

                current=jsonRootObject.getString("current-event");
                Log.e("Current:",current);



                new HttpAsyncTask().execute("https://fantasy.premierleague.com/drf/leagues-classic-standings/569?phase=1&le-page=1&ls-page=1");

            }
            catch (JSONException e)
            {
                e.printStackTrace();
                Log.d("LeagueActivity:",e.toString());
            }

        }
    }
    private class HttpAsyncTaskHit extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
            return GET(urls[0]);
        }
        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {

//            Log.d("RESULT:",result);
            try
            {
                HitData hit = new HitData();

                JSONObject jsonRootObject = new JSONObject(result);
                JSONObject object  = jsonRootObject.getJSONObject("entry_history");

                hit.setHit(object.getString("event_transfers_cost"));
                hit.setCurrent(current);
                Log.e("Cost:",object.getString("event_transfers_cost"));
                Hits.add(hit);

            }
            catch (JSONException e)
            {
                e.printStackTrace();
                Log.d("LeagueActivity:",e.toString());
            }

        }
    }
}