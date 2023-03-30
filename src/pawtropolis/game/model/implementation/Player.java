package pawtropolis.game.model.implementation;

import pawtropolis.game.model.abstractation.Entity;

public class Player extends Entity {

    static final int DEFAULT_BAG_CAPACITY = 10;

    //Attributes
    private Bag bag;

    //Constructor
    public Player(String name, int healthPoints) {

        super(name, healthPoints);
        this.bag = new Bag(DEFAULT_BAG_CAPACITY);

    }

    //Getters and setters
    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    //Other methods
    public void pickupItem(Item item) {

        bag.addItem(item);

    }

    public void dropItem(Item item) {

        bag.removeItem(item);

    }

}
