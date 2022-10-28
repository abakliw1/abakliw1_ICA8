import org.junit.Test;
import static  org.junit.Assert.*;

public class UrinalTest {
    Urinals tester=new Urinals();
    @Test
    public void testoptStr(){
        assertEquals("===Akshat Bakliwal=== File must be chosen Test Case 1", "File",tester.optStr("File"));
        assertEquals("===Akshat Bakliwal=== Input must be chosen Test Case 2","Input",tester.optStr("Input"));
    }
    @Test
    public void testgoodString(){
        assertEquals("====Akshat Bakliwal===== should return -1 Test Case 3",-1,tester.goodString("1100"));
        assertEquals("====Akshat Bakliwal===== should return -1 Test Case 4",-1,tester.goodString("110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
    }
    @Test
    public void testnumuri(){
        assertEquals("===Akshat Bakliwal===should return 1",1,tester.numuri("10001"));
    }
}
