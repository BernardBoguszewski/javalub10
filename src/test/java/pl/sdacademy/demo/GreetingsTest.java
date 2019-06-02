package pl.sdacademy.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingsTest {

    @Test
    public void greet() {
        Greetings greetings = new Greetings();

        String name = "Ala";
        String result = greetings.greet(name);

        assertEquals("Witaj, Ala!", result);
    }

    @Test
    public void greetNullException() {
        Greetings greetings = new Greetings();

        String name = null;
        String result = greetings.greet(name);

        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    public void greetWithUpperCase() {
        Greetings greetings = new Greetings();

        String name = "ADAM";
        String result = greetings.greet(name);

        assertEquals("WITAJ, ADAM!", result);
    }

    @Test
    public void greetTwoPersons() {
        Greetings greetings = new Greetings();

        String name = "Adam,Iza";
        String result = greetings.greet(name);

        assertEquals("Adam i Iza, Witajcie!", result);
    }

    @Test
    public void greetThreePersons() {
        Greetings greetings = new Greetings();

        String name = "Adam,Iza,Robert";
        String result = greetings.greet(name);

        assertEquals("Adam, Iza i Robert, Witajcie!", result);
    }

    @Test
    public void greetThreePersonsOneWithUpeerCase() {

        Greetings greetings = new Greetings();

        String input = "Adam, Iza, ROBERT";
        String result = greetings.greet(input);

        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
    }
}