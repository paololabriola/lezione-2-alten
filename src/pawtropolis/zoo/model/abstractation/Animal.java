package pawtropolis.zoo.model.abstractation;

import pawtropolis.game.model.abstractation.Entity;

import java.time.LocalDate;

public abstract class Animal extends Entity {

    //Class attributes

    private String favouriteFood;

    private int age;

    private LocalDate importDate;

    private double weight;

    private double height;

    //Class constructor
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

    //Class methods getter and setter
    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public int getAgeOfTheSpecimen() {
        return age;
    }

    public void setAge(int ageOfTheSpecimen) {
        this.age = ageOfTheSpecimen;
    }

    public LocalDate getImportDate() {
        return importDate;
    }

    public void setImportDate(LocalDate importDate) {
        this.importDate = importDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
