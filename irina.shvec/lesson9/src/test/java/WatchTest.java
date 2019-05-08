import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WatchTest {
    Watch watch;

    @Before
    public void init(){
        watch = new Watch("Sony","White", Lightning.WHITE);
    }

    @Test
    public void setTimeNotNullTest() {
        CoreMatchers.notNullValue().matches(Watch.time);
    }
}