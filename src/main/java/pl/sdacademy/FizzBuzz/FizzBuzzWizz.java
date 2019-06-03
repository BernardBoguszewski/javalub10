package pl.sdacademy.FizzBuzz;

public class FizzBuzzWizz {

    public static void main(String[] args) {
        System.out.println(fizzBuzzWhizz(0));
        System.out.println(fizzBuzzWhizz(1));
        System.out.println(fizzBuzzWhizz(3));
        System.out.println(fizzBuzzWhizz(5));
        System.out.println(fizzBuzzWhizz(7));
        System.out.println(fizzBuzzWhizz(9));
        System.out.println(fizzBuzzWhizz(10));
        System.out.println(fizzBuzzWhizz(11));

    }

    public static String fizzBuzzWhizz(Integer digit) {
        if (digit == null) {
            return "Nie dla null!";
        } else if (digit == 3) {
            return "FizzWhizz";
        } else if (digit == 5) {
            return "BuzzWhizz";
        } else if (digit == 1) {
            return "1 nie jest liczbą pierwszą";
        } else if (digit % 3 == 0 && digit % 5 == 0) {
            return "FizzBuzz";
        } else if (digit % 3 == 0) {
            return "Fizz";
        } else if (digit % 5 == 0) {
            return "Buzz";
        } else for (int i = 2; i < digit; digit++) {
            if (digit % i == 0) {
                return digit + "is not prime number";
            } else {
                return "Whizz";
            }
        }
        return "";
    }
}
