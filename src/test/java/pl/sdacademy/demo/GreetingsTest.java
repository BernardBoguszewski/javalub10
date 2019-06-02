package pl.sdacademy.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Mariusz Kowalczuk
 */
public class GreetingsTest {

    Greetings greetings;

    @Before
    public void init() {
        greetings = new Greetings();
    }

    @Test
    public void shouldReturnGreetinsForGivenNAme() {
        //given

        String name = "Ala";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj Ala", result);
    }


    @Test
    public void shouldReturnStringAfterNullGIvenAsName() {

        //given
        String name = null;

        // when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    public void shouldReturnUpperCaseGreetingsWhenApperCaseNameGiven() {

        //given
        Greetings greetings = new Greetings();
        String name = "ADAM";

        // when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ ADAM!", result);
    }

    @Test
    public void shouldReturnGreetingsWithTwoNamesWhenTwoNamesGiven() {
        //given
        String name = "Adam,Iza";

        // when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    public void shuldReturnSpecialStringForThreeNamesGiven() {
        //given
        String name = "Adam,Iza,Robert";

        // when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }

    @Test
    public void shuldReturnSpecialStringWhenAnyNameWasGIvenUppercase() {
        //given
        String name = "Adam, Iza, ROBERT";

        // when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
    }

    @Test
    public void shouldReturnSpecialStringWhenGivenNameIncludesDigits() {
        //given
        String name = "3";

        // when
        String result = greetings.greet(name);

        //then
        assertEquals("Z liczbami się nie witam.", result);
    }


    @Test
    public void shouldReturnTrueWhenAllUppercaseCettersInGivenString() {
        //given
        String name = "ABC";

        // when

        Boolean result = greetings.isNameAllUppercase(name);

        //then
        assertTrue(result);
    }
}