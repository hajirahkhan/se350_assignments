package flightManager;

import airline.AirlineName;
import airport.AirportName;
import exception.BadParameterException;
import exception.NullParameterException;
import flightFactory.Flight;
import flightFactory.FlightFactory;

//import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public final class RealFlightManager implements FlightManager {
    // public final class FlightManager extends FlightFactory {
    // error here

    private static RealFlightManager ourInstance;

    // does this initialize an empty list when FlightManager is instantiated? or pirvate constructor
    private ArrayList<Flight> flights = new ArrayList();

    public static RealFlightManager getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new RealFlightManager();
            // initializes empty list when flightManager instantiated
            //List flights = new List();

        return ourInstance;
    }

    // create flight function
    // took list of flights out of getInstance method so can access it here

    // accpet parametrs here too
    // does this correctly delegate creation of flight to flight factory?
    public void createFlight(String type, AirlineName airline, AirportName origin, AirportName destination,
                             UUID flightNumber,
                             Date flightDate, int passengerCapacity) throws BadParameterException, NullParameterException {
       // FlightFactory newFlight = new FlightFactory();
        Flight newFlight = FlightFactory.createFlight(type, airline, origin, destination, flightNumber, flightDate, passengerCapacity);
        flights.add(newFlight);
    }

    // not returning the right thing
    // how to check if this is working correctly?
    // return type of flight
    public Flight getFlightByNumber (UUID flightNum) throws NullParameterException {
        Flight ans = null;
        if (flights.size() <= 0){
            System.out.println("if statement 1");
            throw new NullParameterException("Flight does not exist");
        }
        else {
            for (int i = 0; i < flights.size(); i++)
                if (flightNum == flights.get(i).getFlightNumber()) {
                    ans =  flights.get(i);
                    // return the flight itself from the list, using for loop
                    System.out.println("entered for loop");

                }
            else throw new NullParameterException("Flight does not exist");
        }
        return ans;
    }


    @Override
   /* public String toString(String type, Airline airline, Airport origin, Airport destination,
                           UUID flightNumber,
                           Date flightDate) throws BadParameterException, NullParameterException {
     //    return "FlightManager{}";
        StringBuilder sb = new StringBuilder();
        // sb.append(String.format("%-20s %s%n", "flight.Flight airline.Airline Name:", getFlightAirline()));
        sb.append(String.format("%-20s %s%n", "flight.Flight Number:", FlightFactory.createFlight(type,
                airline, origin, destination, flightNumber, flightDate)));


        return sb.toString();*/
    public String toString(){
        return "FlightManager{}";

    }

    @Override
    public UUID getFlightByNumber(Flight flight) {
        return null;
    }

    @Override
    public void createFlight(Flight flight) {

    }
}
