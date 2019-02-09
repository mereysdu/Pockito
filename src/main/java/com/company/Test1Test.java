package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class Test1Test extends Test1 {
        @Test
    public void testMoodAnalysis() throws Exception{
            Test1 t = new Test1();

            String tekst = "abc";
            assertEquals(tekst,"abc");
        }



     public int sum(int a, int b){
            return a+b;
     }

    @Test
    public void sumTest() throws Exception{
        assertNotNull(sum(1,3));
    }

}