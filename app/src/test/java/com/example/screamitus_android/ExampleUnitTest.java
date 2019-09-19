package com.example.screamitus_android;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void testNumberOfPatientsWithZeroDay() {
        Infection service = new Infection();
        int actualResult = service.calculateTotalInfected(0);
        int expectedResult = -1;
        assertEquals(actualResult, expectedResult);
    }
     @Test
    public void testNumberOfPatientsWithMultiplicityFive() {
        Infection service = new Infection();
        int actualResult = service.calculateTotalInfected(6);
        int expectedResult = 6*5;
        assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNumberOfPatientsWithMultiplicityFiv() {
        Infection service = new Infection();
        int actualResult = service.calculateTotalInfected(8);
        int expectedResult = 8*5;
        assertEquals(actualResult, expectedResult);
    }
}
