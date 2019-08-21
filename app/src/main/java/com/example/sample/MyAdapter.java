package com.example.sample;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prabhat on 26/1/18.
 */

public class MyAdapter extends FragmentPagerAdapter {
    private Context context;
    private String desc, title;
    private List<String> stringList = new ArrayList<>();

    public MyAdapter(FragmentManager fm, Context context, List<String> stringList) {
        super(fm);
        this.context = context;
        this.stringList = stringList;

    }


    @Override
    public Fragment getItem(int position) {


        if (position <= getCount()) {

            return MyFragment.newInstance(stringList.get(position));
        }

        return null;
    }

    @Override
    public int getCount() {
        return stringList.size();
    }
}
