package com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.interfaces;

import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.model.FirstFragmentModel;
import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.model.ListElements;

import java.util.List;

/**
 * Created by Erald on 3/9/2018.
 */

public interface ViewInterface {
    void getListPerson(List<ListElements> firstFragmentModels);
}
