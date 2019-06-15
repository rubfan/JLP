import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class FibWithoutRecTest {

    @Test
    public void doesFibWorkRight() {
        assertThat(FibWithoutRec.fib(9), is(34));
        assertThat(FibWithoutRec.fib(9), not(35));
        assertThat(FibWithoutRec.fib(0), is(0));
    }
}
