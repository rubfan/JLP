import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class prePreviousTest {

    int array[] = {2, 5, 1, 0, 99, 44, 12, 78};
    int number1 = 12;
    int number2 = 2;

    @Before
    public void before() {
        prePrevious.quickSort(array, 0, array.length - 1);
    }

    @Test
    public void doesPrePreviousRight() {
        assertThat(prePrevious.prePreviousElement(array, number1), is(5));
        assertThat(prePrevious.prePreviousElement(array, number2), not(5));
    }
}

