package airline;

import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Objects;

public class AirlineName implements AirlineInterface {

    // initialize variable name, type String
    private String airlineName;


    // constructor
    public AirlineName(String name) throws NullParameterException, BadParameterException {
        setAirlineName(name);
    }

    // setter
    private void setAirlineName(String alName) throws NullParameterException, BadParameterException {
        if (alName == null) {
            throw new NullParameterException("Null value passed in for setAirportName");
        }
        if (alName.length() > 8){
            throw new BadParameterException("Invalid name passed in for airlineName " + alName);
        }
        airlineName = alName;
    }

    // getter
    public String getAirlineName() {
        return airlineName;
    }


    //equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirlineName airline = (AirlineName) o;
        return Objects.equals(airlineName, airline.airlineName);
    }
    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(airlineName);
    }

    // toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "airline.Airline Name:", getAirlineName()));
        return sb.toString();
    }










}
