import junit.framework.Assert;
import org.junit.Test;

public class TestCalc {

    @Test
    public void testCalcShouldReturnSum(){
        Assert.assertEquals(Calc.add(10,30),40);
    }

    @Test
    public void testCalcShouldReturnDif(){

        Assert.assertEquals(Calc.sub(50,10),40);
    }

    @Test
    public void testCalcShouldReturnDiv(){
        Assert.assertEquals(Calc.div(30,10),3);
    }

    @Test
    public void testCalcShouldReturnMul(){
        Assert.assertEquals(Calc.mul(10,30),300);
    }
}
