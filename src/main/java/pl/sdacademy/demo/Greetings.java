package pl.sdacademy.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class Greetings {

    public static void main(String[] args) {

        String input = "Adam, Iza, ROBERT";
        String trimedInput = input.trim();
        String[] split = trimedInput.split(",");
        String s = welcomeThreePersonsOneWithBiggerCase(split);
        System.out.println(s);
    }


    public String greet(String name) {

        String result = name;
        if (name == null) {
            return result = "Witaj, mój przyjacielu";
        } else if (name.contains(",")) {
            result = name.trim();
            String[] split = result.split(",");
            if (split.length <= 2) {
                result = welcomeTwoPersons(split);
            } else if (!isUpperCase(split)) {
                result = welcomeThreePersons(split);
            } else if (isUpperCase(split)) {
                result = welcomeThreePersonsOneWithBiggerCase(split);
            }
        } else if (isUpperCase(name)) {
            result = "Witaj, " + name + "!";
            result = result.toUpperCase();
        } else {
            result = "Witaj, " + name + "!";
        }
        return result;
    }

    public static boolean isUpperCase(String string) {
        return string.equals(string.toUpperCase());
    }

    public static boolean isUpperCase(String[] strings) {
        boolean result = false;
        for (String str : strings) {
            if (isUpperCase(str)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static String welcomeTwoPersons(String[] strings) {
        String result = strings[0] + " i " + strings[1] + ", Witajcie!";
        return result;
    }

    public static String welcomeThreePersons(String[] strings) {
        String result = strings[0] + ", " + strings[1] + " i " + strings[2] + ", Witajcie!";
        return result;
    }

    public static String welcomeThreePersonsOneWithBiggerCase(String[] strings) {

        StringBuilder builder = new StringBuilder();
        String result = "";
        ArrayList<String> lowerCaseStrings = new ArrayList<>();
        ArrayList<String> upperCaseStrings = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (isUpperCase(strings[i])) {
                upperCaseStrings.add(strings[i]);
            } else {
                lowerCaseStrings.add(strings[i]);
            }
        }

        for (String str : lowerCaseStrings) {
            builder = builder.append(str);
            if (!str.equals(lowerCaseStrings.get(lowerCaseStrings.size() - 1))) {
                builder = builder.append(" i");
            } else {
                builder.append(", witajcie! ");
            }
        }

        for (String str1 : upperCaseStrings) {
            builder = builder.append("WITAJ" + str1 + "!");
        }
        result = builder.toString();
        return result;
    }
}
