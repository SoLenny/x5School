package Car;

public class Engine {
    int power;
    int manufacturer;

    public Engine(int manufacturer, int power) {
        this.manufacturer = manufacturer;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public int getManufacturer() {
        return manufacturer;
    }
}
