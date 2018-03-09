package com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.interfaces;

import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.model.ListElements;

import java.util.List;

/**
 * Created by Erald on 3/9/2018.
 */

public interface ModelInterface {

    interface OnFinishedListener {
        void onSuccessfully(List<ListElements> feeditemListener);
    }

    void getListFromModel(OnFinishedListener onFinishedListener);
}
