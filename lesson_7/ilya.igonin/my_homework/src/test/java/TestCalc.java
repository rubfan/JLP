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
    public void testAdd() {
        Assert.assertEquals(calc.add(50, 10),60);
    }

    @Test
    public void testSub() {
        Assert.assertEquals(calc.sub(50, 10),40);

    }

    @Test
    public void testDiv() {
        Assert.assertEquals(calc.div(50, 10),5);

    }

    @Test
    public void testMil() {
        Assert.assertEquals(calc.mil(50, 10),500);

    }
}
