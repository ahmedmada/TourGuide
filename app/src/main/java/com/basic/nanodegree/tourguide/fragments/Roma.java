package com.basic.nanodegree.tourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.basic.nanodegree.tourguide.R;

/**
 * Created by Ahmed AbdElQader on 12-Mar-18.
 */

public class Roma extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.roma, container, false);
    }
}
