import org.junit.Test;

import java.io.IOException;

import static  org.junit.Assert.*;

public class UrinalTest {
    Urinals tester=new Urinals();

    @Test
    public void testgoodString(){
        assertEquals("====Akshat Bakliwal===== should return -1 Test Case 1",-1,tester.goodString("1100"));
        assertEquals("====Akshat Bakliwal===== should return -1 Test Case 2",-1,tester.goodString("110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
    }
    @Test
    public void testnumuri(){
        assertEquals("===Akshat Bakliwal===should return 1 Test Case 3",1,tester.numuri("10001"));
        assertEquals("===Akshat Bakliwal===should return 0 Test Case 4",0,tester.numuri("1001"));
        assertEquals("===Akshat Bakliwal===should return 3 Test Case 5",3,tester.numuri("00000"));
        assertEquals("===Akshat Bakliwal===should return 2 Test Case 6",2,tester.numuri("0000"));
        assertEquals("===Akshat Bakliwal===should return 1 Test Case 7",1,tester.numuri("01000"));
    }
    @Test
    public void testoptFile() throws Exception{
        assertEquals("===Akshat Bakliwal===should return the array Test Case 8"," 1 0 3 2 1",tester.optFile("src/urinal.dat"));
        assertEquals("===Akshat Bakliwal===should return throw exception Test Case 9",null,tester.optFile("src/uri.dat"));
        assertEquals("===Akshat Bakliwal===should return throw exception Test Case 10",null,tester.optFile("src/nuri.dat"));
    }

}
