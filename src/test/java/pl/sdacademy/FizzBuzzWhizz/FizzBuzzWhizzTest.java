package pl.sdacademy.FizzBuzzWhizz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzWhizzTest {

    @Test
    public void testShouldCheckForNull() {
        FizzBuzzWhizz fizz = new FizzBuzzWhizz();

        String result = fizz.fizzBuzzWhizz(null);

        assertEquals("Nie dla null!", result);
    }
    
    @Test  
    public void digitIsDivisibleByThree(){
        FizzBuzzWhizz fizz = new FizzBuzzWhizz();

        String result = fizz.fizzBuzzWhizz(9);

        assertEquals("Fizz", result);
    }

    @Test
    public void digitIsDivisibleByFive(){
     FizzBuzzWhizz fizz = new FizzBuzzWhizz();

     String result = fizz.fizzBuzzWhizz(10);

     assertEquals("Buzz", result);
    }
    
    @Test  
    public void digitIsDivisibleByThreeAndFive(){
        FizzBuzzWhizz fizz = new FizzBuzzWhizz();

        String result = fizz.fizzBuzzWhizz(15);

        assertEquals("FizzBuzz", result);
    }
    
    @Test  
    public void digitIsPrimeNumberExcludingThreeAndFive(){
        FizzBuzzWhizz fizz = new FizzBuzzWhizz();

        String result1 = fizz.fizzBuzzWhizz(11);
        String result2 = fizz.fizzBuzzWhizz(3);
        String result3 = fizz.fizzBuzzWhizz(5);

        assertEquals("Whizz",result1);
        assertEquals("FizzWhizz",result2);
        assertEquals("BuzzWhizz",result3);
    }
}
