package com.example.android.tourguide;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class BikeFragment extends Fragment {


    public BikeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("very pretty!!", "Sceneic Bike path", R.drawable.number_one, R.raw.number_one));
        places.add(new Place("Realy ugly", "Ugly Bike path", R.drawable.number_two, R.raw.number_two));
        places.add(new Place("Kind of nice", "that wierd bike path", R.drawable.number_three, R.raw.number_three));
        places.add(new Place("It's got things", "the kind of sort of bike path", R.drawable.number_four, R.raw.number_four));
        places.add(new Place("not really that good", "is it a bike bath", R.drawable.number_five, R.raw.number_five));
        places.add(new Place("not really that good", "is it a bike bath", R.drawable.number_five, R.raw.number_five));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_bike);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }


}
