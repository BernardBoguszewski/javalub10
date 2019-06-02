package pl.sdacademy.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by A.Wójcik on 02 06 2019.
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
        assertEquals("Witaj, Ala!", result);
    }

    @Test
    public void greetWithNull() {

        //given
        Greetings greetings = new Greetings();
        String name = null;

        //when
        String result = greetings.greet(name);


        //then
        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    public void greetWithUpperCase() {

        //given
        Greetings greetings = new Greetings();
        String name = "ADAM";

        //when
        String result = greetings.greet(name);


        //then
        assertEquals("WITAJ, ADAM!", result);
    }

    @Test
    public void greetTwoPeople() {

        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza";

        //when
        String result = greetings.greet(name);


        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }
    @Test
    public void greetMoreThanTwoPeople() {

        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,Robert";

        //when
        String result = greetings.greet(name);


        //then
        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }
    @Test
    public void greetMoreThanTwoPeopleWithUpperCase() {

//        //given
//        Greetings greetings = new Greetings();
//        String name = "Adam, Iza, ROBERT";
//
//        //when
//        String result = greetings.greet(name);
//
//
//        //then
//        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
    }


}