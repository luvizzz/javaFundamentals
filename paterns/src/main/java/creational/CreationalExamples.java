package creational;

import creational.builder.Color;
import creational.builder.Person;
import creational.abstractFactory.Car;
import creational.abstractFactory.factory.CarFactory;
import org.joda.time.LocalDateTime;

import static creational.abstractFactory.Car.Factory.CarType.BLACK_COROLLA;
import static creational.abstractFactory.Car.Factory.CarType.BLACK_SKODA_RAPID;
import static creational.abstractFactory.Car.Factory.CarType.BLUE_COROLLA;
import static creational.abstractFactory.Car.Factory.CarType.BLUE_JEEP;
import static creational.abstractFactory.Car.Factory.CarType.RED_FERRARI;

public class CreationalExamples {

    public static void main() {
        System.out.println("| Demonstrating examples of Creational Patterns |");
        System.out.println("|-----------------------------------------------|");

        System.out.println();
        builderExample();

        System.out.println();
        abstractFactoryExample();
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

    public static void abstractFactoryExample() {
        System.out.println("| Abstract Factory example |");

        Car myBlueCorolla = getMyCar(Car.Factory.create(BLUE_COROLLA));
        Car myBlackCorolla = getMyCar(Car.Factory.create(BLACK_COROLLA));
        Car myRedFerrari = getMyCar(Car.Factory.create(RED_FERRARI));
        Car myBlackSkoda = getMyCar(Car.Factory.create(BLACK_SKODA_RAPID));
        Car myBlueJeep = getMyCar(Car.Factory.create(BLUE_JEEP));

        System.out.println(myBlueCorolla.toString());
        System.out.println(myBlackCorolla.toString());
        System.out.println(myRedFerrari.toString());
        System.out.println(myBlackSkoda.toString());
        System.out.println(myBlueJeep.toString());
    }

    private static Car getMyCar(CarFactory factory) {
        return new Car(
                factory.createModel(),
                factory.createProductionYear(),
                factory.createColor(),
                factory.createFourWheelDrive()
        );
    }
}
