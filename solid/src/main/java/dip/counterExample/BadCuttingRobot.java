package dip.counterExample;

//Dependency inversion principle
public class BadCuttingRobot {

    String name = this.getClass().getSimpleName();

    public String cutPizza(BadPizzaCutterArm tool) {
        return String.format("I am %s, I cut pizza with %s!", name, tool.getName());
    }
}
