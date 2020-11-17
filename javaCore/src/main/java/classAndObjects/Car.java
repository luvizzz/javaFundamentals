package classAndObjects;

public class Car {

    private String color;
    private String licensePlate;
    private String brand;
    private int kms;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        System.out.println("updating kms: ");
        System.out.println("kms: " + kms);
        System.out.println("this.kms: " + this.kms);
        this.kms = kms;
        System.out.println("Updated!");
        System.out.println("kms: " + kms);
        System.out.println("this.kms: " + this.kms);
    }

    public String getCarInfo() {
        return  " - color: " + color + "\n" +
                " - licensePlate: " + licensePlate + "\n" +
                " - brand: " + brand + "\n" +
                " - kms: " + kms + ";";
    }
}
