package dip.example;

//Dependency inversion principle
public class CuttingRobot {

    String name = this.getClass().getSimpleName();

    public String cutPizza(Tool tool) {
        return String.format("I am %s, I cut pizza with %s!", name, tool.getName());
    }
}
