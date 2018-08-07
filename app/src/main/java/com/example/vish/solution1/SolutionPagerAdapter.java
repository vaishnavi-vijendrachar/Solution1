package com.example.vish.solution1;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

public class SolutionPagerAdapter extends FragmentPagerAdapter {

    public SolutionPagerAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return FirstFragment.newInstance("First Fragment");
            case 1: return SecondFragment.newInstance("Second Fragment");
            case 2: return ThirdFragment.newInstance("Third Fragment");
            case 3: return FourthFragment.newInstance("Fourth Fragment");
            default: return FirstFragment.newInstance("First Fragment");
        }
    }


    @Override
    public int getCount() {
        return 4;
    }
}
