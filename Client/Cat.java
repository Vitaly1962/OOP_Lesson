import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(String name, float weight, LocalDate age, Owner owner, boolean canFly, boolean canSwim) {
        super(name, weight, age, owner, canFly, canSwim);
    }
}
