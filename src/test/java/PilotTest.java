import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void Pilot(){
        pilot = new Pilot("Duncan Swallows", "Captain", 747230443);
    }

    @Test
    public void getRank() {
        assertEquals("Captain", pilot.getRank());
    }
    @Test
    public void getLicenseNumber(){
        assertEquals(747230443, pilot.getLicenseNumber());
    }
    @Test
    public void makeAnnouncement() {assertEquals("I hope you have a pleasant flight", pilot.announcement());
    }
}

