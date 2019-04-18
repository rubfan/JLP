package changewords;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestChanges {
    Changes changes;

    @Before
    public void init(){
        changes = new Changes();
    }
    @Test
    public void testShouldChangeEmail(){
        Assert.assertThat(changes.changeEmail("anna@.com"), Is.is("anna[at][dot]com"));
    }
    @Test
    public void testShouldCutWord(){
        Assert.assertThat(changes.cutWord("anna"), Is.is(" a2a"));
    }
    @Test
    public void testShouldCutEveryWordFromString(){
        Assert.assertThat(changes.cutEveryWordFromString("hello my darling friend"), Is.is("[ h3o, my,  d5g,  f4d]"));
    }
}
