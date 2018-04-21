package com.fadservices.tabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new TextFragment();
            case 1:
                return new PictureFragment();
            case 2:
                return new VideoFragment();
            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
