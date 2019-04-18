package arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.Matchers.contains;


public class TestNewClassForArray {

    NewClassForArray clArray;
    int[] arr = {1, 2,2};
    int[] arr2 = {0, 0, 0, 7};

    @Before
    public void testInit(){
        clArray = new NewClassForArray(arr.length, arr2.length);
    }
    @Test
    public void testNewLengthShouldBeTheLongest(){
        Assert.assertThat(clArray.getNewLength(), is(8));
    }
    @Test
    public void testNewLengthShouldNotBeTheShortest(){
        Assert.assertThat(clArray.getNewLength(), is(not(3)));
    }
    @Test
    public void testGetElementByIndex(){
        clArray.joinArrays(arr, arr2);
        Assert.assertThat(clArray.getElementByIndex(1), anyOf(is(1), is(2)));
    }
    @Test
    public void testNewArrayShouldNotBeNull(){
        Assert.assertThat(clArray, is(notNullValue()));
    }
    @Test
    public void testGetNumberOfArrays(){
        Assert.assertThat(clArray.getNumberOfArrays(), is(nullValue()));
    }
    @Test
    public void testThatCompareTwoSizes(){
        Assert.assertThat(arr2.length, greaterThan(arr.length));
    }

}
