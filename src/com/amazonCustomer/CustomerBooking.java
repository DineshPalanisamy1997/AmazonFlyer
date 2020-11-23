package com.amazonCustomer;

import com.amazonflyer.FlightList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerBooking<list> {

    List<CustomerInfo> customersRepo;

    public Map<String, List<String>> getList() {
        return list;
    }

    public void setList(Map<String, List<String>> list) {
        this.list = list;
    }

    Map<String, List<String>> list = new HashMap<>();
    List<String> availableFlights = new ArrayList<>();
    Map<String, Map<String,Map<Integer, Map<Boolean, Boolean>>>> bookstatus = new HashMap<>();

    String bs = "Business", es= "Economic";

    public CustomerBooking() {
        this.customersRepo = new ArrayList<>();
    }

    public void addCustomerToRepos(CustomerInfo c){
        try {
            if(!customersRepo.contains(c))
            {
                customersRepo.add(c);
                System.out.println("customer is added to repos successfully");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void search(String src, String des)
    {
        System.out.println("searching...");
        Map<String, List<String>> l =  this.getList();
        for(Map.Entry<String, List<String>> l1 : l.entrySet())
        {
            if(l1.getValue().get(0).equals(src) && l1.getValue().get(1).equals(des))
            {
                System.out.println("flight : "+l1.getKey()+" source : "+l1.getValue().get(0)+", destination : "+l1.getValue().get(1));
                availableFlights.add(l1.getKey());
            }

        }
    }
    public void book(String fname, String name, String seatType, Integer seatNumber, boolean book, boolean payment)
    {
       if(availableFlights.contains(fname))
       {
           if(bookstatus.size() == 0) {
               Map<Boolean, Boolean> seatAndPay = new HashMap<>();
               seatAndPay.put(book, payment);
               bookstatus.put(name, (Map<String, Map<Integer, Map<Boolean, Boolean>>>) new HashMap<>().put(seatType, new HashMap<>().put(seatNumber,new HashMap<>().put(book,payment))));
               System.out.println("successfully booked:)");
           }
           else if(bookstatus.get(name).get(seatType).get(seatNumber).containsKey(false))
           {
               Map<Boolean, Boolean> seatAndPay = new HashMap<>();
               seatAndPay.put(book, payment);
               bookstatus.put(name, (Map<String, Map<Integer, Map<Boolean, Boolean>>>) new HashMap<>().put(seatType, new HashMap<>().put(seatNumber,new HashMap<>().put(book,payment))));
               System.out.println("successfully booked!! :)");
           }
       }
       else
       {
           System.out.println("something wrong in booking the seat..please try again later.");
       }
    }

    public void displayAvailableFlights(){
        System.out.println("Available flights ...");
        for (String fname: availableFlights) {
            System.out.println(fname);
        }
    }


}
