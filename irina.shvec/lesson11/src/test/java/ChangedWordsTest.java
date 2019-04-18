import org.hamcrest.*;
import org.hamcrest.core.SubstringMatcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

public class ChangedWordsTest {
    ChangedWords changedWords;

    @Before
    public void init(){
      changedWords = new ChangedWords();
    }

    @Test
    public void changingWordTest() {
        String a = "creation";
        ChangedWords.changeWord(a);
        Assert.assertFalse(a.equalsIgnoreCase("c6n"));
    }

    @Test
    public void splitTest() throws PatternSyntaxException {
        String a = "New school";
        String delimiter = " ";
        CoreMatchers.is(ChangedWords.split(a,delimiter)).equals(a.split(delimiter));
    }
}