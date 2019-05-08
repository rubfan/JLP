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

public class GmailTest {

    String gmail;

    @Before
    public void init() {
        gmail = "testgmail@gmail.com";
    }

    @Test
    public void doesCheckerWorkRight() {
        Assert.assertThat(Gmail.checker(gmail), IsNot.not(0));
        Assert.assertThat(Gmail.checker(gmail), Is.is(1));
    }

    @Test
    public void doesChangerWorkRight() {
        Assert.assertThat(Gmail.changer(gmail), Is.is("testgmail[at]gmail[dot]com"));
    }

    @After
    public void after() {
    }
}
