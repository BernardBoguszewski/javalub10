package pl.sdacademy.demo;

public class NameValidator {
    private String name;

    public NameValidator(String name) {
        this.name = name;
    }

    public boolean isNull() {
        return name == null;
    }

    public boolean isNumberContained() {
        return name.matches(".*\\d.*");
    }

    public boolean isUppercased() {
        name = name.replace(" ", "");
        String capitalizeName = name.toUpperCase();
        return name.equals(capitalizeName);
    }

    public boolean hasMoreThanOneNames() {
        return name.contains(",");
    }




}
