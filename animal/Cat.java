package animal;

public class Cat extends Animal {
   private String name ;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " уснул");
    }

    @Override
    public void eat() {
        System.out.println(name + " съел " + getFood());
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return getFood();
    }

    public String getLocation() {
        return getLocation();
    }
}
