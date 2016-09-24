package com.example.android.myapplication;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by natal on 23/09/2016.
 */
public class JSONFromURL extends AsyncTask<String, String, String> {

    private static final String DEBUG_TAG = "HttpConnection...";
        private Activity myContextRef;
    private WunderCar wunderCar;


    //Constructor
    public JSONFromURL(Activity myContextRef) {
        this.myContextRef = myContextRef;
    }


    // Download the file JSON into SD Card.
    @Override
    protected String doInBackground(String... urls) {

        try {

            //Create file with the information from the URL
            downloadUrl(urls[0]);
            Log.i(DEBUG_TAG, "JSON downloaded");

            return "";

        } catch (IOException e) {
            Log.e(DEBUG_TAG, "Unable to retrieve web page. URL may be invalid.");
            return "";
        }
    }

    // Given a URL, establishes an HttpUrlConnection and retrieves
    // the web page content. Save into database
    private String downloadUrl(String urlString) throws IOException {

        try {

            URL jsonUrl = new URL(urlString);
            ObjectMapper mapper = new ObjectMapper();
            wunderCar = new WunderCar();
            wunderCar = mapper.readValue(jsonUrl, WunderCar.class);

            Log.e(DEBUG_TAG,"SAVING JSON");

            //shared preferences
            saveJSONintoShared();
            //SQLite
           // saveJSONSQL();



            return "";


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return "";

    }



    // onPostExecute displays the results of the AsyncTask.
    @Override
    protected void onPostExecute(String result) {
        //textView.setText(result);

    }

    private void saveJSONintoShared (){

        int wunderSize = wunderCar.getPlacemarks().size();
        Log.e(DEBUG_TAG,wunderCar.getPlacemarks().get(0).getAddress()+" size "+wunderSize);
        PreferenceManager.getDefaultSharedPreferences(myContextRef).edit().
                putString("jSon",wunderCar.getPlacemarks().toString()).apply();

    }


}



