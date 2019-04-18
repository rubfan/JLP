package project;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalc {
    Calc calc;

    @Before
    public void init() {
        calc = new Calc();
    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void testSub() throws Exception {
        Assert.assertEquals(2, calc.sub(4, 2));
    }

    @Test
    public void testDiv() throws Exception {
        Assert.assertEquals(2,calc.div(4,2));
    }

    @Test
    public void testMul() throws Exception {
        Assert.assertEquals(4,calc.mul(2,2));
    }
}
