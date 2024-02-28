import java.time.LocalDate;

public class Fish extends Animal {
    public Fish(final String name, final float weight, final LocalDate age, final Owner owner, final boolean canFly, final boolean canSwim) {
        super(name, weight, age, owner, canFly, canSwim);
    }
    @Override
    public void swim() {
        System.out.println(name + " плавает.");
    }
    @Override
    public void toGo() {
        System.out.println(name + " не умеет ходить.");
    }

    @Override
    public void fly() {
        System.out.println(name + " не умеет летать.");
    }
}
