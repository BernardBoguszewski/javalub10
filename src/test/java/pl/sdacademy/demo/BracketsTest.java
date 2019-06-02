package pl.sdacademy.demo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsTest {

    @Test
    public void shouldReturnFalseifAmountOfBracketsIsOdd() {

        //given
        String bracketsString = "[";

        //when
        Boolean result = Brackets.check(bracketsString);
        //then
        assertFalse(result);

    }

    @Test
    public void shouldReturnFalseifAmountOfBracketsIsEven() {

        //given
        String bracketsString = "[]";

        //when
        Boolean result = Brackets.check(bracketsString);
        //then
        assertTrue(result);

    }

    @Test
    public void shouldReturnFalseIfFirstHalfOfStringIsNotSymmetricToSecondHalf() {

        //given
        String bracketsString = "[]]]";

        //when
        Boolean result = Brackets.check(bracketsString);
        //then
        assertFalse(result);

    }

    @Test
    public void shouldReturnTrueIfFirstHalfOfStringIsNotSymmetricToSecondHalf() {

        //given
        String bracketsString = "[][]";

        //when
        Boolean result = Brackets.check(bracketsString);
        //then
        assertFalse(result);

    }

}