import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
public class MyLinkedListTest {

    MyLinkedList linkedl = new MyLinkedList();

    @Before
    public void init() {
        linkedl = new MyLinkedList();
        linkedl.add("aaa");
        linkedl.add("bbbb");
    }

    @Test
    public void testAdd() {

        linkedl.add("added");
        assertThat(linkedl.getLast(), is("added"));
    }

    @Test
    public void testAddIdx() {

        linkedl.add(1, "execution");
        assertThat(linkedl.iSearch(1), is("execution"));
    }

    @Test
    public void testRemove() {
        linkedl.remove();
        assertThat(linkedl.getLast(), is("aaa"));
        assertThat(linkedl.getSize(), is(1));
    }

    @Test
    public void testRemoveIdx() {
        linkedl.remove(0);
        assertThat(linkedl.getSize(), is(1));
        assertThat(linkedl.iSearch(0), is("bbbb"));
    }

    @Test
    public void testTransform(){
        String[] array = linkedl.transform();
        assertThat(array[1], is("bbbb"));
    }

    @Test
    public void testISearch(){
        assertThat(linkedl.iSearch(1), is("bbbb"));
    }

    @Test
    public void testVSearch(){
        assertThat(linkedl.vSearch("bbbb"), is(1));
    }

    @Test
    public void testGetSize(){
        assertThat(linkedl.getSize(), is(2));
    }

    @Test
    public void testGetLast() {
        linkedl.add("lksfjg");
        assertThat(linkedl.vSearch(linkedl.getLast()), is(2));
    }


}