package Car;

public class Lorry extends Car {
    String TURN_RIGHT = "Грузовик направо";
    String TURN_LEFT = "Грузовик налево";
    int carryingCapacity;

    public Lorry(String carModel, String carClass, int weight, int carryingCapacity, Engine engine) {
        super(carModel, carClass, weight, engine);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    void start() {
        System.out.println(TURN_RIGHT);
    }

    @Override
    void stop() {
        System.out.println(TURN_LEFT);
    }

    @Override
    void printInfo() {
        System.out.println("Carrying capacity of the body: " + carryingCapacity);
        System.out.println("Car brand: " + carModel);
        System.out.println("Car class: " + carClass);
        System.out.println("Car weight " + weight);
        System.out.println("Motor power: " + motor.getManufacturer());
        System.out.println("Motor manufacturer: " + motor.getPower());
    }
}
