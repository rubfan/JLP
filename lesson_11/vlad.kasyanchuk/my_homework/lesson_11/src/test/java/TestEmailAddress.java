import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.core.Is;

public class TestEmailAddress {
    EmailAddress ea = new EmailAddress("vladkasyanchuk@gmail.com");

    @Test
    public void testChangeSymbols (){
        Assert.assertThat(ea.changeSymbols(), Is.is("vladkasyanchuk[ at ]gmail[ dot ]com"));
    }

}
