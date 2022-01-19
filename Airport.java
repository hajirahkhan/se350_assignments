import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Objects;

public class Airport {

    // initialize variable name, type String
    private String airportName;

    //setters, constructor
    public Airport(String name) throws NullParameterException, BadParameterException {
            setAirportName(name);
    }

    private void setAirportName(String aName) throws NullParameterException, BadParameterException {
        if (aName == null) {
            throw new NullParameterException("Null value passed in for setAirportName");
        }
        if (! aName.matches("[A-Z]+") || aName.length() > 3) {
            throw new BadParameterException("Invalid name passed in for airportName " + aName);
        }
        airportName = aName;
    }

    // getters
    public String getAirportName() {
        return airportName;
    }

    //equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(airportName, airport.airportName);
    }

    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(airportName);
    }

    // toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airport Name:", getAirportName()));
        return sb.toString();
    }







}
