package com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.presenter;

import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.interfaces.ModelInterface;
import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.interfaces.PresenterInterface;
import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.model.FirstFragmentModel;
import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.model.ListElements;
import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.view.FirstFragment;

import java.util.List;

/**
 * Created by Erald on 3/9/2018.
 */

public class FirstFragmentPresenter implements PresenterInterface,ModelInterface.OnFinishedListener {

    private FirstFragment view;
    private ModelInterface model;

    public FirstFragmentPresenter(FirstFragment firstFragment) {
        this.view = firstFragment;
        model = new FirstFragmentModel();
    }


    @Override
    public void onSuccessfully(List<ListElements> firstFragmentModels) {
       view.getListPerson(firstFragmentModels);
    }

    @Override
    public void getData() {
        model.getListFromModel(this);
    }

}
