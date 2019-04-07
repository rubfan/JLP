package lighter;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TorchTest {

    private Torch torch;

    @Before
    public void init(){
        torch = new Torch();
    }

    @Test
    public void testWhiteLightNullInput(){
        torch.whiteLight(null);
    }

    @Test
    public void testWhiteLightEnoughBatteryes(){
        torch.whiteLight(0);
    }

    @Test
    public void testWhiteLightOutput(){
        Assert.assertThat(torch.whiteLight(1), CoreMatchers.containsString("white"));
    }

    @Test
    public void testRedLightNullInput(){
        torch.redLight(null);
    }

    @Test
    public void testRedLightEnoughBatteryes(){
        torch.redLight(1);
    }

    @Test
    public void testRedLightOutput(){
        Assert.assertThat(torch.redLight(2), CoreMatchers.containsString("red"));
    }

    @Test
    public void testBlinkNullInput(){
        torch.blink(null);
    }

    @Test
    public void testBlinkEnoughBatteryes(){
        torch.blink(1);
    }

    @Test
    public void testBlinkOutput(){
        Assert.assertThat(torch.blink(3), CoreMatchers.containsString("blinking"));
    }
}
