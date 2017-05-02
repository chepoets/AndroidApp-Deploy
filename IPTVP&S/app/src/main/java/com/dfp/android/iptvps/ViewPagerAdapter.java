package com.dfp.android.iptvps;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by paolo on 11/08/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter{

    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> TabTitles = new ArrayList<>();

    public void AddFragment ( Fragment fragments , String titles) {
        this.fragments.add(fragments);
        this.TabTitles.add(titles);



    }
    public ViewPagerAdapter(FragmentManager fm){

        super(fm);

    }



    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TabTitles.get(position);
    }


}
