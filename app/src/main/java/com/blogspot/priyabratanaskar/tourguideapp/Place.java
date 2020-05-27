package com.blogspot.priyabratanaskar.tourguideapp;

public class Place {
    String placeName;
    String placeShortDescription;
    public static final int NO_IMAGE_PROVIDED = -1;
    int placeImageID = NO_IMAGE_PROVIDED;

    public Place(String placeName, String placeShortDescription, int placeImageID) {
        this.placeName = placeName;
        this.placeShortDescription = placeShortDescription;
        this.placeImageID = placeImageID;
    }

    public Place(String placeName, String placeShortDescription) {
        this.placeName = placeName;
        this.placeShortDescription = placeShortDescription;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceShortDescription() {
        return placeShortDescription;
    }

    public int getPlaceImageID() {
        return placeImageID;
    }

    /**
     * If image is provided return true
     * @return boolean
     */
    public boolean hasImage(){
        return placeImageID != NO_IMAGE_PROVIDED;
    }
}
