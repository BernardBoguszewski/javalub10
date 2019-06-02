package pl.sdacademy.demo;

public class FizzBuzzWhizz {

    public String fizzBuzzWhizz(Integer digit) {
        String msg = "";
        Integer three = 3;
        Integer five = 5;
        if (digit == null) {
            msg = "Nie dla null";
        } else if (isPrime(digit)) {
            if (three.equals(digit)) {
                msg = "FizzWhizz";
            } else if (five.equals(digit)) {
                msg = "BuzzWhizz";
            } else {
                msg = "Whizz";
            }
        } else if (isDivideByTree(digit) && isDivideByFive(digit)) {
            msg = "FizzBuzz";
        } else if (isDivideByTree(digit)) {
            msg = "Fizz";
        } else if (isDivideByFive(digit)) {
            msg = "Buzz";
        }
        return msg;
    }

    public boolean isDivideByTree(Integer integer) {
        int divider = 3;
        return integer % divider == 0;
    }

    public boolean isDivideByFive(Integer integer) {
        int divider = 5;
        return integer % divider == 0;
    }

    public boolean isPrime(Integer integer) {
        boolean isPrime = true;
        if (integer == 0 || integer == 1) {
            return false;
        } else {
            for (int i = 2; i <= integer / 2; i++) {
                if (integer % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}