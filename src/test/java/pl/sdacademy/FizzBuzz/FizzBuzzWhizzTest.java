package pl.sdacademy.FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzWhizzTest {

    @Test
    public void testShouldCheckIfNull() {
        FizzBuzzWhizz fizzNull = new FizzBuzzWhizz();

        String result = fizzNull.fizzBuzzWhizz(null);

        assertEquals("Nie dla null!", result);

    }

    @Test
    public void testIsDivisibleByThree() {
        FizzBuzzWhizz fizz = new FizzBuzzWhizz();

        String result = fizz.fizzBuzzWhizz(9);

        assertEquals("Fizz", result);

    }

    @Test
    public void tetsisDivisibleByFive(){
        FizzBuzzWhizz fizz = new FizzBuzzWhizz();

        String result = fizz.fizzBuzzWhizz(5);

        assertEquals("BuzzWhizz", result);

    }

    @Test
    public void testIsDivisibleByThreeAndFive(){
        FizzBuzzWhizz fizz = new FizzBuzzWhizz();

        String result = fizz.fizzBuzzWhizz(15);

        assertEquals("FizzBuzz", result);

    }

    @Test
    public void testIsDigitIsPrimeNumberExcludingThreeAndFive(){
        FizzBuzzWhizz fizz = new FizzBuzzWhizz();

        String result1 = fizz.fizzBuzzWhizz(7);
        String result2 = fizz.fizzBuzzWhizz(3);
        String result3 = fizz.fizzBuzzWhizz(5);

        assertEquals("Whizz", result1);
        assertEquals("FizzWhizz", result2);
        assertEquals("BuzzWhizz", result3);
    }
}