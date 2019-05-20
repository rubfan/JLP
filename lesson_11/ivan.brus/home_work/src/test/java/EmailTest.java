import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class EmailTest {

    @Test(expected = NullPointerException.class)
    public void testNullInput(){
        Email email = null;
        email.separateEmail();
    }

    @Test
    public void testEmailContaints(){
        Email email = new Email("brus.andreevich@gmail.com");
        Assert.assertThat(email.separateEmail(), CoreMatchers.containsString("[ at ]"));
        Assert.assertThat(email.separateEmail(), CoreMatchers.containsString("[ dot ]"));
    }

    @Test
    public void testDoesntContains(){
        Email email = new Email("brus.andreevich@gmail.com");
        Assert.assertThat(email.separateEmail(), Matchers.not(CoreMatchers.containsString("@")));
        Assert.assertThat(email.separateEmail(), Matchers.not(CoreMatchers.containsString(".")));
    }
}
