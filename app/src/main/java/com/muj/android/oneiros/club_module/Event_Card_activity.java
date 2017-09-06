package com.muj.android.oneiros.club_module;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.eftimoff.viewpagertransformers.StackTransformer;
import com.eftimoff.viewpagertransformers.ZoomOutSlideTransformer;
import com.muj.android.oneiros.R;

import java.util.ArrayList;
import java.util.List;

public class Event_Card_activity extends AppCompatActivity {
    static RelativeLayout layout;
    ViewPager viewPager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_card);

        layout = (RelativeLayout) findViewById(R.id.card_layout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        if (viewPager != null) {

            viewPager.setPageTransformer(true, new ZoomOutSlideTransformer());

            viewPager.setOffscreenPageLimit(2);
            viewPager.setAdapter(new adapter());
        }
    }


    class adapter extends PagerAdapter {

        @Override
        public int getCount() {
            return 10;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view.equals(object);
        }
        @Override
        public Object instantiateItem(final ViewGroup container, final int position) {
            final View view = LayoutInflater.from(
                    Event_Card_activity.this).inflate(R.layout.card_frame, null, false);

            container.addView(view);
            return view;
        }
        @Override
        public void destroyItem(final View container, final int position, final Object object) {
            ((ViewPager) container).removeView((View) object);
        }
    }
    }