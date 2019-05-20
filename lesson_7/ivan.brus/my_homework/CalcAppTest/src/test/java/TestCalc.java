import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalc {

    Calc calc;

    @Before
    public void init(){calc = new Calc();}

    @Test
    public void testAddShouldAdd(){
        calc.add(3,15);
        Assert.assertEquals(9, calc.add(3,6));
    }

    @Test
    public void testSub(){
        Assert.assertEquals(7,calc.sub(9,2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivNotZero(){
        Assert.assertEquals(0, calc.div(0,0));
    }

    @Test
    public void testMil(){
        Assert.assertEquals(8, calc.mil(4,2));
    }

    @Test
    public void testSumNotNull(){
        Assert.assertNotNull(calc.add(null,null));
    }
}
