package pl.sdacademy.demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mariusz Kowalczuk
 */
public class GreetingsTest {

    @Test
    public void greet() {
        //given
        Greetings greetings = new Greetings();
        String name = "Ala";

        //when
        String result = greetings.greet(name);

        //then
        Assert.assertEquals("Witaj Ala", result);
    }


    @Test
    public void greetNullSafe() {

        //given
        Greetings greetings = new Greetings();
        String name = null;

        // when
        String result = greetings.greet(name);

        //then
        Assert.assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    public void upperCaseNameGiven() {

        //given
        Greetings greetings = new Greetings();
        String name = "ADAM";

        // when
        String result = greetings.greet(name);

        //then
        Assert.assertEquals("WITAJ ADAM!", result);
    }

    @Test
    public void twoNamesGivenWithCommaSeparator() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza";

        // when
        String result = greetings.greet(name);

        //then
        Assert.assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    public void threeNamesGivenWithCommaSeparator() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,Robert";

        // when
        String result = greetings.greet(name);

        //then
        Assert.assertEquals("Adam, Iza i Robert, witajcie!", result);
    }

    @Test
    public void threeNamesGivenWithCommaSeparatorLastNameUppercase() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam, Iza, ROBERT";

        // when
        String result = greetings.greet(name);

        //then
        Assert.assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
    }

    @Test
    public void NameWithDigitsGiven() {
        //given
        Greetings greetings = new Greetings();
        String name = "3";

        // when
        String result = greetings.greet(name);

        //then
        Assert.assertEquals("Z liczbami się nie witam.", result);
    }

}