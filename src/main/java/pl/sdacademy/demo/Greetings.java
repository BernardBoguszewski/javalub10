package pl.sdacademy.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mariusz Kowalczuk
 */
public class Greetings {

    public String greet(String name) {

        if (name == null) {
            return "Witaj, mój przyjacielu";

        }

     if (name.matches("(.*)(\\d+)(.*)")){
         return "Z liczbami się nie witam.";
     }
        if (name.contains(",")) {
            String[] split = name.split(",");
            List<String> strings = Arrays.asList(split);
            int size = strings.size();
            switch (size) {
                case 2:
                    return strings.get(0) + " i " + strings.get(1) + ", witajcie!";
                case 3:
                    return strings.get(0) + ", " + strings.get(1) + " i " + strings.get(2) + ", witajcie!";
            }


        }
        if (name.substring(1).equals(name.substring(1).toLowerCase())) {
            return "Witaj " + name;

        } else return "WITAJ " + name.toUpperCase() + "!";

    }
}
