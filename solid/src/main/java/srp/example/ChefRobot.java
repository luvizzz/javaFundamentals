package srp.example;

//Single responsibility principle
public class ChefRobot {

    String name = this.getClass().getSimpleName();

    public String cook() {
        return String.format("I am %s, I am a chef!", name);
    }

}
