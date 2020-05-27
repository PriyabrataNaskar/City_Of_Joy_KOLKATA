package com.blogspot.priyabratanaskar.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReligiousFragment extends Fragment {

    public ReligiousFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list,container,false);

        ArrayList<Place> placeArrayList = new ArrayList<Place>();

        placeArrayList.add(new Place(getString(R.string.religious_belur_math),getString(R.string.religious_description_belur_math)));
        placeArrayList.add(new Place(getString(R.string.religious_kalighat),getString(R.string.religious_description_kalighat)));
        placeArrayList.add(new Place(getString(R.string.religious_church),getString(R.string.religious_description_church)));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),placeArrayList);

        ListView listView = rootView.findViewById(R.id.place_list);
        listView.setAdapter(placeAdapter);
        return rootView;
    }
}
