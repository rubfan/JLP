package palindrome;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPalindrome {
    Palindrome palindrome;

    @Before
    public void init(){
        palindrome = new Palindrome();
    }

    @Test
    public void testShouldDefinePalindrome(){
        Assert.assertThat(palindrome.numberOfPalindromes("anna, cat, hello, anna"), Is.is(2));
    }
}
