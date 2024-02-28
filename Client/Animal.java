import java.time.LocalDate;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;
    protected boolean canFly;
    protected boolean canSwim;

    public Animal(String name, float weight, LocalDate age, Owner owner, boolean canFly, boolean canSwim) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    public void toGo() {
        System.out.println(name + " идет.");
    }

    public void fly() {
        if (canFly) {
            System.out.println(name + " летает.");
        } else {
            System.out.println(name + " не умеет летать.");
        }
    }

    public void swim() {
        if (canSwim) {
            System.out.println(name + " плавает.");
        } else {
            System.out.println(name + " не умеет плавать.");
        }
    }

    public String getName() {
        return name;
    }
}
