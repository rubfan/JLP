import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.core.AllOf;
import org.hamcrest.core.AnyOf;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.hamcrest.CoreMatchers.*;
import java.lang.String;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.greaterThan;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringStartsWith.startsWith;

//import static org.hamcrest.CoreMatchers.is;

public class LanternTest {
    LanternImpl lantern;

    @Before
    public void init() {
        lantern = new LanternImpl();
        lantern.setState(State.ON);
        lantern.setNumofBat(0);
    }


    @Test
    public void isBatteryEmpty() {
        is(lantern.batteries).matches(0);

    }

    @Test
    public void getColourTest1() {
        Assert.assertThat(lantern.getColour(), IsNot.not("white"));
    }

    @Test
    public void getColourTest2() {
        lantern.setNumofBat(1);
        Assert.assertThat(lantern.getColour(), AnyOf.anyOf(startsWith("whit"), containsString("whi")));
        Assert.assertThat(lantern.getColour(), AllOf.allOf(startsWith("whi"), containsString("te")));

    }

    @Test
    public void getColourTest3() {
        Assert.assertThat(lantern.getColour(), Is.is(nullValue()));
        lantern.setNumofBat(2);
        Assert.assertThat(lantern.getColour(), Is.is(notNullValue()));

    }

    @Test
    public void getBatteriesTest() {
        lantern.setPower(11);
        lantern.setNumofBat(2);
        Assert.assertThat(lantern.getPower(), Matchers.greaterThan(lantern.getNumofBat()));

    }

    @After
    public void lightOut() {
        lantern.setState(State.OFF);
    }
}
