package com.luc2code.junitdemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {
    @Test
    void testEqualsAndNotEquals(){
        DemoUtils demoUtils=new DemoUtils();
        assertEquals(6,demoUtils.add(2,4),"2+4 must be equals to ");
        assertNotEquals(6,demoUtils.add(1,9),"1+9 must noy be 6");

    }
    @Test
    void testNullAndNotNull(){
        DemoUtils demoUtils=new DemoUtils();
        String str1=null;
        String str2="Ankit";
        assertNull(demoUtils.checkNull(str1),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object shuld not be Null");
    }
}
