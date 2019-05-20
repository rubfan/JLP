import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.IsNull.nullValue;

public class AddArrayTest {
    AddArray arr;

    @Before
    public void init(){
        arr = new AddArray(10);
    }

    @After
    public void dispose(){
        System.gc();
    }

    @Test
    public void testSearchForNotExistingElement(){
        Assert.assertThat(arr.search(1), Is.is(nullValue()));
    }

    @Test
    public void testArrayOverloading(){
        Integer[] arr1 = {2,8,15,12,14,0,5,6,2,16,12,15,13,0};
        arr.add(arr1);
        Assert.assertThat(arr.search(12), IsNot.not(nullValue()));
    }

    @Test
    public void testChangingArrayLangth(){
        int counter = 0;
        Integer[] arr1 = {2,8,15,12,14,0,5,6,2,16,12,15,13,0};
        arr.add(arr1);
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == null){
                counter++;
            }
        }
        Assert.assertThat(arr.length - counter, greaterThan(0) );
    }

    @Test
    public void testArrayType(){
        Integer[] arr1 = {2,8,15,12,14,0,5,6,2,16};
        arr.add(arr1);
        Assert.assertThat(arr.add(arr1), allOf(Matchers.<Integer[]>instanceOf(Object.class)));
    }

}
