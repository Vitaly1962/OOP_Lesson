package clients;

import java.security.acl.Owner;
import java.time.LocalDate;

public class Duck extends Animal {
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void fly() {
        System.out.println(name + " летает.");
    }
    @Override
    public void swim() {
        System.out.println(name + " плавает как рыба.");
    }
}

    public String getName() {
        return name;
    }
}
