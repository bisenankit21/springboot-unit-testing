package com.luc2code.junitdemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {
    DemoUtils demoUtils;
    @BeforeEach
    void setBeforeEach(){
        demoUtils=new DemoUtils();
        System.out.println("@BeforeEac executes before the execution of of each method");
    }

    @AfterEach
    void tearDownAfterEach(){
        System.out.println("AFter each execute after each emthod");
        System.out.println();
    }
    @BeforeAll
    static void setUpBeforeachClass(){
        System.out.println("@BeforeAll executes only once before all test emthod in the class");
    }
    @AfterAll
    static void setUpAftereachClass(){
        System.out.println("@AfterAll executes only once after  all test emthod in the class");
    }

    @Test
    void testEqualsAndNotEquals(){
        System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6,demoUtils.add(2,4),"2+4 must be equals to ");
        assertNotEquals(6,demoUtils.add(1,9),"1+9 must noy be 6");

    }
    @Test
    void testNullAndNotNull(){
        System.out.println("Running test: testNullAndNotNull");

        String str1=null;
        String str2="Ankit";
        assertNull(demoUtils.checkNull(str1),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object shuld not be Null");
    }
}
