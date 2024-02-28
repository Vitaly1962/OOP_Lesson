import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Иван", "Иванов", LocalDate.of(1980, 5, 10), 123456789, "Барсик");

        Lion lion = new Lion("Лёва", 45, LocalDate.of(2007, 2, 3), owner, false, true);
        Duck duck = new Duck("Дональд", 10, LocalDate.of(2019, 5, 15), owner, true, true);
        Mole mole = new Mole("Молли", 5, LocalDate.of(2020, 10, 20), owner, false, true);
        Dog dog = new Dog("Шарик", 20, LocalDate.of(2015, 3, 12), owner, false, true);
        Cat cat = new Cat("Мурзик", 8, LocalDate.of(2020, 7, 1), owner, false, false);
        Fish fish = new Fish("Немо", 0.1f, LocalDate.of(2018, 9, 5), owner, true, true);

        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(duck);
        animals.add(mole);
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);

        for (Animal animal : animals) {
            System.out.println(animal.getName() + ":");
            animal.toGo();
            animal.fly();
            animal.swim();
            System.out.println();
        }
    }
}
