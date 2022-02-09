package flightFactory;

import airline.Airline;
import airport.Airport;
import commercialFlight.CommercialFlight;
import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Date;
import java.util.UUID;

public class FlightFactory {
// make this static
// public vs private constructor
    private FlightFactory() {
    }


    // take in origin etc.
    //public static typeCommercialFlight createFlight(String type){
    // interface called flight
    // type returned to be interface

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination,
                                                UUID flightNumber,
                                                Date flightDate) throws BadParameterException, NullParameterException {
        if (type.equals("CommercialFlight"))
            // if doing return type = Flight (interface)
            //return (Flight) new CommercialFlight(airline, origin, destination, flightNumber, flightDate);
            return new CommercialFlight(airline, origin, destination, flightNumber, flightDate);
        else return null;
    }

    // how to reconfigure main?
}
