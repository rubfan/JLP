package street;

import org.junit.Assert;
import org.junit.Test;

public class StreetTest {

    @Test
    public void testCrossColour(){
        Assert.assertEquals(new Street(TrafficLight.YELLOW).cross(), "Prepare!");
    }

    @Test
    public void testCrossReturnType(){
        Assert.assertTrue(new Street(TrafficLight.RED).cross() instanceof String);
    }
}