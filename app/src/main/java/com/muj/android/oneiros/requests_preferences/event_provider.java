package com.muj.android.oneiros.requests_preferences;

/**
 * Created by aesher on 8/27/2017.
 * Basic proved for the recycler View. Nothing much to see here.
 * Todo Remove this with the recycler view of the newly uploaded card
 */

public class event_provider {
    private int myIMAGE;

    public  event_provider(int IMAGE){
        this.myIMAGE= IMAGE;
    }
    int getMyIMAGE() {return myIMAGE;}
}
