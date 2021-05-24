import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    private Flight flight;
    private PlaneType planeType;
    private Plane plane;
    private ArrayList<Passenger>passengers;
    private FlightManager flightManager;
    @Before
    public void FlightManager(){
        flight = new Flight("QA23175623", "Mexico", "Edinburgh", "4:30", passengers);
        plane = this.plane;
        passengers = new ArrayList<>();
        flightManager = this.flightManager;
    }

    @Test
    public void getTotalPassengers() {
        assertEquals(0, flightManager.totalPassengers());
    }
}
