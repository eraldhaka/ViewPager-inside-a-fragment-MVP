package com.manoolia.viewpagerfragmentmvpexample.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.manoolia.viewpagerfragmentmvpexample.R;


/**
 * Created by Erald on 3/7/2018.
 */

public class FragmentViewPager2 extends Fragment {

    public FragmentViewPager2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_login, container, false);


        View v = inflater.inflate(R.layout.viewpager2, null);

        return v;
    }
}
