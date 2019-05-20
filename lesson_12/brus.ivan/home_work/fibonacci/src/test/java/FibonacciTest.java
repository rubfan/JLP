import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    Fibonacci f;

    @Before
    public void init() {
        f = new Fibonacci();
    }

    @Test
    public void testFibonacciMatcher() {
        Assert.assertEquals(f.fibonacci(10), 55);
    }

    @Test
    public void testRecursiveFebonacciMatcher() {
        Assert.assertEquals(f.fibonacci(13), 233);
    }

    @Test(expected = NullPointerException.class)
    public void testNullInput(){
        f.fibonacci(null);
    }
}
