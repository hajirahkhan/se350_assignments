package flightManager;

import flightFactory.Flight;

import java.util.UUID;

public interface FlightManager {
    UUID getFlightByNumber(Flight flight);

    void createFlight(Flight flight);
}
