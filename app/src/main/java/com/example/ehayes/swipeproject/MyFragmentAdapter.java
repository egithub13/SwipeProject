package com.example.ehayes.swipeproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Ehayes on 2/1/2017.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {

    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FragmentA();
            case 1:
                return new FragmentB();
            case 2:
                return new FragmentC();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
