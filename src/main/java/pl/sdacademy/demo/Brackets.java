package pl.sdacademy.demo;

public class Brackets {

    public static Boolean check(String bracketsString) {

        if (bracketsString.length() % 2 == 0) {

            String firstHalf = bracketsString.substring(0, bracketsString.length() / 2);
            String secondHalf = bracketsString.substring(bracketsString.length() / 2 + 1, bracketsString.length());

            if (firstHalf == flipString(secondHalf)) {

                return true;
            }

        }
        return false;


    }

    private static String flipString(String secondHalf) {

        return new StringBuilder(secondHalf).reverse().toString();
    }
}
