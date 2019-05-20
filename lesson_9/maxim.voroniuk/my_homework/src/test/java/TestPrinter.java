import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class TestPrinter {



    @Test
    public void testNotPrintIfInkOver(){
        Printer p = new Printer(10, false);
        p.addBuffer("0123456789");
        p.addPaper();
        p.print();
        p.addBuffer("1");
        assertThat(p.print(), equalTo(false));
    }
    @Test
    public void testNotPrintIfNoPaper(){
        Printer p = new Printer(10, false);
        assertThat(p.print(), equalTo(false));
    }

}
