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

public class BinaryTest {

    @Before
    public void init() {
        Binary.bin(3);
    }

    @Test
    public void isBinaryFormRight1() {
        Assert.assertThat(Binary.binary, Is.is("11"));
    }

    @After
    public void after() {
    }
}
