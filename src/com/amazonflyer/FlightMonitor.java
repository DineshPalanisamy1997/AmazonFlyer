package com.amazonflyer;

import java.util.ArrayList;
import java.util.List;

public class FlightMonitor implements  RunningFlightInfo{
    List<FlightDataRepo> flightCenter = new ArrayList<>();

    FlightMonitor(FlightDataRepo flights)
    {
        flightCenter.add(flights);
    }

    public boolean addDataToCenter(FlightDataRepo flights)
    {
        if(!flightCenter.contains(flights))
        {
            flightCenter.add(flights);
            System.out.println("successfully added to center");
            return true;
        }
        System.out.println("failed to add to center");
        return false;
    }

    public boolean canTakeoff(FlightDataRepo repo,FlightDetails flight)
    {
        if(flightCenter.contains(repo))
        {
            FlightDataRepo reqRepo = flightCenter.get(flightCenter.indexOf(repo));
            return reqRepo.isFlightParamsGood(flight);
        }
        return false;
    }

    public void checkParams(FlightDataRepo repo, FlightDetails flight)
    {
        if(flightCenter.contains(repo))
        {
            if(flightCenter.get(flightCenter.indexOf(repo)).flights.contains(flight))
            {
                System.out.println(flight.getFlightName()+" : speed - "+flight.getSpeed()+", altitude -> "+flight.getAltitude());
            }
        }
        else{
            System.out.println("incorrect data..");
        }
    }

    @Override
    public void takeoffFlights() {
        for(FlightDataRepo flights : flightCenter)
        {
            System.out.println("Take off flights :");
           for(FlightDetails flight : flights.flights)
           {
               if(flight.isTakeoff())
               {
                   System.out.println(flight.getFlightName());
               }
           }
        }
    }

    @Override
    public void landingFlights() {
        for(FlightDataRepo flights : flightCenter)
        {
            System.out.println("landing flights :");
            for(FlightDetails flight : flights.flights)
            {
                if(flight.isLanding())
                {
                    System.out.println(flight.getFlightName());
                }
            }
        }
    }

    @Override
    public void runningFlights() {
        for(FlightDataRepo flights : flightCenter)
        {
            System.out.println("Running flights :");
            for(FlightDetails flight : flights.flights)
            {
                if(flight.isRunning())
                {
                    System.out.println(flight.getFlightName());
                }
            }
        }
    }

    @Override
    public void emergencyLandingFlights() {
        for(FlightDataRepo flights : flightCenter)
        {
            System.out.println("emergency landing flights :");
            for(FlightDetails flight : flights.flights)
            {
                if(flight.isEmergencyLand())
                {
                    System.out.println(flight.getFlightName());
                }
            }
        }
    }

    @Override
    public void runwayReq() {
        System.out.println("Emergency landing need runway clearance for landing..");
    }
}
