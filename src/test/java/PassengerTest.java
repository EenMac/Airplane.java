import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void Passenger(){
        passenger = new Passenger("Jeff", 2);
    }

    @Test
    public void getNumBags() {
        assertEquals(2, passenger.getNumBags());
    }
}
