package commercialFlight;

import airline.Airline;
import airport.Airport;
import exception.BadParameterException;
import exception.NullParameterException;
import flightFactory.Flight;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class CommercialFlight implements Flight {

    private String test;
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private UUID flightNumber;
    private Date flightDate;

    // constructor
    public CommercialFlight(Airline airline, Airport origin, Airport destination, UUID flightNumber, Date flightDate) throws NullParameterException, BadParameterException {
        setFlightAirline(airline);
        setFlightOrigin(origin);
        setFlightDestination(destination);
        setFlightNumber(flightNumber);
        setFlightDate(flightDate);
    }

    // setter
    private void setFlightDate(Date currentFlightDate) throws NullParameterException {
        if (currentFlightDate == null) {
            throw new NullParameterException("Null value passed in for setFlightDate");
        }
        flightDate = currentFlightDate;
    }

    // setter
    private void setFlightNumber(UUID currentFlightNumber) throws NullParameterException {
        if (currentFlightNumber == null) {
            throw new NullParameterException("Null value passed in for setFlightNumber");
        }
        flightNumber = currentFlightNumber;

    }

    // setter
    private void setFlightDestination(Airport flightDestination) throws NullParameterException {
        if (flightDestination == null) {
            throw new NullParameterException("Null value passed in for setFlightDestination");
        }
        destination = flightDestination;
    }

    // setter
    private void setFlightOrigin(Airport flightOrigin) throws NullParameterException  {
        if (flightOrigin == null) {
            throw new NullParameterException("Null value passed in for setFlightOrigin");
        }
        origin = flightOrigin;
    }

    // setter
    private void setFlightAirline(Airline flightAirline) throws NullParameterException {
        if (flightAirline == null) {
            throw new NullParameterException("Null value passed in for setFlightAirline");
        }
        airline = flightAirline;

    }
    // getters
    public Date getFlightDate() { return flightDate; }
    public UUID getFlightNumber() {return flightNumber;}
    public Airport getFlightDestination() {return destination;}
    public Airport getFlightOrigin() {return origin;}
    public Airline getFlightAirline() {return airline;}

    //equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommercialFlight flight = (CommercialFlight) o;
        return Objects.equals(airline, flight.airline) && Objects.equals(flightNumber, flight.flightNumber);
    }

    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(airline, flightNumber, origin, destination, flightDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       // sb.append(String.format("%-20s %s%n", "flight.Flight airline.Airline Name:", getFlightAirline()));
        sb.append(String.format("%-20s %s%n", "flight.Flight Number:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "flight.Flight origin:", getFlightOrigin()));
        sb.append(String.format("%-20s %s%n", "flight.Flight destination:", getFlightDestination()));
        sb.append(String.format("%-20s %s%n", "flight.Flight Date and Time:", getFlightDate()));

        return sb.toString();
    }


// toString() method






}
