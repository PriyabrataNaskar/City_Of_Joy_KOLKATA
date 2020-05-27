package com.blogspot.priyabratanaskar.tourguideapp;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int numberOfTab;
    public PagerAdapter(@NonNull FragmentManager fm, int numberOfTab) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.numberOfTab = numberOfTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FoodFragment();
            case 1: return new MonumentFragment();
            case 2: return new ReligiousFragment();
            case 3: return new NatureFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTab;
    }

}
