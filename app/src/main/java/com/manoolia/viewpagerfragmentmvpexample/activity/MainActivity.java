package com.manoolia.viewpagerfragmentmvpexample.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.manoolia.viewpagerfragmentmvpexample.R;
import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.view.FirstFragment;
import com.manoolia.viewpagerfragmentmvpexample.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {

    private Button firstFragment,secondFragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment = (Button)findViewById(R.id.button_first_fragment);
        secondFragment = (Button)findViewById(R.id.button_second_fragment);

        initFragment();

        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initFirstFragment();
            }
        });

        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initSecondFragment();
            }
        });

    }


    private void initFragment(){
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        FirstFragment firstFragment = new FirstFragment();
        fragmentTransaction.add(R.id.fragment_container, firstFragment, "firstFragment");
        fragmentTransaction.commit();
    }

    private void initFirstFragment() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        FirstFragment firstFragment = new FirstFragment();
        fragmentTransaction.replace(R.id.fragment_container, firstFragment, "firstFragment");
        fragmentTransaction.commit();
        //fragmentTransaction.detach(fRegister);
    }

    private void initSecondFragment(){
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        SecondFragment secondFragment = new SecondFragment();
        fragmentTransaction.replace(R.id.fragment_container, secondFragment, "secondFragment");
        fragmentTransaction.commit();

    }
}
