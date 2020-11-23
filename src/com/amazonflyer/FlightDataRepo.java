package com.amazonflyer;

import java.util.ArrayList;
import java.util.List;

public class FlightDataRepo {

    public List<FlightDetails> getFlights() {
        return flights;
    }

    public List<FlightDetails> flights = new ArrayList<>();;


    public void add(FlightDetails flight)
    {
        try {
            if (!flights.contains(flight)){
            flights.add(flight);
            System.out.println(flight.getFlightName()+" is added successfully");
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void remove(FlightDetails flight)
    {
        if(flights.contains(flight))
        {
            flights.remove(flight);
            System.out.println(flight.getFlightName()+" is removed successfully");
        }
    }

    public void edit(FlightDetails flight, String name)
    {
        try {
            if (flights.contains(flight)) {
                System.out.println("editing..");
                flights.get(flights.indexOf(flight)).setFlightName(name);
                System.out.println(flight.getFlightName()+ "is changed to "+name);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean blockFlight(FlightDetails flight)
    {
        if(flights.contains(flight))
        {
            flight.block = true;
            System.out.println("flight is blocked successfully");
        }
        return flight.block;
    }

    public boolean isFlightParamsGood(FlightDetails flight)
    {
        return flight.isEngineGood() && flight.isFuelTankFilled() && flight.isMPGood() && flight.isWingsGood();
    }

}
