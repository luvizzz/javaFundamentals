package srp.example;

//Single responsibility principle
public class PainterRobot {

    String name = this.getClass().getSimpleName();

    public String paint() {
        return String.format("I am %s, I am a painter!", name);
    }
}
