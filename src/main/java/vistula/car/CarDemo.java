package vistula.car;

public class CarDemo {
    static void main() {

        Car car1 = new Car("GLE", "Mercedes", 2020, 350000, "white", 5);

        System.out.println(car1.toString());

        car1.sell(1);

        car1.setColor("black");
        car1.setPrice(340000);
        car1.delivery(2);

        System.out.println(car1.toString());
    }
}