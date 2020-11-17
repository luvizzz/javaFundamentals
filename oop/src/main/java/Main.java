import abstraction.Circle;
import abstraction.Figure;
import encapsulation.Computer;
import inheritance.Bicycle;
import inheritance.Car;
import inheritance.Motorbike;
import inheritance.Vehicle;
import polymorphism.Person;
import polymorphism.Singer;

public class Main {

    public static void main(String args[]) {
        System.out.println("|------------------------------------------|");
        System.out.println("|Demonstrating examples of OOP Fundamentals|");
        System.out.println("|------------------------------------------|");

        System.out.println();
        inheritanceExample();

        System.out.println();
        polymorphismExample();

        System.out.println();
        encapsulationExample();

        System.out.println();
        abstractionExample();
    }

    public static void inheritanceExample() {
        System.out.println("Inheritance and Composition Example:");
        System.out.println("------------------------------------");

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.move());

        Motorbike motorbike = new Motorbike();
        System.out.println(motorbike.move());
        System.out.println(motorbike.accelerate());

        Car car = new Car();
        System.out.println(car.move());
        System.out.println(car.openTrunk());
        System.out.println(car.accelerate());

        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.move());
    }

    public static void polymorphismExample() {
        System.out.println("Polymorphism Example:");
        System.out.println("---------------------");

        Person person = new Person();
        System.out.println(person.talk("Hello!"));

        //Person singer = new Singer();
        Singer singer = new Singer();
        System.out.println(singer.talk("Helloooo!")); //run time
        System.out.println(singer.sing("Mama, just killed a man"));
        System.out.println(singer.sing("Put a gun against his head", "Pulled my trigger, now he's dead")); //compile time
    }

    public static void encapsulationExample() {
        System.out.println("Encapsulation Example:");
        System.out.println("----------------------");

        Computer myComputer = new Computer();
        printComputerInfo(myComputer);

        myComputer.setSoundVolume(95);
        myComputer.setCurrentKeyboardLanguage("pl");
        myComputer.setBatteryLevel(10);
        System.out.println("Stats have changed!");
        printComputerInfo(myComputer);
    }

    public static void printComputerInfo(Computer computer) {
        System.out.println(String.format("My sound volume is %d", computer.getSoundVolume()));
        //System.out.println(String.format("My sound volume is %d", computer.soundVolume));
        System.out.println(String.format("My keyboard language is %s", computer.getCurrentKeyboardLanguage()));
        //System.out.println(String.format("My keyboard language is %s", computer.currentKeyboardLanguage));
        System.out.println(String.format("My battery level is %d", computer.getBatteryLevel()));
        System.out.println(String.format("My battery level is %d", computer.batteryLevel));
    }

    public static void abstractionExample() {
        System.out.println("Abstraction Example:");
        System.out.println("--------------------");

        //Figure figure = new Figure();
        Figure figure = new Circle();
        System.out.println(figure.draw());
        System.out.println(figure.rotate());

        Circle circle = new Circle();
        System.out.println(circle.draw());
        System.out.println(circle.rotate());
    }
}
