import exception.BadParameterException;
import exception.NullParameterException;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;



public class TravelManager {

    //public static void main(String[] args) throws NullParameterException, BadParameterException {
    public static void main(String[] args)  {

        Date today = new Date();
        UUID currFlightNumber = UUID.randomUUID();

        Airport airport1 = null;
        try {
            airport1 = new Airport("ORD");
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        }
        Airport airport2 = null;
        try {
            airport2 = new Airport("MAA");
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        }
        Airline airline1 = null;
        try {
            airline1 = new Airline("United");
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        }
        Flight currFlight = null;
        try {
            currFlight = new Flight(airline1, airport1, airport2, currFlightNumber, today);
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        }

        System.out.println(airline1);
        System.out.println(airport1);
        System.out.println(currFlight);
    }
}
