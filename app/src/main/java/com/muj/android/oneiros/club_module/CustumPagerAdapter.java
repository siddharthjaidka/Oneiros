package com.muj.android.oneiros.club_module;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.muj.android.oneiros.R;

import java.util.ArrayList;

/**
 * Created by Shiavngi Pandey on 25-08-2017.
 */

public class CustumPagerAdapter extends PagerAdapter {

    ArrayList<Clubs> clubs;
    Context context;
    String[] backgroundColor;

    CustumPagerAdapter(ArrayList<Clubs> clubs,String[] backgroundColor, Context context){
        this.clubs = clubs;
        this.context = context;
        this.backgroundColor = backgroundColor;
    }

    @Override
    public int getCount() {
        return clubs.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
    @Override
    public void destroyItem(final View container, final int position, final Object object) {
        ((ViewPager) container).removeView((View) object);
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        final View view = LayoutInflater.from(
                context).inflate(R.layout.item_vp_list, null, false);
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(llm);

        recyclerView.setAdapter(new ClubAdapters(clubs.get(position).getEventList(),context));

        container.addView(view);
        return view;
    }
}
