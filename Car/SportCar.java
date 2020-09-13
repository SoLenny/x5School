package Car;

public class SportCar extends Car {
    int maxSpeed;

    public SportCar(String carModel, String carClass, int weight, int maxSpeed, Engine motor) {
        super(carModel, carClass, weight, motor);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void start() {
        System.out.println("SportCar goes");
    }

    @Override
    void stop() {
        System.out.println("SportCar stoped");
    }

    @Override
    void printInfo() {
        System.out.println("Top speed: " + maxSpeed);
        System.out.println("Car brand: " + carModel);
        System.out.println("Car class: " + carClass);
        System.out.println("Car weight: " + weight);
        System.out.println("Motor power: " + motor.getManufacturer());
        System.out.println("Motor manufacturer: " + motor.getPower());
    }
}
