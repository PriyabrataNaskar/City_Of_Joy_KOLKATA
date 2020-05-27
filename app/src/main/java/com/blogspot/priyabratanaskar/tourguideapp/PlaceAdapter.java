package com.blogspot.priyabratanaskar.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(@NonNull Context context,@NonNull ArrayList<Place> placeArrayList) {
        super(context, 0, placeArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.place_list_item,parent,false);
        }
        Place currentPlace = getItem(position);

        TextView placeNameText = convertView.findViewById(R.id.place_name);
        TextView placeDescriptionText = convertView.findViewById(R.id.place_short_description);
        ImageView placeImage = convertView.findViewById(R.id.place_image);
        CardView cardView = convertView.findViewById(R.id.cardView);

        placeNameText.setText(currentPlace.getPlaceName());
        placeDescriptionText.setText(currentPlace.getPlaceShortDescription());
        if(currentPlace.hasImage()){
            placeImage.setImageResource(currentPlace.getPlaceImageID());
        }
        else {
            cardView.setVisibility(View.INVISIBLE);
        }
        return convertView;
    }
}
