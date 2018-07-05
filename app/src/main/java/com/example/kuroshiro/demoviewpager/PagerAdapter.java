package com.example.kuroshiro.demoviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new fragmentOne();
                break;
            case 1:
                frag = new fragmentTwo();
                break;
            case 2:
                frag = new fragmentThree();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Sharingan";
                break;
            case 1:
                title = "Rinnergan";
                break;
            case 2:
                title = "Android";
                break;
        }
        return title;
    }
}
