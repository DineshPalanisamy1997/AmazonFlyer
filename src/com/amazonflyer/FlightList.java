package com.amazonflyer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightList {
    public Map<String, List<String>> flightSchedule;
    public Map<String, Map<String, Integer>> seatsAndPrice;

    public Map<String, Map<String, Integer>> getSeatsAndPrice() {
        return seatsAndPrice;
    }

    public FlightList()
    {
        this.flightSchedule = new HashMap<>();
        this.seatsAndPrice = new HashMap<>();
    }

    public void addSeatAndPrice(String fName, String seatType, Integer price)
    {
        if(!seatsAndPrice.containsKey(fName))
        {
            HashMap<String, Integer> priceToSeat = new HashMap<String, Integer>();
            priceToSeat.put(seatType, price);
            seatsAndPrice.put(fName, priceToSeat);
        }
    }

    public void mapSchedule(String flightName, String src, String des)
    {
        try {
            if(!flightSchedule.containsKey(flightName))
            {
                List<String> srcToDes = new ArrayList<>();
                srcToDes.add(src);
                srcToDes.add(des);
                flightSchedule.put(flightName, srcToDes);
            }
            else
            {
                System.out.println("Given flight name already exist..");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, List<String>> getFlightSchedule() {
        return flightSchedule;
    }

    public void displayList()
    {
        for (Map.Entry<String, List<String>> flights: flightSchedule.entrySet()) {
            System.out.println("flight :"+flights.getKey()+" ,source = "+flights.getValue().get(0)+", " +
                    "Destination = "+flights.getValue().get(1));
        }
    }
}
