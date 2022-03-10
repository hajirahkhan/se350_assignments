package travelManager;

import airline.AirlineName;
import airport.AirportName;
import exception.BadParameterException;
import exception.NullParameterException;
import flightManager.FlightManager;
import flightManager.RealFlightManager;
import flightManager.ProxyFlightManager;

import java.util.Date;
import java.util.UUID;



public class TravelManager {

    //public static void main(String[] args) throws NullParameterException, BadParameterException {
    public static void main(String[] args) throws Exception, NullParameterException {

        Date today = new Date();
        UUID currFlightNumber = UUID.randomUUID();

        AirportName airport1 = null;

        AirportName airport2 = null;

        AirlineName airline1 = null;

        RealFlightManager currFlight1 = null;
        RealFlightManager currFlight2 = null;
        try {
            airport1 = new AirportName("ORD");
            airport2 = new AirportName("MAA");
            airline1 = new AirlineName("United");
            RealFlightManager.getInstance().createFlight("PassengerFlight",airline1, airport1, airport2, currFlightNumber, today, 25);
            RealFlightManager.getInstance().createFlight("CommercialFlight",airline1, airport1, airport2, currFlightNumber, today, 1);

            FlightManager flightFactory = new ProxyFlightManager();
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


      //  flightFactory.getFlightNumber(currFlightNumber);

       System.out.println(RealFlightManager.getInstance().getFlightByNumber(currFlightNumber));

        // System.out.println(airline1);
        // System.out.println(airport1);
        //System.out.println(currFlightNumber);

        //FlightManager fm=new FlightManager();
        //fm.getFlightByNumber();
    }
}
