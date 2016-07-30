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

    ArrayList<Players> PlayerList = new ArrayList<Players>();
    ImageView button;
    ImageView button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    RelativeLayout bg;
    int j=0,p=2;
    private ProgressBar spinner;
    Context context;

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
        spinner = (ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.VISIBLE);
        // get reference to the views


        // call AsynTask to perform network operation on separate thread
        new HttpAsyncTask().execute("https://fantasy.premierleague.com/drf/leagues-classic-standings/569?phase=1&le-page=1&ls-page=1");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, TableActivity.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);

                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team1.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team2.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);

                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team3.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);

                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team4.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);

                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team5.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);

                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team6.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);

                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team7.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);

                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team8.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);

                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team9.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);

                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeagueActivity.this, Team10.class);
                intent.putExtra("FILES_TO_SEND", PlayerList);

                startActivity(intent);
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
            j++;
            if(j==2){
                bg.setBackgroundResource(R.drawable.cl);
                Toast.makeText(getBaseContext(), " Data Received!", Toast.LENGTH_LONG).show();
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
                spinner.setVisibility(View.GONE);
            }

//            Log.d("RESULT:",result);
            try
            {
                JSONObject jsonRootObject = new JSONObject(result);

                JSONObject JSONnew_entries  = jsonRootObject.getJSONObject("new_entries");

//                JSONObject jSON_has_next =JSONnew_entries.getJSONObject("has_next");

                Log.d("ASDF",JSONnew_entries.getString("has_next"));


                JSONArray jsonResults = JSONnew_entries.optJSONArray("results");

                for (int i = 0; i < jsonResults.length(); i++) {
                    JSONObject object = jsonResults.getJSONObject(i);

                    Players player = new Players();

                    player.setEntry_name(object.getString("entry_name"));
                    player.setId(object.getString("id"));
                    player.setPlayer_first_name(object.getString("player_first_name"));
                    Log.d(String.valueOf(i),player.getPlayer_first_name());
                    player.setPlayer_last_name(object.getString("player_last_name"));
                    player.setEntry(object.getString("entry"));
                    player.setJoined_time(object.getString("joined_time"));

                    PlayerList.add(player);

                }
                if((JSONnew_entries.getString("has_next")).equals("true")) {

                    new HttpAsyncTask().execute("https://fantasy.premierleague.com/drf/leagues-classic-standings/569?phase=1&le-page="+String.valueOf(p)+"&ls-page="+String.valueOf(p));
                    p++;
                }
            }
            catch (JSONException e)
            {
                e.printStackTrace();
                Log.d("LeagueActivity:",e.toString());
            }

        }
    }
}