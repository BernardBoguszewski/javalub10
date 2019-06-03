package pl.sdacademy.demo;

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
    public void greet() {

        //when
        String name = "Adam";

        //then
        String result = greetings.greet(name);
        assertEquals("Witaj Adam", result);
    }

    @Test
    public void greetNull() {
        //when
        String name = null;

        //then
        String result = greetings.greet(name);
        assertEquals("Witaj mój przyjacielu", result);
    }

    @Test
    public void greetToUpperCase() {

        //when
        String name = "ADAM";

        //then
        String result = greetings.greet(name);
        assertEquals("WITAJ ADAM", result);

    }

    @Test
    public void greetTestWhenTwoNamesGiven() {
        //when
        String name = "Adam, Iza";

        //then
        String result = greetings.greet(name);
        assertEquals("Adam i Iza witajcie!", result);

    }

    @Test
    public void greetTestWithThreeNames() {
        //when
        String name = "Adam, Iza, Robert";

        //then
        String result = greetings.greet(name);
        assertEquals("Adam, Iza i Robert witajcie!", result);

    }

    @Test
    public void greetTestWithOneNameToUpperCase() {
        //when
        String name = "Adam, Iza, ROBERT";

        //then
        String result = greetings.greet(name);
        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);

    }

    @Test
    public void greetTestIfThereIsNumber() {
        //when
        String name = "Ada1m1";

        //then
        String result = greetings.greet(name);
        assertEquals("Z liczbami się nie witam.", result);

    }
}
