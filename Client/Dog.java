import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, float weight, LocalDate age, Owner owner, boolean canFly, boolean canSwim) {
        super(name, weight, age, owner, canFly, canSwim);
    }
}
