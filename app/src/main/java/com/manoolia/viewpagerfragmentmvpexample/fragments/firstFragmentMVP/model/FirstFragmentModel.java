package com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.model;

import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.interfaces.ModelInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erald on 3/9/2018.
 */

public class FirstFragmentModel implements ModelInterface {

    private List<ListElements> feedItemList = new ArrayList<>();

    @Override
    public void getListFromModel(OnFinishedListener onFinishedListener) {
        onFinishedListener.onSuccessfully(feedItemList());
    }


    private List<ListElements> feedItemList() {

        ListElements p1 = new ListElements("Test1","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfeiLcmj5PkCaZ7yxaYsIysz0Ywgq_jSJcmp6T8czaJyjjuPwR4A");
        ListElements p2 = new ListElements("Test2","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPjB5DP2k4KatR5G4Txogvp0TfxTDZEWnu7SSGpwho6RtcKmwu");
        ListElements p3 = new ListElements("Test3","https://clixfuel.com/wp/wp-content/uploads/2013/06/Penguin-2.0-Low-Quality-Backlinks.png");
        ListElements p4 = new ListElements("Test4","https://wordtracker-swoop-uploads.s3.amazonaws.com/uploads/ckeditor/pictures/1512/content_google-quality-rater-guidelines-blog.jpg");

        feedItemList.add(p1);
        feedItemList.add(p2);
        feedItemList.add(p3);
        feedItemList.add(p4);


        return feedItemList;
    }
}
