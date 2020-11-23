package com.amazonflyer;

public class FlightDetails implements Runnable {
    private String flightName;
    private int flightID;
    private int Eseats;
    private int Bseats;
    private int totalSeats;
    private boolean isEngineGood = true;
    private boolean isWingsGood = true;
    private boolean isFuelTankFilled = true;
    private boolean isMPGood = true;
    boolean block = false;
    private int altitude = 0;
    private boolean emergencyLand = false;

    public boolean isEmergencyLand() {
        return emergencyLand;
    }

    public void setEmergencyLand(boolean emergencyland) {
        this.emergencyLand = emergencyland;
    }

    public boolean isTakeoff() {
        return takeoff;
    }

    public void setTakeoff(boolean takeoff) {
        this.takeoff = takeoff;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isLanding() {
        return landing;
    }

    public void setLanding(boolean landing) {
        this.landing = landing;
    }

    public boolean isRest() {
        return rest;
    }

    public void setRest(boolean rest) {
        this.rest = rest;
    }

    private int speed = 0;
    private boolean takeoff = false;
    private boolean running = false;
    private boolean landing = false;
    private boolean rest = true;

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isEngineGood() {
        return isEngineGood;
    }

    public void setEngineGood(boolean engineGood) {
        isEngineGood = engineGood;
    }

    public boolean isWingsGood() {
        return isWingsGood;
    }

    public void setWingsGood(boolean wingsGood) {
        isWingsGood = wingsGood;
    }

    public boolean isFuelTankFilled() {
        return isFuelTankFilled;
    }

    public void setFuelTankFilled(boolean fuelTankFilled) {
        isFuelTankFilled = fuelTankFilled;
    }

    public boolean isMPGood() {
        return isMPGood;
    }

    public void setMPGood(boolean MPGood) {
        isMPGood = MPGood;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public FlightDetails(String name, int id, int es, int bs, int total)
    {
        this.flightName = name;
        this.flightID = id;
        this.Eseats = es;
        this.Bseats = bs;
        this.totalSeats = total;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public int getEseats() {
        return Eseats;
    }

    public void setEseats(int eseats) {
        Eseats = eseats;
    }

    public int getBseats() {
        return Bseats;
    }

    public void setBseats(int bseats) {
        Bseats = bseats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    @Override
    public void run() {
        int i = 2;
        int count = 0;
        while(true)
        {
            setSpeed(i++);
            setAltitude(i*10);
            System.out.println(" speed -> "+getSpeed()+" ,Altitude -> "+getAltitude());
            if(count == 20) break;
            count++;
        }
    }
}
