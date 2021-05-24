import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChiefAirHostessTest {
    private ChiefAirHostess chiefAirHostess;

    @Before
    public void ChiefAirHostess(){
        chiefAirHostess = new ChiefAirHostess("Margot",CabinCrew.ChiefAirHostess);
    }

    @Test
    public void getName() {
        assertEquals("Margot", chiefAirHostess.getName());
    }

    @Test
    public void getRank() {
        assertEquals(CabinCrew.ChiefAirHostess, chiefAirHostess.getRank());
    }

    @Test
    public void getRankValue() {
        assertEquals("First-Officer", chiefAirHostess.getRankValue());
    }

    @Test
    public void makeAnnouncement() {
        assertEquals("Please put on your seatbelts", chiefAirHostess.speak());
    }
}
