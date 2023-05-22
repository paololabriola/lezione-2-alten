package pawtropolis.zoo.model.abstractation;

import pawtropolis.game.model.abstractation.Entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal extends Entity {
    private String favouriteFood;
    private int age;
    private LocalDate importDate;
    private double weight;
    private double height;
    protected Animal(String name, int healthPoints, String favouriteFood, int age, double weight, double height) {

        super(name, healthPoints);
        this.favouriteFood = favouriteFood;
        this.age = age;
        this.importDate = LocalDate.now();
        this.weight = weight;
        this.height = height;

    }

    protected Animal(String name, int healthPoints, String favouriteFood, int age, LocalDate importDate, double weight, double height) {
        super(name, healthPoints);
        this.favouriteFood = favouriteFood;
        this.age = age;
        this.importDate = importDate;
        this.weight = weight;
        this.height = height;
    }

}
