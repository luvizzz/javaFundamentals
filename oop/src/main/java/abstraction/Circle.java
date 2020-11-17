package abstraction;

public class Circle extends Figure{

//    public abstract String draw() {
    public String draw() {
        return String.format("I am drawing a %s", this.getClass().getSimpleName());
    }
}
