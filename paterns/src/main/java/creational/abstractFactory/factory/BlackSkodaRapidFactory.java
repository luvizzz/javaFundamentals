package creational.abstractFactory.factory;

import creational.abstractFactory.Color;
import org.joda.time.DateTime;

public class BlackSkodaRapidFactory extends CarFactory {
    @Override
    public String createModel() {
        return "Skoda Rapid";
    }

    @Override
    public int createProductionYear() {
        return DateTime.now().year().get();
    }

    @Override
    public Color createColor() {
        return Color.BLACK;
    }

    @Override
    public boolean createFourWheelDrive() {
        return false;
    }
}
