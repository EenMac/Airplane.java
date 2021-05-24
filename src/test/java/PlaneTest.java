import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane;

    @Before
    public void Plane(){
        plane = new Plane(PlaneType.Boeing747);
    }

    @Test
    public void getCapacity() {
        assertEquals(150, plane.getCapacity());
    }

    @Test
    public void getTotalWeight() {
        assertEquals(50, plane.getTotalWeight());
    }
}
