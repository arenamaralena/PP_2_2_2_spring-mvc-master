package web.model;

public class Car {
    private String brand;
    private String color;
    private int number;


    public Car(String brand, String color, int number) {
        this.brand = brand;
        this.color = color;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
