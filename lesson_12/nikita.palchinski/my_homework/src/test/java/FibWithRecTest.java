import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class FibWithRecTest {

    @Test
    public void doesFibWorkRight() {
        assertThat(FibWithRec.fibr(9), is(34));
        assertThat(FibWithRec.fibr(9), not(35));
    }

    @Test
    public void fibComparator() {
        assertThat(FibWithRec.fibr(9), is(FibWithoutRec.fib(9)));
    }
}

