/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguide;

/**
 * {@link Place} represents a place the user wants to learn about.
 * It contains the name of the place and a short description.
 */
public class Place {

    /** Description of the place */
    private String mDescriptionOfPlace;

    /** The name of the place */
    private String mNameOfPlace;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     *
     * @param descriptionOfPlace What the place is like
     *
     * @param nameOfPlace the name of the place
     */
    public Place(String descriptionOfPlace, String nameOfPlace) {
        mDescriptionOfPlace = descriptionOfPlace;
        mNameOfPlace = nameOfPlace;
    }

    /**
     * Create a new Place object.
     *
     * @param defaultDescription is a description of the pace
     *
     * @param nameOfPlace is the name of the place
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */

    public Place(String defaultDescription, String nameOfPlace, int imageResourceId) {
        mDescriptionOfPlace = defaultDescription;
        mNameOfPlace = nameOfPlace;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the description of place
     */
    public String getDescriptionOfPlace() {
        return mDescriptionOfPlace;
    }

    /**
     * Get the name of the place.
     */
    public String getNameOfPlace() {
        return mNameOfPlace;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return ".getString(R.string.string_place_1)" +
                ".getString(R.string.string_place)" + mDescriptionOfPlace + '\'' +
                ".getString(R.string.string_name)" + mNameOfPlace + '\'' +
                ".getString(R.string.string_image)" + mImageResourceId +
                '}';
    }
}