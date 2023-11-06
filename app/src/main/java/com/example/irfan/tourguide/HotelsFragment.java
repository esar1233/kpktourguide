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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.places_details,container,false);

        //Creating ArrayList of type PlacesDetails Class
        ArrayList<PlacesDetails> placesDetailsArrayList=new ArrayList<PlacesDetails>();

        //Adding data to ArrayList by creating new objects of PlacesDetails Class.
        placesDetailsArrayList.add(new PlacesDetails("Royal Lushy Resort"," Good location overall for sightseeing, recreation, dining and getting around.","Room price    Rs:26,802","Location:Kumrat Valley, Upper Dir, Khyber Pakhtunkhwa 18200"));
        placesDetailsArrayList.add(new PlacesDetails("Nine Tree Hotel Naran "," One of the best hotel available in Naran. No match to rooms and cleanliness level. Electricity is remained available. Complimentary breakfast also included.Excellent place for family stay, great view and very supportive hotel staff.","Room price   Rs 26,416. ","Address:WM56+WC, Jheel Road, Katha, Naran, Mansehra, Khyber Pakhtunkhwa 54000"));
        placesDetailsArrayList.add(new PlacesDetails("Roomy Mountain Top Resort, Batakundi","Descent hotel, a little pricey though. Beds are comfortable and views are good. Staff is very friendly.","Room price Rs:5000."," Address:Babusar Road, After Batakundi Bazaar, Batakundi, 18414"));
        placesDetailsArrayList.add(new PlacesDetails("Pak Dream Hotel","Excellent place to stay at Besal. The staff is well mannered and kind. Rooms are clean and spacious with custom designed beds and bunk beds. Prices are affordable. Location is awesome hotel is surrounded by water streams and lush green meadows.","Room price  Rs: 8000."));
        placesDetailsArrayList.add(new PlacesDetails("The Sarai Hotel & Resort Naran","Neat and clean rooms. Heating available. Hot water facility 24/7. Great location - easy access to Naran Bazaar.Very friendly staff. Managed extremely well.","Room price  Rs 20,639."," Address:Saiful Muluk Rd, Katha, Naran, Mansehra, Khyber Pakhtunkhwa"));
        placesDetailsArrayList.add(new PlacesDetails("Swiss Wood Cottages","Amazing place. So beautiful. The location is so strategic right next to the main road but it feels so secluded with magnificent mountain view and beautiful well kept cottages. Clean rooms and bathrooms. 24/7 hot shower. Good water pressure for shower. Quite fast wifi internet speed.","Room price    Rs 25,443.","  Address :Manshera - Naran - jalkha- chilas Raod, Naran Bazaar, Naran, Mansehra, Khyber Pakhtunkhwa"));
        placesDetailsArrayList.add(new PlacesDetails("Hotel Karma"," One of the best hotel in the city with a magnificent view of river neelum because the hotel is located in the heart of city at the bank of river neelum. All rooms are fully equipped and very well maintained along with that the staff of hotel is very cooperative and vigilant. The rate per night is so cheap that a person or family can afford it so easily. Every bedroom's main window opens at river thus cool breeze flowing inside rooms all the time plus the sound of flowing thrush water."," Room price  Rs: 4,489."," Address:Main Tanga Adda Road, under Mr COD Restaurant, near Askari Bank, Muzaffarabad 31000 Pakistan"));
        placesDetailsArrayList.add(new PlacesDetails("Downtown Residency"," Downtown residency  muzaffarabad is a awesome place to stay . The rooms were clean, very comfortable, and the staff was amazing. highly recommend this hotel for anyone visiting.","Room price   Rs: 19,3335 ","Address :Jalalabad Near PM House Pir Chanasi Road, Muzaffarabad 13100 Pakistan"));
         placesDetailsArrayList.add(new PlacesDetails("Paradise Hotel","Paradise Hotel features air-conditioned accommodation in Shogran. This 2-star hotel offers room service. The hotel has family rooms. The nearest airport is Islamabad International Airport, 213 km from the hotel.","Room price  Rs:6800."," Address:    Shogran Rd, Shogran Kaghan, Mansehra, Khyber Pakhtunkhwa, Shogran" ));
        //Creating an ArrayAdapter
        PlacesDetailsArrayAdapter placesDetailsArrayAdapter=new PlacesDetailsArrayAdapter(getActivity(),placesDetailsArrayList,R.color.tanBackground);

        //Creating listView for dynamically displaying Lists
        ListView listView=(ListView)  rootView.findViewById(R.id.lists);
        listView.setAdapter(placesDetailsArrayAdapter);

        return rootView;
    }

}
