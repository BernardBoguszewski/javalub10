package pl.sdacademy.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzWhizzTest {

    private FizzBuzzWhizz fizzBuzzWhizz;

    @Before
    public void setUp() {
        fizzBuzzWhizz = new FizzBuzzWhizz();
    }

    @Test
    public void shouldPrintMessageWhenNullIsGiven() {
        Integer integer = null;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(integer);

        assertEquals("Nie dla null", result);
    }

    @Test
    public void shouldPrintMessageFizzWhenNumberIsDivideByThree() {
        Integer integer = 9;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(integer);

        assertEquals("Fizz", result);
    }

    @Test
    public void shouldPrintMessageBuzzWhenNumberIsDivideByFive() {
        Integer integer = 25;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(integer);

        assertEquals("Buzz", result);
    }

    @Test
    public void shouldPrintMessageFizzBuzzWhenNumberIsDivideByThreeAndFive() {
        Integer integer = 15;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(integer);

        assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldPrintMessageWhizzWhenNumberIsPrime() {
        Integer integer = 47;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(integer);

        assertEquals("Whizz", result);
    }

    @Test
    public void shouldPrintMessageWhizzWhenThreeIsGiven() {
        Integer integer = 3;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(integer);

        assertEquals("FizzWhizz", result);
    }

    @Test
    public void shouldPrintMessageWhizzWhenFiveIsGiven() {
        Integer integer = 5;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(integer);

        assertEquals("BuzzWhizz", result);
    }
}