import java.time.LocalTime;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LanternTest {
    Lantern lantern;

    public LanternTest() {
    }

    @Before
    public void init() {
        this.lantern = new Lantern();
    }

    @Test
    public void isBatteryNotEmptyTest() {
        Assert.assertThat(this.lantern.battery, CoreMatchers.is(3));
    }

    @Test
    public void lightningValuesNotNullTest() {
        Assert.assertNotNull(Lightning.values());
        Matchers.containsInAnyOrder(new Object[]{Lightning.values(), Matchers.containsInAnyOrder(new Lightning[]{Lightning.WHITE, Lightning.RED, Lightning.BLINK})});
    }

    @Test
    public void setSensorEntryTimeTest() {
        CoreMatchers.is(LocalTime.now().isAfter(LocalTime.MIDNIGHT) && LocalTime.now().isBefore(LocalTime.MIDNIGHT.plusHours(24L)));
    }
}
