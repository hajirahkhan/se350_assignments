import airline.AirlineName;
import airport.AirportName;
import exception.BadParameterException;
import exception.NullParameterException;
import flightManager.FlightManager;

import java.util.Date;
import java.util.UUID;



public class TravelManager {

    //public static void main(String[] args) throws NullParameterException, BadParameterException {
    public static void main(String[] args) throws Exception, NullParameterException {

        Date today = new Date();
        UUID currFlightNumber = UUID.randomUUID();

        AirportName airport1 = null;
        try {
            airport1 = new AirportName("ORD");
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        }
        AirportName airport2 = null;
        try {
            airport2 = new AirportName("MAA");
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        }
        AirlineName airline1 = null;
        try {
            airline1 = new AirlineName("United");
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        }
        FlightManager currFlight1 = null;
        FlightManager currFlight2 = null;
        try {
            //currFlight = new CommercialFlight(airline1, airport1, airport2, currFlightNumber, today);
            // replace line 47 w call to flightManger's create lfight method
            // not trying to create an instnace of flight manager, use get instance method
            FlightManager.getInstance().createFlight("PassengerFlight",airline1, airport1, airport2, currFlightNumber, today, 25);
            FlightManager.getInstance().createFlight("CommercialFlight",airline1, airport1, airport2, currFlightNumber, today, 1);
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }



       System.out.println(FlightManager.getInstance().getFlightByNumber(currFlightNumber));

        // System.out.println(airline1);
        // System.out.println(airport1);
        //System.out.println(currFlightNumber);

        //FlightManager fm=new FlightManager();
        //fm.getFlightByNumber();
    }
}
