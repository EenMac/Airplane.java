import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private CabinCrewMembers cabinCrewMembers;
    private Pilot pilot;
    private ArrayList<AirHostess>airHostess;
    private ArrayList<ChiefAirHostess>chiefAirHostess;
    private ArrayList<Passenger>jumpSeat;
    private Plane plane;
    private Flight flight;
    private AirHostess airHostess1;
    private AirHostess airHostess2;
    private AirHostess airHostess3;
    private AirHostess airHostess4;
    private ChiefAirHostess cabinLeader;
    private Passenger passenger;
    private ChiefAirHostess backupBetty;
    private ArrayList<Passenger>passengers;


    @Before
    public void setUpFlight(){
        pilot = new Pilot("Dirk Swallows", "Captain", 747230443);
        airHostess = new ArrayList<>();
        chiefAirHostess = new ArrayList<>();
        passengers = new ArrayList<>();
        plane = new Plane(PlaneType.AvroRJ85);
        flight = new Flight("QA23175623", "Dubai", "Edinburgh", "4:30", passengers);
        airHostess1 = new AirHostess("Stacy", CabinCrew.AirHostess);
        airHostess2 = new AirHostess("Kirsty", CabinCrew.AirHostess);
        airHostess3 = new AirHostess("Melanie", CabinCrew.AirHostess);
        cabinLeader = new ChiefAirHostess("Elaine", CabinCrew.AirHostess);
        airHostess.add(airHostess1);
        airHostess.add(airHostess2);
        airHostess.add(airHostess3);
        chiefAirHostess.add(cabinLeader);
        cabinCrewMembers = new CabinCrewMembers(airHostess, chiefAirHostess, jumpSeat);
        passenger = new Passenger("Jim", 2);
    }

    @Test
    public void getAirHostessCount() {
        assertEquals(3, cabinCrewMembers.getAirHostessNumbers());
    }

    @Test
    public void getChiefAirHostessCount() {
        assertEquals(1, cabinCrewMembers.getChiefAirHostessNumbers());
    }

    @Test
    public void getFlightNumber() {
        assertEquals("QA23175623", flight.getFlightNo());
    }

    @Test
    public void getFlightDestination() {
        assertEquals("Dubai", flight.getDestination());
    }
    @Test
    public void getFlightDeparture(){
        assertEquals("Edinburgh", flight.getDepartureLocation());
    }

    @Test
    public void getDepartureTime() {
        assertEquals("4:30", flight.getDepartureTime());
    }

    @Test
    public void returnNullPassengers() {
        assertEquals(0, flight.getPassengerList());
    }
    @Test
    public void canAddPassenger() {
        passengers.add(passenger);
        assertEquals(1, flight.getPassengerList());
    }
    @Test
    public void canAddAirHostess(){
        airHostess.add(airHostess4);
        assertEquals(4, cabinCrewMembers.getAirHostessNumbers());
    }
    @Test
    public void canAddChiefAirHostess(){
        chiefAirHostess.add(backupBetty);
        assertEquals(2, cabinCrewMembers.getChiefAirHostessNumbers());
    }
    @Test
    public void getPilotName(){
        assertEquals("Dirk Swallows", pilot.getName());
    }

    @Test
    public void getTotalSeats() {
        assertEquals(30, PlaneType.AvroRJ85.getCapacityValue());
    }
    @Test
    public void getRemainingSeats(){
        passengers.add(passenger);
        assertEquals(29, flight.getRemainingSeats());
    }
}
