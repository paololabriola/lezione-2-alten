package pawtropolis.animals.model.abstractation;

public class Tailed extends Animal {

    //Class attributes
    private double tailLength;

    //Constructor method of the class
    public Tailed(String name, String favouriteFood, int age, double weight, double height, double tailLength) {

        super(name, favouriteFood, age, weight, height);
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
