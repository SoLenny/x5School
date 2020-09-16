package animal;

public class Info {

    public static void main(String[] args) {
        Cat cat = new Cat("Кошачий корм", "Лежанка", "Джесси");
        Animal dog = new Dog("Собачий корм", "Будка", "Салли");
        Animal horse = new Horse("Сено", "Стойло", "Круз");
        Animal[] animals = new Animal[]{cat, dog, horse};
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
