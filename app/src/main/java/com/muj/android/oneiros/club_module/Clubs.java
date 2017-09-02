package com.muj.android.oneiros.club_module;

import java.util.ArrayList;

/**
 * Created by Shiavngi Pandey on 25-08-2017.
 */

public class Clubs {

    private String name;
    ArrayList<Events> events;
    Clubs(String name){
        this.name = name;
        events = new ArrayList<>();
    }

    public void addEvent(String name){
        events.add(new Events(name));
    }
    public int getEventCount(){
        return events.size();
    }
    public ArrayList<Events> getEventList(){
        return events;
    }
    public String getName(){
        return name;
    }
}
