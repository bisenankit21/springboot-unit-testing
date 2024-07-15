package com.luc2code.junitdemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.lang.management.MonitorInfo;
import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)

//@TestMethodOrder(MethodOrderer.DisplayName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {
    DemoUtils demoUtils;
    @BeforeEach
    void setBeforeEach(){
        demoUtils=new DemoUtils();
      //  System.out.println("@BeforeEac executes before the execution of of each method");
    }



    @Test
    @Order(0)
   @DisplayName("Equals and Not Equals")
    @Disabled("Dpnt run it")
    void testEqualsAndNotEquals(){
      //  System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6,demoUtils.add(2,4),"2+4 must be equals to ");
        assertNotEquals(6,demoUtils.add(1,9),"1+9 must noy be 6");

    }
    @Test
    @Order(2)
    @DisplayName("Nulll and Not Null")
    @EnabledOnOs(OS.MAC)
    void testNullAndNotNull(){
       // System.out.println("Running test: testNullAndNotNull");

        String str1=null;
        String str2="Ankit";
        assertNull(demoUtils.checkNull(str1),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object shuld not be Null");
    }

    @Test
    @DisplayName("Same and Not Same")
    @EnabledOnJre(JRE.JAVA_12)
    void testSameAndNotSame(){
        String str = "luv2code";
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"Object should refer to same object");
        assertNotSame(str,demoUtils.getAcademy(), "Object shold not refere to the same object");

    }

    @Test
    @DisplayName("true or false")
    @EnabledForJreRange(min = JRE.JAVA_12,max = JRE.JAVA_22)
    void testtrueOrFalse(){
        assertTrue(demoUtils.isGreater(3,1),"Fisrt number is greater than seceond number");
        assertFalse(demoUtils.isGreater(2,4),"First number is less than econd number");
    }

    @Test
    @DisplayName("Array Equals")
    void testArrayEquals(){
        String[] stringArray = {"A", "B", "C"};
        assertArrayEquals(stringArray,demoUtils.getFirstThreeLettersOfAlphabet(),"Array should be euqals");
    }


    @Test
    @DisplayName("List Equals")
    void testListEquals(){
        List<String> list= List.of("luv","2","code");
        assertIterableEquals(list,demoUtils.getAcademyInList(),"List should be euqla");
    }

    @Test
    @DisplayName("test lines match")
    void  testLineMatch(){
        List<String> list= List.of("luv","2","code");
        assertIterableEquals(list,demoUtils.getAcademyInList(),"Lines should be match");

    }
    @Test
    @DisplayName("Multiply")
    void testMultiply(){
        assertEquals(12,demoUtils.multiply(4,3),"4*3 must be 12");
    }
    @Test
    @DisplayName("Throws and Does not Throw")
    void testThrowAndDoesNotThrow(){
        assertThrows(Exception.class,()->{demoUtils.throwException(-1);},"Should throw an exception");
        assertDoesNotThrow(()->{demoUtils.throwException(2);},"Should not throw an exception");
    }

    @Test
    @Order(30)
    @DisplayName("Timeout")
    void testTimeout(){
        assertTimeoutPreemptively(Duration.ofSeconds(3),()->{demoUtils.checkTimeout();},"Method should execute in 3 second");

    }

/*

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
 */
}
