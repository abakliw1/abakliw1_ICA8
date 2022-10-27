import org.junit.Test;
import static  org.junit.Assert.*;

public class UrinalTest {
    @Test
    public void testoptStr(){
        Urinals tester=new Urinals();
        assertEquals("===Akshat Bakliwal=== File must be chosen", "File",tester.optStr("File"));

    }
}
