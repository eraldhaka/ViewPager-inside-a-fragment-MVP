package com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.manoolia.viewpagerfragmentmvpexample.R;
import com.manoolia.viewpagerfragmentmvpexample.adapter.FirstFragmentAdapter;
import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.interfaces.ViewInterface;
import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.model.FirstFragmentModel;
import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.model.ListElements;
import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.presenter.FirstFragmentPresenter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Erald on 3/9/2018.
 */

public class FirstFragment extends Fragment implements ViewInterface {

    List<FirstFragmentModel> firstFragmentModels;
    FirstFragmentPresenter presenter;
    private RecyclerView recyclerView;
    private FirstFragmentAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/

        View view = inflater.inflate(R.layout.first_fragment, null);

        presenter = new FirstFragmentPresenter(this);
        firstFragmentModels = new ArrayList<>();

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setPadding(25, 25, 25, 25);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        presenter.getData();

        return view;
    }


    @Override
    public void getListPerson(List<ListElements> firstFragmentModels) {
        adapter = new FirstFragmentAdapter(getActivity(), firstFragmentModels);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}

