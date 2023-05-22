package pawtropolis.zoo.model.abstractation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Winged extends Animal {
    private double wingSpan;
    protected Winged(String name, int healthPoints, String favouriteFood, int age, double weight, double height, double wingSpan) {
        super(name, healthPoints, favouriteFood, age, weight, height);
        this.wingSpan = wingSpan;
    }
}
