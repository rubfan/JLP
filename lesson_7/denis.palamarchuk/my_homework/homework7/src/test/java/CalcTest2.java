import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class CalcTest2 {
    Calc calc=new Calc();
    @Test
    public void add() {
        assertEquals(10, calc.add(5,5));
    }

    @Test
    public void sub() {
        assertEquals(0, calc.sub(5,5));
    }

    @Test
    public void div() {
        assertEquals(1, calc.div(5,5));
    }

    @Test
    public void mul() {
        assertEquals(25, calc.mul(5,5));
    }
}