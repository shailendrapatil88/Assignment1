package com.bits.assignment1.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bits.assignment1.fragment.PagerFragment;

/**
 * This adapter is used to return appropriate fragment for given position
 * Created by shailendra patil on 3/8/2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0: {
                fragment = PagerFragment.getInstance(1);
            }
            break;
            case 1: {
                fragment = PagerFragment.getInstance(2);
            }
            break;
            case 2: {
                fragment = PagerFragment.getInstance(3);
            }
            break;
            case 3: {
                fragment = PagerFragment.getInstance(4);
            }
            break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
