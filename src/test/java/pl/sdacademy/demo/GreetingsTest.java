package pl.sdacademy.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingsTest {

    @Test
    public void greet() {

        //given
        Greetings greetings = new Greetings();


        //when
        String name = "Adam";

        //then
        String result = greetings.greet(name);
        assertEquals("Witaj Adam", result);
    }

    @Test
    public void greetNull() {
        //given
        Greetings greetings = new Greetings();

        //when
        String name = null;

        //then
        String result = greetings.greet(name);
        assertEquals("Witaj mój przyjacielu", result);
    }

    @Test
    public void greetToUpperCase() {
        //given
        Greetings greetings = new Greetings();

        //when
        String name = "ADAM";

        //then
        String result = greetings.greet(name);
        assertEquals("WITAJ ADAM", result);

    }

    @Test
    public void greetTestWhenTwoNamesGiven() {
        //given
        Greetings greetings = new Greetings();

        //when
        String name = "Adam, Iza";

        //then
        String result = greetings.greet(name);
        assertEquals("Adam i Iza witajcie!", result);

    }

    @Test
    public void greetTestWithThreeNames() {
        //given
        Greetings greetings = new Greetings();

        //when
        String name = "Adam, Iza, Robert";

        //then
        String result = greetings.greet(name);
        assertEquals("Adam, Iza i Robert witajcie!", result);

    }

    @Test
    public void greetTestWithOneNameToUpperCase() {
        //given
        Greetings greetings = new Greetings();

        //when
        String name = "Adam, Iza, ROBERT";

        //then
        String result = greetings.greet(name);
        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);

    }

    @Test
    public void greetTestIfThereIsNumber() {
        //given
        Greetings greetings = new Greetings();

        //when
        String name = "Ada1m1";

        //then
        String result = greetings.greet(name);
        assertEquals("Z liczbami się nie witam.", result);

    }
}
