class Car {
    private int speed;
    private boolean engineOn;

    public void startEngine() {
        engineOn = true;
        System.out.println("Engine started");
    }

    public void accelerate(int increase) {
        if (engineOn) {
            speed += increase;
            System.out.println("Accelerated to " + speed + " km/h");
        } else {
            System.out.println("Start the engine first!");
        }
    }

    public int getSpeed() {
        return speed;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate(20); // will show warning
        car.startEngine();
        car.accelerate(40);
        System.out.println("Current speed: " + car.getSpeed());
    }
}
