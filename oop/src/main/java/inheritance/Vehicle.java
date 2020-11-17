package inheritance;

//To demonstrate inheritance
public class Vehicle {

    protected String color;

    public Vehicle() {
        color = "Blue";
    }

    public String move() {
        return String.format("I am a %s %s, I am moving",
                color,
                this.getClass().getSimpleName()
        );
    }
}
