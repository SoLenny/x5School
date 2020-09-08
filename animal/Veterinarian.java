package animal;

public class Veterinarian {
    void treatAnimal(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println(cat.getFood() + " ест Киса " + cat.getLocation());
            return;
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println(dog.getFood() + " ест Пес " + dog.getLocation());
            return;
        }

        if (animal instanceof Horse) {
            Horse horse = (Horse) animal;
            System.out.println(horse.getFood() + " ест Пони " + horse.getLocation());
        }
    }
}
