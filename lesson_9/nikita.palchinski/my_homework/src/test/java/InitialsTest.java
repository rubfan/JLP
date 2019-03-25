import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
public class InitialsTest {
    Initials lantern;

    @Before
    public void init() {
        lantern = new Initials();
    }

    @Test
    public void testGetSetBat() {
        lantern.setNumofBat(2);
        assertThat(lantern.getNumofBat(), is(2));
    }

    @Test
    public void testGetColor() {
        lantern.setNumofBat(2);
        assertThat(lantern.getColor(), is("red"));
    }

    @Test
    public void testGetSetState1() {
        lantern.setState("on");
        lantern.setNumofBat(2);
        assertThat(lantern.getState(), is("on"));
    }

    @Test
    public void testGetSetState2() {
        lantern.setNumofBat(0);
        assertThat(lantern.getState(), is("off"));
    }

}
