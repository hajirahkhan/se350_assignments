package passengerFlight;

import airline.AirlineName;
import airport.AirportName;
import exception.BadParameterException;
import exception.NullParameterException;
import flightFactory.Flight;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class PassengerFlight implements Flight {
    // implements Flight
    private String test;
    private AirlineName airline;
    private AirportName origin;
    private AirportName destination;
    private UUID flightNumber;
    private Date flightDate;
    private int passengerCapacity;

    // constructor
    public PassengerFlight(AirlineName airline, AirportName origin, AirportName destination, UUID flightNumber, Date flightDate, int passengerCapacity) throws NullParameterException, BadParameterException {
        setFlightAirline(airline);
        setFlightOrigin(origin);
        setFlightDestination(destination);
        setFlightNumber(flightNumber);
        setFlightDate(flightDate);
        setPassengerCapacity(passengerCapacity);
    }

    private void setPassengerCapacity(int currentPassengerCapacity) throws NullParameterException {
        if (currentPassengerCapacity < 0){
            throw new NullParameterException("Invalid value passed in for passengerCapacity");
        }
        passengerCapacity = currentPassengerCapacity;
    }

    private void setFlightDate(Date currentFlightDate) throws NullParameterException {
        if (currentFlightDate == null) {
            throw new NullParameterException("Null value passed in for setFlightDate");
        }
        flightDate = currentFlightDate;
    }

    private void setFlightNumber(UUID currentFlightNumber) throws NullParameterException {
        if (currentFlightNumber == null) {
            throw new NullParameterException("Null value passed in for setFlightNumber");
        }
        flightNumber = currentFlightNumber;
    }


    private void setFlightDestination(AirportName flightDestination) throws NullParameterException {
        if (flightDestination == null) {
            throw new NullParameterException("Null value passed in for setFlightDestination");
        }
        destination = flightDestination;
    }

    private void setFlightOrigin(AirportName flightOrigin) throws NullParameterException  {
        if (flightOrigin == null) {
            throw new NullParameterException("Null value passed in for setFlightOrigin");
        }
        origin = flightOrigin;
    }

    private void setFlightAirline(AirlineName flightAirline) throws NullParameterException {
        if (flightAirline == null) {
            throw new NullParameterException("Null value passed in for setFlightAirline");
        }
        airline = flightAirline;
    }

    // getters
    public Date getFlightDate() { return flightDate; }
    public UUID getFlightNumber() {return flightNumber;}
    public AirportName getFlightDestination() {return destination;}
    public AirportName getFlightOrigin() {return origin;}
    public AirlineName getFlightAirline() {return airline;}
    public int getPassengerCapacity() {return passengerCapacity;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerFlight that = (PassengerFlight) o;
        return passengerCapacity == that.passengerCapacity && Objects.equals(test, that.test) && Objects.equals(airline, that.airline) && Objects.equals(origin, that.origin) && Objects.equals(destination, that.destination) && Objects.equals(flightNumber, that.flightNumber) && Objects.equals(flightDate, that.flightDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(test, airline, origin, destination, flightNumber, flightDate, passengerCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "flight.Flight airline.Airline Name:", getFlightAirline()));
        sb.append(String.format("%-20s %s%n", "flight.Flight Number:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "flight.Flight origin:", getFlightOrigin()));
        sb.append(String.format("%-20s %s%n", "flight.Flight destination:", getFlightDestination()));
        sb.append(String.format("%-20s %s%n", "flight.Flight Date and Time:", getFlightDate()));
        sb.append(String.format("%-20s %s%n", "flight.Flight Passenger capacity:", getPassengerCapacity()));

        return sb.toString();
    }
}
