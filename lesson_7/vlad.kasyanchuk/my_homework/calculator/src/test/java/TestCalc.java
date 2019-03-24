import org.junit.Assert;
import org.junit.Test;

public class TestCalc {
    @Test
    public void testCaldAdd (){
        Assert.assertEquals(Calc.add(3, 6),9);
    }
    @Test
    public void testCaldSub (){
        Assert.assertEquals(Calc.sub(3, 6),-3);
    }
    @Test
    public void testCaldDiv (){
        Assert.assertEquals(Calc.div(0, 6),0);
    }
    @Test
    public void testCaldMil (){
        Assert.assertEquals(Calc.mil(6, 2),3);
    }
}
