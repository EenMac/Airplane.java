import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirHostessTest{

    private AirHostess airHostess;

    @Before
    public void AirHostess(){
        airHostess = new AirHostess("Stacy", CabinCrew.AirHostess);
    }

    @Test
    public void getName() {
        assertEquals("Stacy", airHostess.getName());
    }

    @Test
    public void getRank() {
        assertEquals(CabinCrew.AirHostess, airHostess.getRank());
    }
}
