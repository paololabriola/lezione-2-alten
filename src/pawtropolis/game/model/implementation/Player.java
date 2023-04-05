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
    public boolean pickupItem(Item item) {

        if(bag.addItem(item))
            return true;
        else
            return false;

    }

    public Item dropItem(String itemName) {

        Item item = bag.findItemByName(itemName);
        bag.removeItem(item);

        return item;

    }

    public void showItemsInBag() {

        bag.showItems();

    }

}
