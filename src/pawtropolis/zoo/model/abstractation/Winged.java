package pawtropolis.zoo.model.abstractation;

public abstract class Winged extends Animal {

    //Class attributes
    private double wingSpan;

    //Constructor method of the class
    protected Winged(String name, int healthPoints, String favouriteFood, int age, double weight, double height, double wingSpan) {

        super(name, healthPoints, favouriteFood, age, weight, height);
        this.wingSpan = wingSpan;

    }

    //Class methods getter and setter
    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

}
