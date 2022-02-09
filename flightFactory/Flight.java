package flightFactory;

import airline.Airline;
import airport.Airport;

import java.util.Date;
import java.util.UUID;

public interface Flight {


    Date getFlightDate();
    public UUID getFlightNumber();
    Airport getFlightDestination();
    Airport getFlightOrigin();
    Airline getFlightAirline();
}
