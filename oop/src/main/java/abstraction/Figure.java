package abstraction;

public abstract class Figure {

    public abstract String draw();

    public String rotate() {
        return String.format("I am rotating a %s", this.getClass().getSimpleName());
    }
}
