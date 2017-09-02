package com.muj.android.oneiros.activities;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.muj.android.oneiros.R;
import com.muj.android.oneiros.requests_preferences.main_pager_adapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity  {



    /**
     * @param  viewPage -> The main pager adapter for the application to switch between the event and dashboard
     * @param PagerViewAdapter -> The pagerView adapter for the pager view set
     * */



    @BindView(R.id.view_pager)
    ViewPager viewPager;

    main_pager_adapter PagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PagerViewAdapter= new main_pager_adapter(getSupportFragmentManager());
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        viewPager.setAdapter(PagerViewAdapter);
        // This will switch the view after showing the user a glimpse of the main register activity
    }

}
