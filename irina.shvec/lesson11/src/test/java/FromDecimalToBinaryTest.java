import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FromDecimalToBinaryTest {
    FromDecimalToBinary f;

    @Before
    public void init(){
        f = new FromDecimalToBinary();
    }

    @Test
    public void convert10to2() {
        Assert.assertEquals(FromDecimalToBinary.Convert10to2(36,""),Integer.toBinaryString(36));
    }
}