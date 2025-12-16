package vistula.car;

public class Car {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, int price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public int getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void delivery(int delivery) {
        quantity += delivery;
    }

    public void sell(int sold) {
        quantity -= sold;
    }

    public String toString() {
        return "Car:" +
                "\nModel = " + model +
                "\nBrand = " + brand +
                "\nYear = " + year +
                "\nPrice = " + price +
                "\nColor = " + color +
                "\nQuantity = " + quantity;
    }
}

