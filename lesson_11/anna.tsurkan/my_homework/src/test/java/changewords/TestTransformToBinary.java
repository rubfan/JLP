package changewords;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTransformToBinary {
    TransformToBinary tb;

    @Before
    public void init(){
        tb = new TransformToBinary();
    }
    @Test
    public void testShouldConvertToBinary(){
        byte[] expec ={1,0,1};
        Assert.assertArrayEquals(tb.toBinary(5), expec);
    }
}
