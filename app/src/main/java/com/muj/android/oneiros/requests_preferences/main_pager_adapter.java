package com.muj.android.oneiros.requests_preferences;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.muj.android.oneiros.fragments.Dashboard;
import com.muj.android.oneiros.fragments.Events;
/**
 * Created by aesher on 8/24/2017.
 */

public class main_pager_adapter extends FragmentStatePagerAdapter{
    public main_pager_adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Dashboard();
            case 1 : return new Events();
            default: return new Dashboard();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
