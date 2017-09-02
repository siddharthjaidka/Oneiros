package com.muj.android.oneiros.backend;


import android.content.Context;
import android.widget.Toast;

import com.muj.android.oneiros.R;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

/**
 * Created by Shiavngi Pandey on 31-08-2017.
 */

public class Club {

    int[] clubResources = {R.raw.aperture,R.raw.cinefilia,R.raw.shabd,R.raw.musicclubeventslist,R.raw.coreography,R.raw.scribbles,R.raw.litmusevents,R.raw.sophia,R.raw.cinefilia_aperture,R.raw.cinefilia_shabdh};
    Context context;

    public Club(Context context){
        this.context = context;
    }


    public String[] getClubNames(){
        JSONObject jsonObject = null;
        String[] name = new String[clubResources.length];
        try {
            for(int i = 0;i<clubResources.length;i++){
                jsonObject = (JSONObject) new JSONTokener((getJsonString(clubResources[i]))).nextValue();
                name[i] = jsonObject.getString("name");

             }
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(context,"in jsonObj", Toast.LENGTH_SHORT).show();
        }
        return name;
    }

    private String getJsonString(int index){

        InputStream inputStream = context.getResources().openRawResource(index);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];

        try {
            Reader reader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
            int n;
            while((n = reader.read(buffer)) != -1){
                writer.write(buffer,0,n);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return writer.toString();
    }
}
