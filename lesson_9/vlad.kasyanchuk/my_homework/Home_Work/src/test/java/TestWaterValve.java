import org.junit.Assert;
import org.junit.Test;

public class TestWaterValve {
    WaterValve valve = new WaterValve();

    @Test
    public void testWarmWater(){
        valve.turnOnColdWater();
        valve.turnOffHotWater();
        Assert.assertFalse(valve.turnOnWarmWater());
    }
    @Test
    public void testSwitcToShower(){
        Assert.assertTrue(valve.switchToShower());
    }
   }
