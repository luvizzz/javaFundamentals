package creational.abstractFactory.factory;

import creational.abstractFactory.Color;
import org.joda.time.DateTime;

public class BlueCorollaFactory extends CorollaFactory {

    @Override
    public int createProductionYear() {
        return DateTime.now().year().get();
    }

    @Override
    public Color createColor() {
        return Color.BLUE;
    }

    @Override
    public boolean createFourWheelDrive() {
        return false;
    }
}
