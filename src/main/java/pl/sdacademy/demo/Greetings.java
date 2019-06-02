package pl.sdacademy.demo;

public class Greetings {

    public String greet(String name) {

        String result = name;
        if (name == null) {
            return result = "Witaj, mój przyjacielu";
        } else if (name.contains(",")) {
            String[] split = result.split(",");
            if (split.length <= 2) {
                result = welcomeTwoPersons(split);
            } else {
                result = welcomeThreePersons(split);
            }
        } else if (Greetings.isUpperCase(name)) {
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

    public static String welcomeTwoPersons(String[] string) {
        String result = string[0] + " i " + string[1] + ", Witajcie!";
        return result;
    }

    public static String welcomeThreePersons(String[] string) {
        String result = string[0] + ", " + string[1] + " i " + string[2] + ", Witajcie!";
        return result;
    }
}