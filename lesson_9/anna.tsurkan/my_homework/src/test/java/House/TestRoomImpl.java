package House;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import org.hamcrest.core.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestRoomImpl {

    Room room;
    @Before
    public void init(){
        room = new RoomImpl();
    }
   @Test
    public void testcleanTheRoom(){
        room.cleanTheRoom();
        assertThat(room.checkTheCleaning(), Is.is(true));
    }
     @Test
    public void testGetSetLight(){
        room.setTheLight(1);
        assertThat(room.getTheLight(), Is.is(1));
    }
     @Test
    public void testGetBook(){
        assertThat(room.getBook(), Is.is(Book.SHERLOCK_HOLMS));
    }
}
