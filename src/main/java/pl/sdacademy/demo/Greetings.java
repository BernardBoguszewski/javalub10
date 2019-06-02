package pl.sdacademy.demo;


public class Greetings {
    private String name;

    public String greet(String name) {
        if (name == null) {
            return "Witaj mój przyjacielu";
        } else if (name == name.toUpperCase()) {
            return "WITAJ, " + name + "!";
        } else if (name.contains(",")) {
            String[] names = name.split(",");
            if (names.length == 2) {
                return names[0] + " i" + names[1] + " witajcie!";
            } else if (names.length == 3) {
                return names[0] + "," + names[1] + " i" + names[2] + " witajcie!";
            }
        }
        return "Witaj, " + name + "!";
    }

}
