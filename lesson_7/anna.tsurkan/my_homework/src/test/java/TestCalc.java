import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalc {
    Calc calc;

    @Before
    public void init(){
        calc = new Calc();
    }
      @Test
    public void testMethodShouldAddTwoNumbers(){
        Assert.assertEquals(10, calc.add(5,5));
    }
      @Test
    public void testMethodShouldSubTwoNumbers(){
        Assert.assertEquals(0, calc.sub(5,5));
    }

    @Test
    public void testMethodShouldDivTwoNumbers(){
        Assert.assertEquals(1, calc.div(5,5));
    }
    @Test
    public void testMethodShouldMilTwoNumbers(){
        Assert.assertEquals(25, calc.mil(5,5));
    }

}
