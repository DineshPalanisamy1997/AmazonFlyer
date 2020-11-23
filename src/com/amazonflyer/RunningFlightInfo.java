package com.amazonflyer;

public interface RunningFlightInfo {

    public default void takeoffFlights(){};
    public default void landingFlights(){};
    public default void runningFlights(){};
    public default void emergencyLandingFlights(){}
    public default void runwayReq(){};
}
