package inheritance;

public class Motorbike extends Vehicle implements Accelerates{

    public Motorbike() {
        color = "Red";
    }

    @Override
    public String accelerate() {
        return "I am rolling my throttle to accelerate!";
    }
}
