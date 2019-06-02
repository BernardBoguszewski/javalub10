package pl.sdacademy.demo;

public class Greetings {
    public String hello(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu";
        }
        if (name.matches(".*\\d.*")) {
            return "Z liczbami się nie witam.";
        }
        name = name.replace(" ", "");
        String capitalizeName = name.toUpperCase();
        if (name.equals(capitalizeName)) {
            return "WITAJ " + capitalizeName + "!";
        }
        if (name.contains(",")) {
            String[] split = name.split(",");
            if (split.length == 2) {
                return split[0] + " i " + split[1] + ", witajcie!";
            }
            if (split.length == 3) {
                String capitalizeSplit = split[2].toUpperCase();
                if (split[2].equals(capitalizeSplit)) {
                    return split[0] + " i " + split[1] + ", witajcie! WITAJ " + capitalizeSplit;
                }
                return split[0] + ", " + split[1] + " i " + split[2] + ", witajcie!";
            }
        }
        return "Witaj, " + name;
    }
}
