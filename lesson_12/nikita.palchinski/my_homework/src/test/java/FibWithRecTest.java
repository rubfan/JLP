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

public class FibWithRecTest {

    @Test
    public void doesFibWorkRight()
    {
        Assert.assertThat(FibWithRec.fibr(9), Is.is(34));
        Assert.assertThat(FibWithRec.fibr(9), IsNot.not(35));
    }

    @Test
    public void fibComparator()
    {
        Assert.assertThat(FibWithRec.fibr(9), Is.is(FibWithoutRec.fib(9)));
    }
}
