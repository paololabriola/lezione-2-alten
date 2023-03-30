package pawtropolis.animals.model.abstractation;

public abstract class Winged extends Animal {

    //Class attributes
    private double wingSpan;

    //Constructor method of the class
    public Winged(String name, String favouriteFood, int age, double weight, double height, double wingSpan) {

        super(name, favouriteFood, age, weight, height);
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
