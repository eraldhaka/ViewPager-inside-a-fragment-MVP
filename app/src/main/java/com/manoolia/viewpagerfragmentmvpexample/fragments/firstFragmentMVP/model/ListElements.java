package com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.model;

/**
 * Created by Erald on 3/9/2018.
 */

public class ListElements {
    private String name;
    private String image;

    ListElements() {
    }

    public ListElements(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
