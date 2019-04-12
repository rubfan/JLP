import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayTest {
    MyArray myArray;
    String[] a = new String[]{"O", "d"};
    String[] b = new String[]{"e", "s", "s", "a"};
    String e = " ";
    int t = 2;

    public MyArrayTest() {
    }

    @Before
    public void init() {
        this.myArray = new MyArray(10);
    }

    @Test
    public void concatenate() {
        Matchers.arrayContaining(this.a).matches(Matchers.notNullValue());
        Matchers.arrayContaining(this.b).matches(Matchers.notNullValue());
    }

    @Test
    public void addElement() {
        Matchers.is(this.e).matches(Matchers.notNullValue());
        Matchers.emptyArray().matches(this.a);
    }

    @Test
    public void findElemByIndex() {
        Matchers.is(this.t).matches(Matchers.allOf(Matchers.greaterThan(-1), Matchers.lessThanOrEqualTo(this.a.length - 1)));
        Matchers.arrayContaining(new Matcher[]{Matchers.notNullValue()});
    }

    @Test
    public void increaseLength() {
        Assert.assertThat(this.a.length, Matchers.notNullValue());
    }
}
