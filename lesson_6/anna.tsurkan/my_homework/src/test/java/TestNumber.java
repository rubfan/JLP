import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNumber {
    Number number;

    @Before
    public void init(){
        number = new Number();
   }
     @Test
   public void testConvertNumberToBinaryRepresent(){
         junit.framework.Assert.assertEquals( "1", number.NumberToBinary(1));
   }


}
