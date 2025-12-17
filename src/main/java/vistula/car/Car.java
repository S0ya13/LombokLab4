package vistula.car;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@EqualsAndHashCode(of = {"brand"})
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

