package com.ankit.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {


    @Test
    @DisplayName("Divisible by Three")
    @Order(1)
    void testDivisibleByThree(){
      String expected = "Fizz";
      assertEquals(expected,FizzBuzz.compute(3),"Should return Fizz");
    }

    @Test
    @DisplayName("Divisible by Three")
    @Order(2)
    void testDivisibleByFive(){
        String expected = "Buzz";
        assertEquals(expected,FizzBuzz.compute(5),"Should return Buzz");
    }

    @Test
    @DisplayName("Divisible by Three and Five")
    @Order(3)
    void testDivisibleByThreeAndFive(){
        String expected = "FizzBuzz";
        assertEquals(expected,FizzBuzz.compute(15),"Should return FizzBuzz");
    }

    @Test
    @DisplayName("Not Divisible by Three or Five")
    @Order(4)
    void testNotDivisibleByThreeAndFive(){
        String expected = "1";
        assertEquals(expected,FizzBuzz.compute(1),"Should return 1");
    }

    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @DisplayName("testing with small data files")
    @Order(5)
    void testSmallDataFile(int value, String expected){
        assertEquals(expected,FizzBuzz.compute(value));
    }

    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @DisplayName("testing with small data files")
    @Order(6)
    void testMediumDataFile(int value, String expected){
        assertEquals(expected,FizzBuzz.compute(value));
    }

    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @DisplayName("testing with small data files")
    @Order(7)
    void testLargeDataFile(int value, String expected){
        assertEquals(expected,FizzBuzz.compute(value));
    }



}
