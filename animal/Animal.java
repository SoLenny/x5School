package animal;

public class Animal {
    private String food;
    private String location;

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Noise emitted");
    }
    public void eat() {
        System.out.println("Eat");
    }
    public void sleep() {
        System.out.println("Sleep");
    }
}
