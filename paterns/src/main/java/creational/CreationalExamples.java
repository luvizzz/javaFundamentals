package creational;

import creational.builder.Color;
import creational.builder.Person;
import org.joda.time.LocalDateTime;

public class CreationalExamples {

    public static void main() {
        System.out.println("| Demonstrating examples of Creational Patterns |");
        System.out.println("|-----------------------------------------------|");

        System.out.println();
        builderExample();
    }

    public static void builderExample() {

        System.out.println("| Builder example |");

        Person myCompleteFriend = new Person.Builder("John")
                .withBirthDate(LocalDateTime.parse("1990-01-01").toDateTime())
                .withEyeColor(Color.BLACK)
                .withHeight(95)
                .withHeight(170)
                .build();

        Person myNotSoCompleteFriend = new Person.Builder("Robert")
                .withEyeColor(Color.BLUE)
                .build();

        System.out.println(myCompleteFriend.toString());
        System.out.println(myNotSoCompleteFriend.toString());

    }
}
