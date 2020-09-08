package animal;

public class Info {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal[] animals = new Animal[]{cat, dog, horse};
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
