package pl.sdacademy.FizzBuzzWhizz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzWhizzTest {

    private FizzBuzzWhizz fizz;

    @Before
    public void setUp() {
        fizz = new FizzBuzzWhizz();
    }

    @Test
    public void testShouldCheckForNull() {
        String result = fizz.fizzBuzzWhizz(null);

        assertEquals("Nie dla null!", result);
    }

    @Test
    public void testShouldCheckIfDigitIsDivisibleByThree() {
        String result = fizz.fizzBuzzWhizz(9);

        assertEquals("Fizz", result);
    }

    @Test
    public void testShouldCheckIfDigitIsDivisibleByFive() {
        String result = fizz.fizzBuzzWhizz(10);

        assertEquals("Buzz", result);
    }

    @Test
    public void testShouldCheckIfDigitIsDivisibleByThreeAndFive() {
        String result = fizz.fizzBuzzWhizz(15);

        assertEquals("FizzBuzz", result);
    }

    @Test
    public void testShouldCheckIfDigitIsPrimeNumberExcludingThreeAndFive() {
        String result1 = fizz.fizzBuzzWhizz(11);
        String result2 = fizz.fizzBuzzWhizz(3);
        String result3 = fizz.fizzBuzzWhizz(5);

        assertEquals("Whizz", result1);
        assertEquals("FizzWhizz", result2);
        assertEquals("BuzzWhizz", result3);
    }
}
