package pl.sdacademy.demo;

/**
 * Created by A.Wójcik on 02 06 2019.
 */
public class Greetings {

    public String greet(String name) {

        String result;

        if (name == null) {
            result = "Witaj, mój przyjacielu";
        }
        else if (!containsComa(name)){
            result = convertToUpperCase(name);
        } else {
            String[] names = toArray(name);
            result = names[0];
            for (int i = 1; i < names.length-1; i++) {
                result += (", " + names[i]);
            } result += " i " + names[names.length-1] + ", witajcie!";
        }

        return result;
    }



    public boolean isUpperCase(String name) {
        return name.equals(name.toUpperCase());
    }

    public boolean containsComa(String name) {
        name = name.replaceAll("\\s","");
        return name.contains(",");
    }

    public String[] toArray(String name) {
        if (containsComa(name) == false) {
        }
        return name.split(",");
    }

    public String convertToUpperCase(String name) {
        String result = name;
        if (isUpperCase(name)) {
            result = "WITAJ, " + name + "!";
        } else {
            result = "Witaj, " + name + "!";
        }
        return result;
    }
}
