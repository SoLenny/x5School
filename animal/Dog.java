package animal;

public class Dog extends Animal {
    String name = "Пес";
    String food = "Мясо";
    String location = " и лежит на диване";

    @Override
    public void makeNoise() {
        System.out.println(name + " уснул");
    }

    @Override
    public void eat() {
        System.out.println(name + " съел " + food);
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
