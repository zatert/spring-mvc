package web.model;

public class Car {
    private String brand;
    private String transmission;
    private String color;

    public Car() {
    }

    public Car(String brand, String transmission, String color) {
        this.brand = brand;
        this.transmission = transmission;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
