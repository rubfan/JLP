import org.hamcrest.Matcher;
import org.hamcrest.core.AllOf;
import org.hamcrest.core.AnyOf;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.hamcrest.CoreMatchers.*;
import java.lang.String;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.hamcrest.CoreMatchers.is;

public class prePreviousTest {

    int array[] = {2, 5, 1, 0, 99, 44, 12, 78};
    int number1 = 12;
    int number2 = 2;

    @Before
    public void before()
    {
        prePrevious.quickSort(array, 0, array.length - 1);
    }

    @Test
    public void doesPrePreviousRight()
    {
        Assert.assertThat(prePrevious.prePreviousElement(array, number1), Is.is(5));
        Assert.assertThat(prePrevious.prePreviousElement(array, number2), IsNot.not(5));
    }
}
