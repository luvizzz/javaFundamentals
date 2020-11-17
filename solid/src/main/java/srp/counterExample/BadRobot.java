package srp.counterExample;

//Single responsibility principle
public class BadRobot {

    String name = this.getClass().getSimpleName();

    public String cook() {
        return String.format("I am %s, I am a chef!", name);
    }

    public String trimPlants() {
        return String.format("I am %s, I am a gardener!", name);
    }

    public String paint() {
        return String.format("I am %s, I am a painter!", name);
    }

    public String drive() {
        return String.format("I am %s, I am a driver!", name);
    }
}
