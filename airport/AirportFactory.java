package airport;

import airline.AirlineInterface;
import airline.AirlineName;
import exception.BadParameterException;
import exception.NullParameterException;

import java.util.HashMap;
import java.util.Map;

public class AirportFactory {
    private static Map<String, AirportName> airportCache = new HashMap<>();

    private AirportFactory() {}

    public static AirportInterface getAirportName (String airport) {
        return airportCache.computeIfAbsent(airport, newAirport -> {
            try {
                return new AirportName(airport);
            } catch (NullParameterException e) {
                e.printStackTrace();
            } catch (BadParameterException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
}
