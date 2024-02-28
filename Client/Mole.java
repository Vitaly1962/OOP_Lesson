package clients;

import java.time.LocalDate;

public class Mole extends Animal {
    public Mole(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void fly() {
        System.out.println(name + " не умеет летать.");
    }

    @Override
    public void swim() {
        System.out.println(name + " плаваеткак рыба.");
    }
    @Override
    public String toString() {
        return "Mole []";
    }
}
