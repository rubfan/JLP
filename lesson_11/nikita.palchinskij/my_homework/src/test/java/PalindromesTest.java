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

public class PalindromesTest {

    String sentence;

    @Before
    public void init() {
        sentence = "rerer , dad, gkhfb   , gereg, mom, river";
    }

    @Test
    public void doesArrayerWorkRight() {
        Assert.assertThat(Palindromes.toStringArray(sentence)[0], Is.is("rerer"));
    }

    @Test
    public void doesReverserWorkRight() {
        Assert.assertThat(Palindromes.toStringArray(sentence)[3], Is.is(Palindromes.toStringArray(sentence)[3]));
    }

    @After
    public void after() {
    }
}
