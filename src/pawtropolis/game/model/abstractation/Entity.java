package pawtropolis.game.model.abstractation;

public abstract class Entity {

    //Attributes
    private String name;
    private int healthPoints;

    //Constructor
    protected Entity(String name, int healthPoints) {

        this.name = name;
        this.healthPoints = healthPoints;

    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

}
