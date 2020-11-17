package dip.counterExample;

//Dependency inversion principle
public class BadPizzaCutterArm {
    String name = this.getClass().getSimpleName();

    public String getName() {
        return name;
    }
}
