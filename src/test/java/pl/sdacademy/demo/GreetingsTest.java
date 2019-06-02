package pl.sdacademy.demo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GreetingsTest {

    private Greetings greetings;
    @Before
    public void setUp(){
        greetings = new Greetings();
    }


    @Test
    public void greet(){
        //given

        Greetings greetings = new Greetings();
        String name = "Ala";
        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, Ala!", result);
    }

    @Test
    public void greetWithUpperCase(){
        //given
        Greetings greetings = new Greetings();
        String name = "ALA";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("WITAJ, ALA!", result);
    }
    @Test
    public void greetTestWhenTwoNamesGiven(){
        //given
        Greetings greetings = new Greetings();

        //when
        String name = "Adam, Iza";

        //then
        String result = greetings.greet(name);
        assertEquals("Adam i Iza witajcie!", result);

    }

    @Test
    public void greetTestWithThreeNames(){
        //given
        Greetings greetings = new Greetings();

        //when
        String name = "Adam, Iza, Robert";

        //then
        String result = greetings.greet(name);
        assertEquals("Adam, Iza i Robert witajcie!", result);

    }

}
