package dip.example;

//Dependency inversion principle
public class KnifeArm implements Tool{

    String name = this.getClass().getSimpleName();

    @Override
    public String getName() {
        return name;
    }
}
