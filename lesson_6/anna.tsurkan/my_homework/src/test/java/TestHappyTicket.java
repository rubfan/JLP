import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestHappyTicket {
    HappyTicket ht;

    @Before
    public void init(){
        ht = new HappyTicket();
    }


    @Test
    public void testDefineIsLuckyTicketOrNot(){
        Assert.assertEquals(true,ht.defineLuckyTicket(5,5) );

    }
}
