package creational.abstractFactory.factory;

import creational.abstractFactory.Color;

public abstract class CarFactory {

    public abstract String createModel();

    public abstract int createProductionYear();

    public abstract Color createColor();

    public abstract boolean createFourWheelDrive();
}
