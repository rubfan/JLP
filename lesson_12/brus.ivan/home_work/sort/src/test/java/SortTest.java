import org.junit.Assert;
import org.junit.Test;

public class SortTest {

    Sort sort = new Sort();
    int[] arr = {1,3,4,7,0,6,2,7,3,1,9,4};

    @Test
    public void testSortReturnValue(){
        Assert.assertEquals(sort.quickSort(arr, 0, arr.length-1),7);
        Assert.assertEquals(sort.binarySearch(arr, 7, 0, arr.length-1),10);
    }


}
