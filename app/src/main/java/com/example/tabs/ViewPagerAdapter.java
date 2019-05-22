package com.example.tabs;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> frgList=new ArrayList<>();
    private final List<String> titleList=new ArrayList<>();


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return frgList.get(position);
    }
    @Override
    public int getCount() {
        return titleList.size();
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }


    public void addFrg(Fragment frg, String title){
            frgList.add(frg);
            titleList.add(title);
    }

}
