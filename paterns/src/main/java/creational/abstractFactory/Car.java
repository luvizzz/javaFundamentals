package creational.abstractFactory;

import creational.abstractFactory.factory.BlackCorollaFactory;
import creational.abstractFactory.factory.BlackSkodaRapidFactory;
import creational.abstractFactory.factory.BlueCorollaFactory;
import creational.abstractFactory.factory.BlueJeepFactory;
import creational.abstractFactory.factory.CarFactory;
import creational.abstractFactory.factory.RedFerrariFactory;

public class Car {

    private String model;
    private int productionYear;
    private Color color;
    private boolean fourWheelDrive;

    public Car(String model, int productionYear, Color color, boolean fourWheelDrive) {
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", color=" + color +
                ", fourWheelDrive=" + fourWheelDrive +
                '}';
    }

    public static class Factory {
        public enum CarType {
            BLACK_COROLLA,
            BLUE_COROLLA,
            BLACK_SKODA_RAPID,
            RED_FERRARI,
            BLUE_JEEP
        }

        public static CarFactory createFactory(CarType type) {
            switch (type) {
                case BLACK_COROLLA:
                    return new BlackCorollaFactory();
                case BLUE_COROLLA:
                    return new BlueCorollaFactory();
                case BLACK_SKODA_RAPID:
                    return new BlackSkodaRapidFactory();
                case RED_FERRARI:
                    return new RedFerrariFactory();
                case BLUE_JEEP:
                    return new BlueJeepFactory();
                default:
                    throw new IllegalArgumentException("CarType not supported.");
            }
        }

    }
}
