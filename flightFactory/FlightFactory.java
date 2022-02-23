package flightFactory;

import airline.AirlineName;
import airport.AirportName;
import commercialFlight.CommercialFlight;
import exception.BadParameterException;
import exception.NullParameterException;
import passengerFlight.PassengerFlight;

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

    public static Flight createFlight(String type, AirlineName airline, AirportName origin, AirportName destination,
                                      UUID flightNumber,
                                      Date flightDate, int passengerCapacity) throws BadParameterException, NullParameterException {
        if (type.equals("CommercialFlight"))
            // if doing return type = Flight (interface)
            //return (Flight) new CommercialFlight(airline, origin, destination, flightNumber, flightDate);
            return new CommercialFlight(airline, origin, destination, flightNumber, flightDate);
        else if (type.equals("PassengerFlight")){
            return new PassengerFlight(airline, origin, destination, flightNumber, flightDate, passengerCapacity);
        }
        else return null;
    }

    // how to reconfigure main?
}
