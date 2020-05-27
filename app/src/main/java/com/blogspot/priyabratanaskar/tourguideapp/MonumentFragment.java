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
public class MonumentFragment extends Fragment {

    public MonumentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list,container,false);

        ArrayList<Place> placeArrayList = new ArrayList<Place>();

        placeArrayList.add(new Place(getString(R.string.monuments_victoria),getString(R.string.monuments_victoria_description),R.drawable.victoria_memorial));
        placeArrayList.add(new Place(getString(R.string.monuments_birla_planetarium),getString(R.string.monuments_birla_planetarium_description),R.drawable.birla));
        placeArrayList.add(new Place(getString(R.string.monuments_james_prinsep_memorial),getString(R.string.monuments_james_prinsep_memorial_description),R.drawable.james_prinsep));
        placeArrayList.add(new Place(getString(R.string.monuments_eden_gardens),getString(R.string.monuments_eden_gardens_description),R.drawable.eden_gardens));
        placeArrayList.add(new Place(getString(R.string.monuments_vidyasagar_setu),getString(R.string.monuments_vidyasagar_setu_description),R.drawable.vidyasagar_setu));
        placeArrayList.add(new Place(getString(R.string.monuments_marble_palace),getString(R.string.monuments_marble_palace_description),R.drawable.marbale_palace));
        placeArrayList.add(new Place(getString(R.string.monuments_howrah_bridge),getString(R.string.monuments_howrah_bridge_description),R.drawable.howrah_bridge));
        placeArrayList.add(new Place(getString(R.string.monuments_national_museum),getString(R.string.monuments_national_museum_description),R.drawable.indian_museum));
        placeArrayList.add(new Place(getString(R.string.monuments_shaheed_minar),getString(R.string.monuments_shaheed_minar_description),R.drawable.shaheed_minar));
        placeArrayList.add(new Place(getString(R.string.monuments_shobhabajar_rajbari),getString(R.string.monuments_shobhabajar_rajbari_description),R.drawable.shobabazar_rajbari));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),placeArrayList);

        ListView listView = rootView.findViewById(R.id.place_list);
        listView.setAdapter(placeAdapter);
        return rootView;
    }
}
