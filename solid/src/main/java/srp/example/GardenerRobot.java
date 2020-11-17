package srp.example;

//Single responsibility principle
public class GardenerRobot {

    String name = this.getClass().getSimpleName();

    public String trimPlants() {
        return String.format("I am %s, I am a gardener!", name);
    }
}
