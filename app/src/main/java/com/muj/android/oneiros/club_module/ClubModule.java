package com.muj.android.oneiros.club_module;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.muj.android.oneiros.R;

import java.util.ArrayList;

import devlight.io.library.ntb.NavigationTabBar;

public class ClubModule extends AppCompatActivity {

    int[] ClubImages = {R.drawable.ic_first,R.drawable.ic_second,R.drawable.ic_third,R.drawable.ic_fourth,R.drawable.ic_fifth,R.drawable.ic_sixth,R.drawable.ic_seventh,R.drawable.ic_eighth};
    String[][] ClubEvents = {{"Focus","Flare","InstaAperture","Showdown Of Societies"},
            {"Rangmanch","Pandoras Box","One Mic Stand","Awaz","Uno Dos Act!","Vine Making","Conflict Of Interest"},
            {"Tees Maar Khan","Kavi Semmelen"},
            {"Rap Wars","WoodStock","Ensemble","Twice The Voice","Bollywood","Octaves","Saptak"},
            {"Destival","Ground Zero","Showcase","Nextar"},
            {"Conflux of extremes","Tittle Tattle","Abstract India","Photo Mortage"},
            {"Just-A-Minute","Pictionary","Quizinos","Spell Bee","Plethora Of Pens","Voice Over","Conflict Of Interests"},
            {"Sophia Quiz","Sophia Circle","Speak Up!"}};
    final int NUM_OF_CLUBS = 8;
    String ClubNames[] = {"Aperture","Cinefelia","Shabd","The Music Club","Coreographia","Scribbles","Litmus","Sophia"};
    ArrayList<Clubs> clubsArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club_module);

        getSupportActionBar().hide();

        clubsArrayList = new ArrayList<>();

        for(int i = 0;i<NUM_OF_CLUBS;i++) {
           Clubs clubs = new Clubs(ClubNames[i]);
           for(int j = 0;j<ClubEvents[i].length;j++)
               clubs.addEvent(ClubEvents[i][j]);

           clubsArrayList.add(clubs);
        }




        initUI();
    }

    private void initUI() {
        final ViewPager viewPager = (ViewPager) findViewById(R.id.vp_vertical_ntb);
        final String[] colors = getResources().getStringArray(R.array.vertical_ntb);
        viewPager.setAdapter(new CustumPagerAdapter(clubsArrayList,colors,getBaseContext()));
        //viewPager.setPageTransformer(false,new FadePageTransformer());

        final NavigationTabBar navigationTabBar = (NavigationTabBar) findViewById(R.id.ntb_vertical);
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();

        for(int i = 0;i<NUM_OF_CLUBS;i++){
            models.add(
                    new NavigationTabBar.Model.Builder(
                            getResources().getDrawable(ClubImages[i]),
                            Color.parseColor(colors[i]))
                            .title(ClubNames[i])
                            .selectedIcon(getResources().getDrawable(R.drawable.ic_eighth))
                            .build()
            );
        }

        navigationTabBar.setViewPager(viewPager, 10);
        navigationTabBar.setModels(models);

        navigationTabBar.setBgColor(Color.parseColor("#2c3e50"));
        navigationTabBar.setInactiveColor(Color.WHITE);
        navigationTabBar.setTitleMode(NavigationTabBar.TitleMode.ACTIVE);
        navigationTabBar.setTypeface("fonts/custom_font.ttf");
        navigationTabBar.setIsTitled(true);
        navigationTabBar.setIsTinted(true);
        navigationTabBar.setIsSwiped(true);
        navigationTabBar.setTitleSize(10);
        navigationTabBar.setIconSizeFraction(0.5f);

    }

    public class FadePageTransformer implements ViewPager.PageTransformer {
        public void transformPage(View view, float position) {
            view.setTranslationX(view.getWidth() * -position);

            if(position <= -1.0F || position >= 1.0F) {
                view.setAlpha(0.0F);
            } else if( position == 0.0F ) {
                view.setAlpha(1.0F);
            } else {
                // position is between -1.0F & 0.0F OR 0.0F & 1.0F
                view.setAlpha(1.0F - Math.abs(position));
            }
        }
    }
}
