import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.number.OrderingComparison.greaterThan;


public class TestArrays {
    Arrays arrays = new Arrays(3);
    int[] array = {1, 2, 3};

    @Before
    public void init() {
        arrays.firstArray[0] = 1;
        arrays.firstArray[1] = 1;
        arrays.firstArray[2] = 1;
    }

    @Test
    public void testAddArray() {
        arrays.addArray(array);
        Assert.assertThat(arrays.lenght(), is(6));
    }

    @Test
    public void testAddValue() {
        arrays.addValue(4);
        Assert.assertThat(arrays.firstArray[3], anyOf(is(1), is(4)));
    }

    @Test
    public void testLenght() {
        Assert.assertThat(arrays, is(notNullValue()));
        Assert.assertThat(arrays.lenght(), is(not(3)));
    }

    @Test
    public void testIndexOf() {
        Assert.assertThat(arrays.indexOf(1), greaterThan(0));
    }


}
