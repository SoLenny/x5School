package animal;

public class Cat extends Animal {
    String name = "Киса";
    String food = "Кошачий корм";
    String location = " и лежит на лежанке";

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
