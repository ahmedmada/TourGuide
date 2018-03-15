package com.basic.nanodegree.tourguide.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.basic.nanodegree.tourguide.fragments.Cairo;
import com.basic.nanodegree.tourguide.fragments.London;
import com.basic.nanodegree.tourguide.fragments.Paris;
import com.basic.nanodegree.tourguide.fragments.Roma;

/**
 * Created by Ahmed AbdElQader on 12-Mar-18.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Paris tab1 = new Paris();
                return tab1;
            case 1:
                London tab2 = new London();
                return tab2;
            case 2:
                Roma tab3 = new Roma();
                return tab3;
            case 3:
                Cairo tab4 = new Cairo();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}