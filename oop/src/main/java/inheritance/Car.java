package inheritance;

public class Car extends Vehicle implements Accelerates {

    public Car() {
        color = "Yellow";
    }

    public String openTrunk() {
        return String.format("I am opening my trunk!");
    }

    @Override
    public String accelerate() {
        return "I am stepping on the gas pedal to accelerate!";
    }
}
