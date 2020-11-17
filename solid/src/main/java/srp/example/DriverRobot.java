package srp.example;

//Single responsibility principle
public class DriverRobot {

    String name = this.getClass().getSimpleName();

    public String drive() {
        return String.format("I am %s, I am a driver!", name);
    }
}
