package src.pawtropolis.animals.model.abstractation;

import java.time.LocalDate;

public class Animal {

    //Class attributes
    private String name;

    private String favouriteFood;

    private int age;

    private LocalDate importDate;

    private double weight;

    private double height;

    //Class constructor
    public Animal(String nameOfTheSpecimen, String favouriteFoodOfTheSpecimen, int ageOfTheSpecimen, double weightOfTheSpecimen, double heightOfTheSpecimen) {

        this.name = nameOfTheSpecimen;
        this.favouriteFood = favouriteFoodOfTheSpecimen;
        this.age = ageOfTheSpecimen;
        this.importDate = LocalDate.now();
        this.weight = weightOfTheSpecimen;
        this.height = heightOfTheSpecimen;

    }

    public Animal(String nameOfTheSpecimen, String favouriteFoodOfTheSpecimen, int ageOfTheSpecimen, LocalDate importDateOfTheSpecimen, double weightOfTheSpecimen, double heightOfTheSpecimen) {
        this.name = nameOfTheSpecimen;
        this.favouriteFood = favouriteFoodOfTheSpecimen;
        this.age = ageOfTheSpecimen;
        this.importDate = importDateOfTheSpecimen;
        this.weight = weightOfTheSpecimen;
        this.height = heightOfTheSpecimen;
    }

    //Class methods getter and setter
    public String getName() {
        return name;
    }

    public void setName(String nameOfTheSpecimen) {
        this.name = nameOfTheSpecimen;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFoodOfTheSpecimen) {
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

    public void setWeight(double weightOfTheSpecimen) {
        this.weight = weightOfTheSpecimen;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double heightOfTheSpecimen) {
        this.height = height;
    }

}
