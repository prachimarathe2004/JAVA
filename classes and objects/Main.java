class Car {
    String model;
    String color;
    
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Honda City";
        car1.color = "Red";
        car1.displayDetails();

        Car car2 = new Car();
        car2.model = "Toyota Corolla";
        car2.color = "Blue";
        car2.displayDetails();
    }
}                                                    
