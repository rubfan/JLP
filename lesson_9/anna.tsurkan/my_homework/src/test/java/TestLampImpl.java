import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import org.hamcrest.core.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestLampImpl {

    LampImpl lamp;

    @Before
     public void init(){
        lamp = new LampImpl();
    }

    @Test
   public void testMethodShouldTurnOnLamp() {
        assertThat(lamp.turnOnTheLamp(), Is.is("turn on"));

    }
   @Test
     public void testMethodShouldTurnOffLamp()
    {
        Assert.assertEquals("turn off", lamp.turnOffTheLamp());
    }
}
