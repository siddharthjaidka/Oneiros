package com.muj.android.oneiros.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.muj.android.oneiros.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by aesher on 8/24/2017.
 * Layout of the file is named as fragment_events
 */

public class Events extends Fragment{


    /**
     * @param  C1 -> The main play store card seen upon at first launch
     * @param  S1 -> The Scroll View to contain the Cards
     * @param  I1-> The Team text animator that slides in
     * @param  l1 -> The sub card of the EC card
     * @param C2,C3,C4 -> EC, CC and OC cards respectively
     */


    @BindView(R.id.card)
    CardView c1;
    @BindView(R.id.scrollview)
    ScrollView S1;
    @BindView(R.id.team)
    ImageView I1;
    @BindView(R.id.expand_EC)
    LinearLayout l1;
    @BindView(R.id.expand_OC)
    LinearLayout l3;
    @BindView(R.id.expand_CC)
    LinearLayout l2;
    @BindView(R.id.adding_Executive)
    CardView c2;
    @BindView(R.id.adding_CC)
    CardView c3;
    @BindView(R.id.adding_OC)
    CardView c4;





    @OnClick(R.id.card)
    public void hide(){
        c1.setVisibility(View.GONE);

       //Set the visibility of the team
        Handler handler1 = new Handler();
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                I1.setVisibility(View.VISIBLE);
            }
        }; handler1.postDelayed(runnable1,330);



        S1.setVisibility(View.VISIBLE);



        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                c2.setVisibility(View.VISIBLE);
            }
        }; handler.postDelayed(runnable,650);




        Handler handler3 = new Handler();
        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                c3.setVisibility(View.VISIBLE);
            }
        }; handler3.postDelayed(runnable3,850);




        Handler handler4 = new Handler();
        Runnable runnable4 = new Runnable() {
            @Override
            public void run() {
                c4.setVisibility(View.VISIBLE);
            }
        }; handler4.postDelayed(runnable4,1050);



    }


    @OnClick(R.id.adding_Executive)
    public  void Show_EXE(){
            l1.setVisibility(View.VISIBLE);
    }


    @OnClick(R.id.adding_CC)
    public  void ADDCC(){
        l2.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.adding_OC)
    public void ADDOC(){
        l3.setVisibility(View.VISIBLE);
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_events,container,false);
        ButterKnife.bind(this,v);
        return v;

    }

}
