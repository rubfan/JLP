
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FluffyToyTest {
    FluffyToy fluffyToy;

    @Before
    public void init() {
        fluffyToy = new FluffyToy("Bunny","White");
    }

    @Test
    public void getBottomNotNullTest(){
        CoreMatchers.notNullValue().matches(fluffyToy.bottom);
    }

    @Test
    public void setInteractivityConditionTest() {
        Assert.assertTrue(fluffyToy.bottom > 0);
    }

    @Test
    public void pushBottomConditionTest() {
        Assert.assertTrue(fluffyToy.setInteractivity(true));
    }
}