package com.basic.nanodegree.tourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

import com.basic.nanodegree.tourguide.Attraction;
import com.basic.nanodegree.tourguide.R;
import com.basic.nanodegree.tourguide.adapter.AttractionAdapter;

/**
 * Created by Ahmed AbdElQader on 12-Mar-18.
 */

public class Cairo extends Fragment{
    private ArrayList<Attraction> attractions;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.cairo, container, false);
        attractions = new ArrayList<>();

        initData();


        AttractionAdapter adapter = new AttractionAdapter(getContext(), attractions);

        ListView listView = (ListView) v.findViewById(R.id.list_cairo);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    double lat = attractions.get(position).getLocation().getLatitude();
                    Log.d("lat", ""+lat);
                    double lon = attractions.get(position).getLocation().getLongitude();
                    Log.d("lon", ""+lon);
                    String keyword = attractions.get(position).getAttractionName();
                    Uri uri = Uri.parse("geo:" + lat + "," + lon + "?q=" + Uri.encode(keyword));

                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                    startActivity(intent);
                }catch (Exception e){}
            }
        });

        return v;
    }

    private void initData() {

        attractions = new ArrayList<Attraction>();

//        String name, String phone, String desc, int imageUrl, Location location
        Location place1 = new Location("Cairo");
        place1.setLatitude(22.61023);
        place1.setLongitude(120.30174);
        attractions.add(new Attraction("13th Arrondissement",
                "+20123456789", "Neighborhoods",
                R.drawable.paris1, place1));

        Location place2 = new Location("Cairo");
        place2.setLatitude(22.61023);
        place2.setLongitude(120.30174);
        attractions.add(new Attraction("Seine River",
                "+20123456789", "Neighborhoods",
                R.drawable.paris2, place2));

        Location place3 = new Location("Cairo");
        place3.setLatitude(22.61023);
        place3.setLongitude(120.30174);
        attractions.add(new Attraction("Place des Vosges",
                "+20123456789", "Neighborhoods",
                R.drawable.paris3, place3));

        Location place4 = new Location("Cairo");
        place4.setLatitude(22.61023);
        place4.setLongitude(120.30174);
        attractions.add(new Attraction("Musee Nissim de Camondo",
                "+20123456789", "Neighborhoods",
                R.drawable.paris4, place4));

        Location place5 = new Location("Cairo");
        place5.setLatitude(22.61023);
        place5.setLongitude(120.30174);
        attractions.add(new Attraction("Musee National Eugene Delacroix",
                "+20123456789", "Neighborhoods",
                R.drawable.paris5, place5));



    }
}
