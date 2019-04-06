import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;


public class TestHomeWork6 {
    HomeWork6 homeWork6;

    @Before
    public void init(){
        homeWork6 = new HomeWork6();
    }

    @Test
    public void testAddingNumbers(){
        Assert.assertThat(homeWork6.addingNumbers(111111), is(true));
    }

    @Test
    public void testAdditionEvenAndOddMassCell(){
        int[] mass = new int[5];
        for(int i =0; i < 5; i++) {
            mass[i] = i;
        }
        Assert.assertThat(homeWork6.additionEvenAndOddMassCell(mass), is(new int[]{4,6}));
    }

    @Test
    public void testGetIndex(){
        Assert.assertThat(homeWork6.getIndex(12), is(2));
    }

    @Test
    public void testDigitalRoot(){
        Assert.assertThat(homeWork6.digitalRoot(555555,6), is(30));
    }
}
