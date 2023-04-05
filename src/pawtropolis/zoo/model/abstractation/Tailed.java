package pawtropolis.zoo.model.abstractation;

public abstract class Tailed extends Animal {

    //Class attributes
    private double tailLength;

    //Constructor method of the class
    public Tailed(String name, int healthPoints, String favouriteFood, int age, double weight, double height, double tailLength) {

        super(name, healthPoints, favouriteFood, age, weight, height);
        this.tailLength = tailLength;

    }

    //Class methods getter and setter
    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

}
