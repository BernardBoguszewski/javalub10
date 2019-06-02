package pl.sdacademy.demo;

import java.util.ArrayList;
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

        if (name.matches("(.*)(\\d+)(.*)")) {
            return "Z liczbami się nie witam.";
        }
        if (name.contains(",")) {
            List<String> strings = Arrays.asList(name.split(","));
            List<String> upperCaseNames = new ArrayList<>();
            List<String> lowerCaseNames = new ArrayList<>();

            for (String n : strings
            ) {
                if (isNameAllUppercase(n)) {
                    upperCaseNames.add(n);
                } else {
                    lowerCaseNames.add(n);
                }
            }

            StringBuilder sb = new StringBuilder();
            if (lowerCaseNames.size() > 0) {

                for (String n : lowerCaseNames
                ) {
                    sb.append(n).append(" i");
                }

            }

            sb.deleteCharAt(sb.lastIndexOf(" ")).deleteCharAt(sb.lastIndexOf("i")).append(", witajcie!");


            if (upperCaseNames.size() > 0) {
                sb.append(" WITAJ").append(upperCaseNames.get(0)).append("!");
                return sb.toString();

            }


//            int size = strings.size();
//            switch (size) {
//                case 2:
//                    return strings.get(0) + " i " + strings.get(1) + ", witajcie!";
//                case 3:
//                    return strings.get(0) + ", " + strings.get(1) + " i " + strings.get(2) + ", witajcie!";
//            }

        }

        if (name.substring(1).equals(name.substring(1).toLowerCase())) {
            return "Witaj " + name;

        } else return "WITAJ " + name.toUpperCase() + "!";

    }

    protected boolean isNameAllUppercase(String name) {

        return name.equals(name.toUpperCase());

    }
}
