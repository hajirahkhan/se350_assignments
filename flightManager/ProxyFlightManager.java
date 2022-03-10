package flightManager;

import flightFactory.Flight;

import java.util.UUID;

public class ProxyFlightManager implements FlightManager {

    private static FlightManager realObject;

    @Override
    public UUID getFlightByNumber (Flight flight) {
        System.out.println("Flight number: " + "flightNumber"  +
                " is being retrieved" );

        if (realObject == null) {
            realObject = new RealFlightManager();
        }

        return realObject.getFlightByNumber(flight);
    }
    @Override
    public void createFlight (Flight flight) {
        System.out.println("a flight is being created");

        if (realObject == null) {
            realObject = new RealFlightManager();
        }

        realObject.createFlight(flight);
    }





}
