package House;

import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import org.hamcrest.core.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestGarageImpl {
    Garage garage;

    @Before
    public void init(){
        garage = new GarageImpl();
    }

    @Test
    public void testSetGetSecurity(){
        garage.setSecurity(true);
       assertThat(garage.getStateOfSecurity(), Is.is(true));
    }
    @Test
    public void testSetGetOwner(){
        garage.setOwner("Vasya");
        assertThat(garage.getOwner(), Is.is("Vasya"));

    }






}
