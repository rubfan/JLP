import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void testIfPalindrome(){
        Assert.assertEquals(new Palindrome("wewew").findPalindrome()
                .replaceAll("[^0-9]", "").replaceAll(" ",""), "1");
    }
}