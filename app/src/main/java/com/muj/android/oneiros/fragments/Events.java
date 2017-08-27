package com.muj.android.oneiros.fragments;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.muj.android.oneiros.R;
import com.muj.android.oneiros.activities.event_list;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by aesher on 8/24/2017.
 */

public class Events extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_events,container,false);
        ButterKnife.bind(this,v);
        return v;

    }





}
