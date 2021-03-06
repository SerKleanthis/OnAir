package com.example.onair;

import java.io.Serializable;

public class Flight implements Serializable{

    private String departs_at, arrives_at, origin_airport, destination_airport, marketing_airline, operating_airline, flight_number, aircraft,
            travel_class, booking_code, airline_name;
    private int seats_remaining;
    private Airport_info airport_info;

    //empty constructor
    public Flight() {
    }

    //setters
    public void setDeparts_at(String departs_at) {
        this.departs_at = departs_at;
    }

    public void setArrives_at(String arrives_at) {
        this.arrives_at = arrives_at;
    }

    public void setOrigin_airport(String origin_airport) {
        this.origin_airport = origin_airport;
    }

    public void setDestination_airport(String destination_airport) {
        this.destination_airport = destination_airport;
    }

    public void setMarketing_airline(String marketing_airline) {
        this.marketing_airline = marketing_airline;
    }

    public void setOperating_airline(String operating_airline) {
        this.operating_airline = operating_airline;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public void setTravel_class(String travel_class) {
        this.travel_class = travel_class;
    }

    public void setBooking_code(String booking_code) {
        this.booking_code = booking_code;
    }

    public void setSeats_remaining(int seats_remaining) {
        this.seats_remaining = seats_remaining;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public Airport_info getAirport_info() {
        return airport_info;
    }

    // getters
    public String getDeparts_at() {
        return departs_at;
    }

    public String getArrives_at() {
        return arrives_at;
    }

    public String getOrigin_airport() {
        return origin_airport;
    }

    public String getDestination_airport() {
        return destination_airport;
    }

    public String getMarketing_airline() {
        return marketing_airline;
    }

    public String getOperating_airline() {
        return operating_airline;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public String getAircraft() {
        return aircraft;
    }

    public String getTravel_class() {
        return travel_class;
    }

    public String getBooking_code() {
        return booking_code;
    }

    public int getSeats_remaining() {
        return seats_remaining;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirport_info(Airport_info airport_info) {
        this.airport_info = airport_info;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departs_at='" + departs_at + '\'' +
                ", arrives_at='" + arrives_at + '\'' +
                ", origin_airport='" + origin_airport + '\'' +
                ", destination_airport='" + destination_airport + '\'' +
                ", marketing_airline='" + marketing_airline + '\'' +
                ", operating_airline='" + operating_airline + '\'' +
                ", flight_number='" + flight_number + '\'' +
                ", aircraft='" + aircraft + '\'' +
                ", travel_class='" + travel_class + '\'' +
                ", booking_code='" + booking_code + '\'' +
                ", airline_name='" + airline_name + '\'' +
                ", seats_remaining=" + seats_remaining +
                '}';
    }
}