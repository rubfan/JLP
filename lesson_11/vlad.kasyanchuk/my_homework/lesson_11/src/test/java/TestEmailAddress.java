import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.core.Is;

public class TestEmailAddress {
    EmailAddress ea = new EmailAddress();

    @Test
    public void testChangeSymbols() {
        Assert.assertThat(ea.changeSymbols("vladkasyanchuk@gmail.com"), Is.is("vladkasyanchuk[ at ]gmail[ dot ]com"));
    }

    @Test
    public void testReduction() {
        Assert.assertThat(ea.reduction("String"), Is.is("S4g"));
        Assert.assertThat(ea.reduction("vlad"), Is.is("vlad"));
    }

}
