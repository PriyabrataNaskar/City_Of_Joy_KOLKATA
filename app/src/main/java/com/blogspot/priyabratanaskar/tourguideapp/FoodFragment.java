package com.blogspot.priyabratanaskar.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list,container,false);

        ArrayList<Place> placeArrayList = new ArrayList<Place>();

        placeArrayList.add(new Place(getString(R.string.food_kolkata_biriani),getString(R.string.food_kolkata_biriani_description),R.drawable.kolkata_biriani));
        placeArrayList.add(new Place(getString(R.string.food_mutton_curry),getString(R.string.food_mutton_curry_description),R.drawable.mutton_curry));
        placeArrayList.add(new Place(getString(R.string.food_fish_curry),getString(R.string.food_fish_curry_description),R.drawable.fish_curry));
        placeArrayList.add(new Place(getString(R.string.food_shuktoy),getString(R.string.food_shukto_description),R.drawable.shukto));
        placeArrayList.add(new Place(getString(R.string.food_alu_posto),getString(R.string.food_alu_posto_description),R.drawable.alu_posto));
        placeArrayList.add(new Place(getString(R.string.food_alu_tarkari_luchi),getString(R.string.food_alu_tarkari_luchi_description),R.drawable.luchi_tarkari));
        placeArrayList.add(new Place(getString(R.string.food_phuchka),getString(R.string.food_phuchka_description),R.drawable.phuchka));
        placeArrayList.add(new Place(getString(R.string.food_jhal_muri),getString(R.string.food_jhal_muri_description),R.drawable.jhal_muri));
        placeArrayList.add(new Place(getString(R.string.food_roshogolla),getString(R.string.food_roshogolla_description),R.drawable.rosogolla));
        placeArrayList.add(new Place(getString(R.string.food_misti_doi),getString(R.string.food_misti_doi_description),R.drawable.misti_doi));
        placeArrayList.add(new Place(getString(R.string.food_cha),getString(R.string.food_cha_description),R.drawable.cha));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),placeArrayList);

        ListView listView = rootView.findViewById(R.id.place_list);
        listView.setAdapter(placeAdapter);
        return rootView;
    }
}
