    //2) Придумайте еще 2 каких-нибудь объекта из реальной жизни и реализуйте это с помощью класса.
    // Два:
    // Микроволновка

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestMicrowave {

    Microwave m = new Microwave();

    @Test
    public void testNotCookIfDoorIsOpen(){
        m.openTheDoor();
        Assert.assertFalse(m.cook());
    }

    @Test
    public void testNotCookIfOutOfFood(){
        m.closeTheDoor();
        Assert.assertFalse(m.cook());
    }

    @Test
    public void testCookIfAllOk(){
        m.closeTheDoor();
        m.insertFood();
        Assert.assertTrue(m.cook());
    }

    @Test
    public void testFoodInsertion(){
        m.insertFood();
        assertThat(m.whereIsTheFood(),equalTo("Inside"));
    }
}
