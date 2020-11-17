package isp.example;

//Interface segregation principle
public class RobotWithoutAntennas implements Spinners, ArmsRotators {

    String name = this.getClass().getSimpleName();

    @Override
    public String spinAround() {
        return String.format("I am a %s, I am spinning!", name);
    }

    @Override
    public String rotateArms() {
        return String.format("I am a %s, I am rotating my arms!", name);
    }
}
