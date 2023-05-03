package pawtropolis.zoo.model.abstractation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Tailed extends Animal {

    //Class attributes
    private double tailLength;

    //Constructor method of the class
    protected Tailed(String name, int healthPoints, String favouriteFood, int age, double weight, double height, double tailLength) {

        super(name, healthPoints, favouriteFood, age, weight, height);
        this.tailLength = tailLength;

    }

}
