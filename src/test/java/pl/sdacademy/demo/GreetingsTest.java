package pl.sdacademy.demo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingsTest {



    @Test
    public void shouldReturnHelloAndName() {
        //given
        String name = "Adam";

        //when
        String result = new Greetings(name).helloMsg();

        //then
        assertEquals("Witaj, Adam", result);
    }

    @Test
    public void shouldReturnSpecialMessageWhenNameIsNull() {
        //given
        String name = null;

        //when
        String result = new Greetings(name).helloMsg();

        //then
        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    public void shouldReturnCapitalizeMessageWhenNameIsCapitalize() {
        //given
        String name = "ADAM";

        //when
        String result = new Greetings(name).helloMsg();

        //then
        assertEquals("WITAJ ADAM!", result);
    }

    @Test
    public void shouldReturnTwoNamesIfWeHaveTwoNames() {
        //given
        String name = "Adam,Iza";

        //when
        String result = new Greetings(name).helloMsg();

        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    public void shouldReturnThreeNamesIfWeHaveThreeNames() {
        //given
        String name = "Adam,Iza,Robert";

        //when
        String result = new Greetings(name).helloMsg();

        //then
        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }

    @Test
    public void shouldReturnCapitalizeMessageWithNameWhenFirstNameIsCapitalize() {
        //given
        String name = "ADAM, Iza, Robert";

        //when
        String result = new Greetings(name).helloMsg();

        //then
        assertEquals("Iza i Robert, witajcie! WITAJ ADAM", result);
    }
    @Test
    public void shouldReturnCapitalizeMessageWithNameWhenSecondNameIsCapitalize() {
        //given
        String name = "Adam, IZA, Robert";

        //when
        String result = new Greetings(name).helloMsg();

        //then
        assertEquals("Adam i Robert, witajcie! WITAJ IZA", result);
    }
    @Test
    public void shouldReturnCapitalizeMessageWithNameWhenThirdNameIsCapitalize() {
        //given
        String name = "Adam, Iza, ROBERT";

        //when
        String result = new Greetings(name).helloMsg();

        //then
        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT", result);
    }

    @Test
    public void shouldReturnSpecialMessageWhenNameContainsDigits() {
        //given
        String name = "Adam3";

        //when
        String result = new Greetings(name).helloMsg();

        //then
        assertEquals("Z liczbami się nie witam.", result);
    }


}

