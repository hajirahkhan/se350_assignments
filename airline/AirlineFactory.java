package airline;

import exception.BadParameterException;
import exception.NullParameterException;

import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {

    private static Map<String, AirlineName> airlineCache = new HashMap<>();

    private AirlineFactory() {}

    public static AirlineInterface getAirlineName (String airline) {
        return airlineCache.computeIfAbsent(airline, newAirline -> {
            try {
                return new AirlineName(airline);
            } catch (NullParameterException e) {
                e.printStackTrace();
            } catch (BadParameterException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
}
