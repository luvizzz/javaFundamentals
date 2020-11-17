package constructor;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate dateOfBirth;
    private String eyeColor;
    private int height;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, LocalDate dateOfBirth, String eyeColor, int height, int weight) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return String.format("This person has: %n" +
                "- name: %s%n" +
                "- dateOfBirth: %s%n" +
                "- eyeColor: %s%n" +
                "- height: %d%n" +
                "- weight: %d%n",
                name,
                dateOfBirth == null ? "unknown DoB": dateOfBirth.toString(),
                eyeColor,
                height,
                weight);
    }
}
