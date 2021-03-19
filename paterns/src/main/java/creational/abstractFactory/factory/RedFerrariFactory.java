package creational.abstractFactory.factory;

import creational.abstractFactory.Color;
import org.joda.time.DateTime;

public class RedFerrariFactory extends CarFactory {
    @Override
    public String createModel() {
        return "Ferrari";
    }

    @Override
    public int createProductionYear() {
        return DateTime.now().year().get();
    }

    @Override
    public Color createColor() {
        return Color.RED;
    }

    @Override
    public boolean createFourWheelDrive() {
        return false;
    }
}
