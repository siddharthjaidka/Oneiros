package com.muj.android.oneiros.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.animation.Animator;
import android.widget.TextView;

import com.muj.android.oneiros.R;
import com.muj.android.oneiros.requests_preferences.event_provider;
import com.muj.android.oneiros.requests_preferences.events_adapter;

import java.util.ArrayList;
import java.util.List;

import devlight.io.library.ntb.NavigationTabBar;

/**
 * Created by aesher on 8/25/2017.
 */



public class event_list extends AppCompatActivity {


    events_adapter Adapter;
    List<event_provider> Provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventview);


        Provider = new ArrayList<>();
        Adapter = new events_adapter(getApplicationContext(),Provider);

        final String CLUBNAME[] = {"Today's Events","Aperture","Cinefilia","Shabd","The Music Club","Coreografia","Scribbles","Litmus","Sophia","Aashis"};


        final ViewPager viewPager = (ViewPager) findViewById(R.id.vp_vertical_ntb);
        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return 10;
            }
            @Override
            public void destroyItem(final View container, final int position, final Object object) {
                ((ViewPager) container).removeView((View) object);
            }


            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view.equals(object);
            }
            @Override
            public Object instantiateItem(final ViewGroup container, final int position) {

                final String[] colors = getResources().getStringArray(R.array.vertical_ntb);
                final View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.recycler_events, null, false);

                final LinearLayout l1,l2;
                final FloatingActionButton floatingActionButton;
                final Toolbar tOolbar;
                final RecyclerView Recycle;
                final TextView toolbar_text;



                final LinearLayoutManager layoutManager =  new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
                Recycle = (RecyclerView) view.findViewById(R.id.recycler_view);
                Provider.clear();
                Recycle.setLayoutManager(layoutManager);
                Recycle.setHasFixedSize(true);
                Recycle.setAdapter(Adapter);
                Recycle.setNestedScrollingEnabled(false);


                for (int i =0 ; i<=position;i++){
                    event_provider p1 = new event_provider( R.drawable.mojo_default);
                    Provider.add(p1);
                }



                floatingActionButton = (FloatingActionButton) view.findViewById(R.id.Fab);
                tOolbar = (Toolbar) view.findViewById(R.id.toolbar);
                toolbar_text = (TextView) view.findViewById(R.id.name);

                l1= (LinearLayout) view.findViewById(R.id.magic);
                l2= (LinearLayout) view.findViewById(R.id.superMagic);
                l1.setBackgroundColor(Color.parseColor(colors[position]));
                tOolbar.setBackgroundColor(Color.parseColor(colors[position]));


                Handler handler = new Handler();
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        int cx = floatingActionButton.getWidth();
                        int cy = floatingActionButton.getHeight();
                        float finalRadius = (float) Math.hypot(cx, cy)+100;
                        Animator anim = ViewAnimationUtils.createCircularReveal(floatingActionButton,cx,cy,0,finalRadius);
                        floatingActionButton.setVisibility(View.VISIBLE);
                        anim.start();}
                }; handler.postDelayed(runnable,500);



                floatingActionButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int cx = l2.getWidth();
                        int cy = l2.getHeight();
                        float finalRadius = (float) Math.hypot(cx, cy)+100;
                        Animator anim = ViewAnimationUtils.createCircularReveal(l2,cx,cy,0,finalRadius);
                        l1.setVisibility(View.GONE);
                        l2.setVisibility(View.VISIBLE);
                        toolbar_text.setText(CLUBNAME[position]);
                        anim.start();
                    }
                });
                container.addView(view);
                return view;
            }
        });

        final String[] colors = getResources().getStringArray(R.array.vertical_ntb);
        final NavigationTabBar navigationTabBar = (NavigationTabBar) findViewById(R.id.ntb_vertical);
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_share),
                        Color.parseColor(colors[0]))
                        .title("ic_first")
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_arrow))
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_share),
                        Color.parseColor(colors[1]))
                        .title("ic_first")
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_arrow))
                        .build()
        );

        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_share),
                        Color.parseColor(colors[2]))
                        .title("ic_first")
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_arrow))
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_share),
                        Color.parseColor(colors[3]))
                        .title("ic_first")
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_arrow))
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_share),
                        Color.parseColor(colors[4]))
                        .title("ic_first")
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_arrow))
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_share),
                        Color.parseColor(colors[5]))
                        .title("ic_first")
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_arrow))
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_share),
                        Color.parseColor(colors[6]))
                        .title("ic_first")
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_arrow))
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_share),
                        Color.parseColor(colors[7]))
                        .title("ic_first")
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_arrow))
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_share),
                        Color.parseColor(colors[8]))
                        .title("ic_first")
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_arrow))
                        .build()
        );

        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_share),
                        Color.parseColor(colors[2]))
                        .title("ic_first")
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_arrow))
                        .build()
        );


        navigationTabBar.setModels(models);
        navigationTabBar.setViewPager(viewPager, 4);

    }





}
