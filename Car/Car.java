package Car;

public abstract class Car {
    String TURN_RIGHT = "Поворот направо";
    String TURN_LEFT = "Поворот налево";
    String carModel;
    String carClass;
    int weight;
    Engine motor;

    public Car(String carModel, String carClass, int weight, Engine motor) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.motor = motor;
    }

    abstract void start();

    abstract void stop();

    public void turnRight() {
        System.out.println(TURN_RIGHT);
    }

    public void turnLeft() {
        System.out.println(TURN_LEFT);
    }

    abstract void printInfo();
}
