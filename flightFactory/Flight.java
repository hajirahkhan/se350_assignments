package flightFactory;

import airline.AirlineName;
import airport.AirportName;

import java.util.Date;
import java.util.UUID;

public interface Flight {


    Date getFlightDate();
    public UUID getFlightNumber();
    AirportName getFlightDestination();
    AirportName getFlightOrigin();
    AirlineName getFlightAirline();
    int getPassengerCapacity();


}
