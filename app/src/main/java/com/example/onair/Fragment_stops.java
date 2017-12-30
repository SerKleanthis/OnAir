package com.example.onair;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Fragment_stops extends Fragment {

    ViewHolder viewHolder;
    private ArrayList<Flight> list;
    private int list_position;
    public static final String TAG = "Fragment_stops";
    private String origin_airport, departure_time, destination_airport, arrive_time,
            airline_name, flight_number, aircraft, travel_class, departure_date, arrive_date,
            previous_destination_airport, previous_arrive_time, previous_arrive_date;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_stops, container, false);

        Log.i(TAG, "started");

        list = (ArrayList<Flight>) getArguments().getSerializable("outbound_list");
        list_position = getArguments().getInt("list_position");
        viewHolder = new ViewHolder();

        // initialize widgets
        viewHolder.origin_airport_detail = (TextView) view.findViewById(R.id.origin_airport_stops);
        viewHolder.departure_time_detail = (TextView) view.findViewById(R.id.departure_time_stops);
        viewHolder.departure_date = (TextView) view.findViewById(R.id.departure_date_stops);

        viewHolder.airline_name = (TextView) view.findViewById(R.id.airline_name_stops);
        viewHolder.flight_number = (TextView) view.findViewById(R.id.flight_number_stops);
        viewHolder.aircraft = (TextView) view.findViewById(R.id.aircraft_stops);
        viewHolder.travel_class = (TextView) view.findViewById(R.id.travel_class_stops);

        // previous
        viewHolder.previous_destination_airport = (TextView) view.findViewById(R.id.destination_airport_start);
        viewHolder.previous_arrive_time = (TextView) view.findViewById(R.id.arrive_time_start);
        viewHolder.previous_arrive_date = (TextView) view.findViewById(R.id.arrive_date_start);

        //take data
        take_data_for_stops();

        // set values to widget
        viewHolder.origin_airport_detail.setText(origin_airport);
        viewHolder.departure_time_detail.setText(departure_time);
        viewHolder.departure_date.setText(departure_date);

        //previus
        viewHolder.previous_destination_airport.setText(previous_destination_airport);
        viewHolder.previous_arrive_time.setText(previous_arrive_time);
        viewHolder.previous_arrive_date.setText(previous_arrive_date);

        // extras
        viewHolder.airline_name.setText(airline_name);
        viewHolder.flight_number.setText(flight_number);
        viewHolder.aircraft.setText(aircraft);
        viewHolder.travel_class.setText(travel_class);

        // Inflate the layout for this fragment
        return view;
    }

    public static class ViewHolder{
        TextView origin_airport_detail, departure_time_detail, previous_destination_airport, previous_arrive_time, previous_arrive_date;
        TextView airline_name, flight_number, aircraft, travel_class, departure_date, arrive_date;
        ImageView location_icon;
    }

    public void take_data_for_stops(){
        //airports
        origin_airport = list.get(list_position).getOrigin_airport();
        destination_airport = list.get(list_position).getDestination_airport();
        previous_destination_airport = list.get(list_position -1).getDestination_airport();

        //departure
        departure_time = list.get(list_position).getDeparts_at().substring(11);
        departure_date = list.get(list_position).getDeparts_at().substring(0,10);

        //arrive
        arrive_time = list.get(list_position).getArrives_at().substring(11);
        arrive_date = list.get(list_position).getArrives_at().substring(0,10);
        previous_arrive_time = list.get(list_position -1).getArrives_at().substring(11);
        previous_arrive_date = list.get(list_position -1).getArrives_at().substring(0,10);

        //airline name
        airline_name = list.get(list_position).getAirline_name();

        //more
        //airline_name = list.get(position).get
        flight_number = list.get(list_position).getFlight_number();
        aircraft = list.get(list_position).getAircraft();
        travel_class = list.get(list_position).getTravel_class();
    }
}