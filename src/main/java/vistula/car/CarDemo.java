package vistula.car;

public class CarDemo {
    public static void main(String[] args) {
        Car Car1 = new Car("GLE", "Mercedes", 2020, 350000, "white", 5);
        Car Car2 = new Car("GLC", "Mercedes", 2023, 200000, "silver", 3);

        System.out.println(Car1);
        System.out.println(Car2);

        System.out.println(Car1.getColor());
        int year = Car1.getYear();
        Car1.setColor("black");

        System.out.println("Are these objects equal? " + Car1.equals(Car2));
        System.out.println("The HashCode of this object is: " + Car2.hashCode());
        System.out.println("The HashCode of this object is: " + Car1.hashCode());
    }
}