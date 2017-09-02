package com.muj.android.oneiros.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.ScrollView;

import com.muj.android.oneiros.R;
import com.muj.android.oneiros.activities.event_list;
import com.muj.android.oneiros.club_module.ClubModule;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by aesher on 8/24/2017.
 * XML resource can be found by the name if fragment_dashboard
 */

public class Dashboard extends Fragment {

    @BindView(R.id.toolbar)
    ScrollView TOOLBAR;

    @BindView(R.id.camera_inflate)
    ImageButton camera;

    @OnClick(R.id.adding_events)
        public void GOTO_EVENTS(){
        Intent i = new Intent(getContext(),ClubModule.class);
        startActivity(i);

    }

    @OnClick(R.id.camera_inflate)
        public void INFLATE() {
        PopupMenu popupMenu = new PopupMenu(getContext(),camera);
        popupMenu.getMenuInflater().inflate(R.menu.camera_action,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
        popupMenu.show();

    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dashboard,container,false);
        ButterKnife.bind(this,v);
        return v;
    }



}
