import exception.BadParameterException;
import exception.NullParameterException;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Flight {

    private String test;
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private UUID flightNumber;
    private Date flightDate;

    // constructor
    public Flight(Airline airline, Airport origin, Airport destination, UUID flightNumber, Date flightDate) throws NullParameterException, BadParameterException {
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
    private Date getFlightDate() { return flightDate; }
    private UUID getFlightNumber() {return flightNumber;}
    private Airport getFlightDestination() {return destination;}
    private Airport getFlightOrigin() {return origin;}
    private Airline getFlightAirline() {return airline;}

    //equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
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
       // sb.append(String.format("%-20s %s%n", "Flight Airline Name:", getFlightAirline()));
        sb.append(String.format("%-20s %s%n", "Flight Number:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "Flight origin:", getFlightOrigin()));
        sb.append(String.format("%-20s %s%n", "Flight destination:", getFlightDestination()));
        sb.append(String.format("%-20s %s%n", "Flight Date and Time:", getFlightDate()));

        return sb.toString();
    }


// toString() method






}
