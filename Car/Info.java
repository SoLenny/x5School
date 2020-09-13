package Car;

public class Info {
    public static void main(String[] args) {
        Car lorry = new Lorry(
                "Nissan",
                "Truck",
                4567,
                1,
                new Engine(1, 2)
        );

        Car sportCar = new SportCar(
                "Dodge",
                "Sport car",
                1000,
                400,
                new Engine(100, 101)
        );

        for (Car car : new Car[]{lorry, sportCar}) {
            car.printInfo();
        }
    }
}
