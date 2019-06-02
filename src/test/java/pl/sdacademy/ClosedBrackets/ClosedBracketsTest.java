package pl.sdacademy.ClosedBrackets;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClosedBracketsTest {

    @Test                                                       //zadanie nie dokonczone
    public void testShouldCheckIfAllBracketsAreClosed() {
        ClosedBrackets closedBrackets = new ClosedBrackets();

        boolean result1= closedBrackets.checkIfClosed("[]");
        boolean result2= closedBrackets.checkIfClosed("[][]");
        boolean result3= closedBrackets.checkIfClosed("[[][]]");
        boolean result4= closedBrackets.checkIfClosed("][");
        boolean result5= closedBrackets.checkIfClosed("][][");
//        boolean result6= closedBrackets.checkIfClosed("[]][[]");

        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
        assertFalse(result4);
        assertFalse(result5);
//        assertFalse(result6);

    }
}