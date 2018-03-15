package com.basic.nanodegree.tourguide;

import android.location.Location;

/**
 * Created by Ahmed AbdElQader on 15-Mar-18.
 */

public class Attraction {
    private String mAttractionName;
    private String mAttractionPhone;
    private String mDesc;
    private int mImageResource;
    private Location mAtrractionLocation;

    public Attraction(String name, String phone, String desc, int imageUrl, Location location) {
        mAttractionName = name;
        mAttractionPhone = phone;
        mDesc = desc;
        mImageResource = imageUrl;
        mAtrractionLocation = location;
    }

    public String getAttractionName() {
        return mAttractionName;
    }

    public String getAttractionPhone() {
        return mAttractionPhone;
    }

    public Location getLocation() {
        return mAtrractionLocation;
    }

    public String getmDesc() {
        return mDesc;
    }

    public int getImageResource(){
        return mImageResource;
    }

}