package pl.sdacademy.Greetings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingsTest {

    private Greetings greetings;

    @Before
    public void setUp() {
        greetings = new Greetings();
    }

    @Test
    public void testShouldGreetWithName() {
        String name = "Ala";

        String result = greetings.greet(name);

        assertEquals("Witaj Ala", result);
    }

    @Test
    public void testShouldGreetWithFriendWhenNullAsParameter() {
        String name = null;

        String result = greetings.greet(name);


        assertEquals("Witaj mój przyjacielu", result);
    }

    @Test
    public void testShouldGreetWithCapitalLetters() {
        String name = "ADAM";

        String result = greetings.greet(name);

        assertEquals("WITAJ ADAM", result);
    }

    @Test
    public void testShouldGreetWhenTwoNamesGiven() {
        String name = "Adam,Iza";

        String result = greetings.greet(name);

        assertEquals("Adam i Iza witajcie!", result);
    }

    @Test
    public void testShouldGreetWhenThreeNamesGiven() {
        String name = "Adam,Iza,Robert";

        String result = greetings.greet(name);

        assertEquals("Adam, Iza i Robert witajcie!", result);
    }

    @Test
    public void testShouldGreetWhenOneOfThreeNamesIsInCapitalLetters() {
        String name = "Adam,Iza,ROBERT";

        String result = greetings.greet(name);

        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
    }

    @Test
    public void testShouldFindNumbersInNameVariable() {
        String name = "Adam1";

        String result = greetings.greet(name);

        assertEquals("Z liczbami się nie witam.", result);
    }
}