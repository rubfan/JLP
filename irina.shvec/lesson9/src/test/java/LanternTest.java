import org.hamcrest.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;


public class LanternTest {
    Lantern lantern;

    @Before
    public void init() {
        lantern = new Lantern();
    }


    @Test
    public void isBatteryNotEmptyTest() {
        CoreMatchers.is(lantern.battery).matches(3);

    }

    @Test
    public void lightningValuesNotNullTest() {
        Assert.assertNotEquals(Lightning.values(), null);
    }

    @Test
    public void setSensorEntryTimeTest() {
        CoreMatchers.is(LocalTime.now().isAfter(LocalTime.MIDNIGHT) && LocalTime.now().isBefore(LocalTime.MIDNIGHT.plusHours(24)));

    }
}