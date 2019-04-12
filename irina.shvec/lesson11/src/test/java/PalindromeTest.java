import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void whenPalindrome__thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }
}