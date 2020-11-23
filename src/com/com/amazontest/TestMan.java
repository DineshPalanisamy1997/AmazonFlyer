package com.com.amazontest;

import com.amazonCustomer.CustomerBooking;
import com.amazonCustomer.CustomerInfo;
import com.amazonflyer.FlightDataRepo;
import com.amazonflyer.FlightDetails;
import com.amazonflyer.FlightList;

public class TestMan {
    public static void main(String[] args) {
        //flight data
        FlightDetails jumbo = new FlightDetails("spice123",202,30,30,90);
        //flight repository
        FlightDataRepo repos = new FlightDataRepo();
        repos.add(jumbo);
        System.out.println(jumbo.getFlightName());

        //flight list
        FlightList list = new FlightList();
        list.mapSchedule("spice123","Erode","Bangalore");
        list.mapSchedule("fishmaker0","Erode","Bangalore");
        list.mapSchedule("fishmaker2","Erode","Coimbatore");
        list.mapSchedule("fishmaker1","Madras","Bangalore");
        list.addSeatAndPrice("spice123","Bseats",200);
        list.addSeatAndPrice("spice123","Eseats",200);
        list.addSeatAndPrice("fishmaker","Bseats",202);
        list.displayList();

        //customer data
        CustomerInfo customer1 = new CustomerInfo("dinesh",22,"21-12-21","adar");
        CustomerBooking book = new CustomerBooking();
        book.setList(list.getFlightSchedule());
        book.search("Erode","Bangalore");
        book.addCustomerToRepos(customer1);
        book.displayAvailableFlights();
        book.book("spice123","Dinesh","Bseats",1,true,true);


    }
}
