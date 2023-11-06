package com.example.irfan.tourguide;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainMarketsFragment extends Fragment {


    public MainMarketsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.places_details,container,false);

        //Creating ArrayList of type PlacesDetails Class
        ArrayList<PlacesDetails> placesDetailsArrayList=new ArrayList<PlacesDetails>();

        //Adding data to ArrayList by creating new objects of PlacesDetails Class.
        placesDetailsArrayList.add(new PlacesDetails("Mall of kp","The mall of kp is the largest shoping mall of Peshawar. Evrery type and kind of daily use items are available here. A large number of people are visit daily.","Address: 2F2W+CV3, Tehkal, Peshawar, Khyber Pakhtunkhwa"));
        placesDetailsArrayList.add(new PlacesDetails("Srinagar shawl Naran","One of the best places to buy shawls for men and women.Good price Variety is limited Sale mans are friendly.","Address: WM42+P6V, MNJ Road, Zam Zam Hotel Main Bazar, Naran, Naran, Mansehra, Khyber Pakhtunkhwa"));
        placesDetailsArrayList.add(new PlacesDetails("ALHAM SHOPPING MALL NARAN", "Address: Main Bazar, Naran, Mansehra, Khyber Pakhtunkhwa, Pakistan"));
        placesDetailsArrayList.add(new PlacesDetails("Kamal Shopping Mall","Address: 399R+9VM, Nathia Gali, Abbottabad, Khyber Pakhtunkhwa"));


        //Creating an ArrayAdapter
        PlacesDetailsArrayAdapter placesDetailsArrayAdapter=new PlacesDetailsArrayAdapter(getActivity(),placesDetailsArrayList,R.color.tanBackground);

        //Creating listView for dynamically displaying Lists
        ListView listView=(ListView) rootView.findViewById(R.id.lists);
        listView.setAdapter(placesDetailsArrayAdapter);

        return rootView;
    }

}
