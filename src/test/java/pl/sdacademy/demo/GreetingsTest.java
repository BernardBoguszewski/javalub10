package pl.sdacademy.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingsTest {

    Greetings greetings = new Greetings();


    @Test
    public void shouldReturnHelloAndName() {
        //given
        String name = "Adam";

        //when
        String result = greetings.hello(name);

        //then
        Assertions.assertEquals("Witaj, Adam", result);
    }

    @Test
    public void shouldReturnSpecialMessageWhenNameIsNull() {
        //given
        String name = null;

        //when
        String result = greetings.hello(name);

        //then
        Assertions.assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    public void shouldReturnCapitalizeMessageWhenNameIsCapitalize() {
        //given
        String name = "ADAM";

        //when
        String result = greetings.hello(name);

        //then
        Assertions.assertEquals("WITAJ ADAM!", result);
    }

    @Test
    public void shouldReturnTwoNamesIfWeHaveTwoNames() {
        //given
        String name = "Adam,Iza";

        //when
        String result = greetings.hello(name);

        //then
        Assertions.assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    public void shouldReturnThreeNamesIfWeHaveThreeNames() {
        //given
        String name = "Adam,Iza,Robert";

        //when
        String result = greetings.hello(name);

        //then
        Assertions.assertEquals("Adam, Iza i Robert, witajcie!", result);
    }

    @Test
    public void shouldReturnCapitalizeMessageWithNameWhenNameIsCapitalize() {
        //given
        String name = "Adam, Iza, ROBERT";

        //when
        String result = greetings.hello(name);

        //then
        Assertions.assertEquals("Adam i Iza, witajcie! WITAJ ROBERT", result);
    }

    @Test
    public void shouldReturnSpecialMessageWhenNameContainsDigits() {
        //given
        String name = "Adam3";

        //when
        String result = greetings.hello(name);

        //then
        Assertions.assertEquals("Z liczbami się nie witam.", result);
    }


}

