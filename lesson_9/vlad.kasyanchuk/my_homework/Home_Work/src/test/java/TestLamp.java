import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;

public class TestLamp {
    Lamp lamp = new Lamp();

    @Test
    public void doesLampHaveName(){
        Assert.assertNotEquals(lamp.name, null);
    }
    @Test
    public void isBatteryNotNull(){
        Assert.assertNotEquals(lamp.battery, null);
    }
    @Test
    public void TryingToSetBatteries(){

        Assert.assertThat(lamp.getBattery(), equalTo(3) );
    }
    @Test
    public void TestShowLight(){
        lamp.setBattery(3);
        Assert.assertThat(lamp.setLight(), equalTo("blink"));
    }

}
