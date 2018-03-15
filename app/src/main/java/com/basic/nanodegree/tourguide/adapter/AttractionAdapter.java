package com.basic.nanodegree.tourguide.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.basic.nanodegree.tourguide.Attraction;
import com.basic.nanodegree.tourguide.R;

import java.util.ArrayList;

/**
 * Created by Ahmed AbdElQader on 15-Mar-18.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Context context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentAttraction.getAttractionName());

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone);
        if("".equals(currentAttraction.getAttractionPhone()))
            phoneTextView.setVisibility(View.GONE);
        else {
            phoneTextView.setVisibility(View.VISIBLE);
            phoneTextView.setText(currentAttraction.getAttractionPhone());
        }

        TextView desc = (TextView) listItemView.findViewById(R.id.desc);
        desc.setText(currentAttraction.getmDesc());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        imageView.setImageResource(currentAttraction.getImageResource());

        return listItemView;
    }
}