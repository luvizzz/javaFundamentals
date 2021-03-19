package creational.abstractFactory.factory;

public abstract class CorollaFactory extends CarFactory {
    @Override
    public String createModel() {
        return "Corolla";
    }
}
