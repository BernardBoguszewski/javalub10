package pl.sdacademy.demo;


import java.util.ArrayList;
import java.util.List;

public class Greetings {
    private String name;

    public Greetings(String name) {
        this.name = name;
    }


    public String helloMsg() {
        NameValidator validator = new NameValidator(name);
        if (validator.isNull()) {
            return "Witaj, mój przyjacielu";
        }
        if (validator.isNumberContained()) {
            return "Z liczbami się nie witam.";
        }
        if (validator.isUppercased()) {
            return "WITAJ " + name.toUpperCase() + "!";
        }
        if (validator.hasMoreThanOneNames()) {
            String[] split = name.split(",");

            if (split.length == 2) {
                return split[0].trim() + " i " + split[1].trim() + ", witajcie!";
            }
            if (split.length == 3) {
                int tempNum = 0;
                String temp = null;
                String[] tempArray = new String[3];
                for (int i = 0; i < split.length; i++) {
                    split[i] = split[i].trim();
                    if (split[i].equals(split[i].toUpperCase())) {
                        temp = split[i].toUpperCase().trim();

                    }else {
                        tempArray[tempNum] = split[i];
                        tempNum++;
                    }
                }


                if (temp != null) {
                    return tempArray[0] + " i " + tempArray[1] + ", witajcie! WITAJ " + temp;
                }
                return split[0] + ", " + split[1] + " i " + split[2] + ", witajcie!";
            }
        }
        return "Witaj, " + name;
    }
}
