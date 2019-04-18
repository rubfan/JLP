import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.hamcrest.text.IsEqualIgnoringCase;
import org.junit.Test;

import java.util.regex.PatternSyntaxException;

import static org.junit.Assert.*;

public class EmailTest {

    @Test
    public void TestIsTrueChangedSymbol() throws PatternSyntaxException {
        Email email = new Email();
        String mail = "irina@gmail.com";
        Email.changeSymbol(mail);
        CoreMatchers.is("irina[at]gmail[dot]com".equalsIgnoreCase(mail));
    }
}