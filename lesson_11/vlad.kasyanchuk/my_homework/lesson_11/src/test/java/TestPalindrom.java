import org.junit.Assert;
import org.junit.Test;

public class TestPalindrom {
    Palindrom pl = new Palindrom();

    @Test
    public void testAmountOfPalindromes(){
        Assert.assertEquals(pl.amountOfPalindromes("deleveled, evitative, cat, dog, deified"), 3);
    }
}
