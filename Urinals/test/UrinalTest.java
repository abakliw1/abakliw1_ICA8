import org.junit.Test;
import static  org.junit.Assert.*;

public class UrinalTest {
    @Test
    public void testcheckUrinal(){
        Urinals tester=new Urinals();
        assertEquals("===Akshat Bakliwal===10001 must be 1", 1,tester.checkUrinal("10001"));
    }
}
