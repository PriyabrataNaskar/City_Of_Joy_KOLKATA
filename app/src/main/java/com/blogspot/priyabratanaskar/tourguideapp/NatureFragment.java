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
public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list,container,false);

        ArrayList<Place> placeArrayList = new ArrayList<Place>();

        placeArrayList.add(new Place(getString(R.string.nature_prinsep_ghat),getString(R.string.nature_description_prinsep_ghat)));
        placeArrayList.add(new Place(getString(R.string.nature_rabindra_sarobor),getString(R.string.nature_description_rabindra_sarobor)));
        placeArrayList.add(new Place(getString(R.string.nature_eliot_park),getString(R.string.monuments_james_prinsep_memorial_description)));
        placeArrayList.add(new Place(getString(R.string.nature_b_garden),getString(R.string.nature_description_b_garden)));
        placeArrayList.add(new Place(getString(R.string.nature_bagbazar_ghat),getString(R.string.nature_description_bagbazar_ghat)));
        placeArrayList.add(new Place(getString(R.string.nature_maidan),getString(R.string.nature_description_maidan)));
        placeArrayList.add(new Place(getString(R.string.nature_alipur_zoo),getString(R.string.nature_description_alipur_zoo)));
        placeArrayList.add(new Place(getString(R.string.nature_eco_park),getString(R.string.nature_description_eco_park)));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),placeArrayList);

        ListView listView = rootView.findViewById(R.id.place_list);
        listView.setAdapter(placeAdapter);
        return rootView;
    }
}
