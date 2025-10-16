//Create a class Car that has a method startEngine() which prints "Engine Started" and another method displayDetails() to show car brand and model.


class Car {
    String brand;
    String model;

    void startEngine() {
        System.out.println("Engine Started");
    }

    void displayDetails(String brand, String model) {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

public class Main8 {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.displayDetails("Toyota", "Fortuner");
    }
}
