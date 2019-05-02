import org.junit.Assert;
import org.junit.Test;

public class TestAirconditioner {
    Airconditioner A = new Airconditioner();

    @Test
    public void TestHeat(){
        A.turnOn();
        Assert.assertTrue(A.heat());
    }
    @Test
    public void TestCool(){
        A.turnOn();
        Assert.assertTrue(A.cool());
    }
    @Test
    public void TestSetTemperature(){
        Assert.assertEquals(A.setTemperature(15), 15);
    }
    @Test
    public void TestIncreaseTemperature(){
        A.setTemperature(15);
        Assert.assertEquals(A.increaseTemperature(), 16);
    }
    @Test
    public void TestDecreaseTemperature(){
        A.setTemperature(15);
        Assert.assertEquals(A.decreaseTemperature(), 14);
    }

}
