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
public class GeneralPlacesFragment extends Fragment {


    public GeneralPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.places_details,container,false);
        //Creating ArrayList of type PlacesDetails Class
        ArrayList<PlacesDetails> placesDetailsArrayList=new ArrayList<PlacesDetails>();

        //Adding data to ArrayList by creating new objects of PlacesDetails Class.
        placesDetailsArrayList.add(new PlacesDetails("Kalam","Kalam is encircled by green hills, thick forests and blessed with mesmerizing Lakes, lively meadows and waterfalls, which make the Valley a must wandering place. It is the birthplace of the Swat River, made of two major tributaries; Gabral River and Ushu River.","Addres:FHFQ+42, Kalam, Swat, Khyber Pakhtunkhwa 19011"));
        placesDetailsArrayList.add(new PlacesDetails("Malam jaba","Malam Jabba Swat becomes the ultimate paradise because of the scenic views. Along with natural beauty, this destination offers a wide range of thrilling and exciting activities. Malam Jabba has the biggest and finest ski resort spanning over 270 acres of land and a ski slop of 800m.","Malam Jabba Rd, Malam Jabba, Swat, Khyber Pakhtunkhwa"));
        placesDetailsArrayList.add(new PlacesDetails("Gabin jaba","Gabin Jabba, which in Pashto means Honey marshes, is located approximately 65 km from Mingora on Matta Sakhra road within the Swat valley of the Khyber Pakhtunkhwa province of Pakistan. It is an area in Swat Valley with green meadows, thick forests, snow-clad mountains, mineral springs and high peaks","address: Gabin Jabba, Swat, Khyber Pakhtunkhwa"));
        placesDetailsArrayList.add(new PlacesDetails("Mahodand","Mahodand Lake is a lake located in the upper Usho Valley at a distance of about 35 kilometres from Kalam in Swat District of Khyber Pakhtunkhwa province of Pakistan. The lake is accessible by a four-wheel drive vehicle, and is often utilized for fishing and boating","Address: Ushu River Bridge, Ushu Road, Matiltan, Swat, Khyber Pakhtunkhwa"));
        placesDetailsArrayList.add(new PlacesDetails("Jahaz banda","Jahaz Banda, also spelt as Jaz Banda, is a large meadow in the upper reaches of the Kumrat Valley within the Upper Dir District of the Khyber Pakhtunkhwa province of Pakistan. It is located at an altitude of 3,100 m above sea level. The region is surrounded by snow-clad mountains, towering trees, and green pastures"));





        //Creating an ArrayAdapter
        PlacesDetailsArrayAdapter placesDetailsArrayAdapter=new PlacesDetailsArrayAdapter(getActivity(),placesDetailsArrayList,R.color.tanBackground);

        //Creating listView for dynamically displaying Lists
        ListView listView=(ListView) rootView.findViewById(R.id.lists);
        listView.setAdapter(placesDetailsArrayAdapter);

        return rootView;
    }

}
