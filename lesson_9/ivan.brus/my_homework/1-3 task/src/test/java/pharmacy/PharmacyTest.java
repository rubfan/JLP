package pharmacy;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class PharmacyTest {

    @Test
    public void testSellDrugsReturnType(){
        Assert.assertTrue(new Pharmacy(Name.BANDAGE).sellDrugs() instanceof String);
    }

    @Test
    public void testSellDrugsActualPrice(){
        Assert.assertEquals(new Pharmacy(Name.MUKALTIN).price,40);
    }

    @Test
    public void testSellDrugsActualDrugs(){
        Assert.assertThat(new Pharmacy(Name.CORVALOL).sellDrugs(), CoreMatchers.containsString("нервничай"));
    }
}
