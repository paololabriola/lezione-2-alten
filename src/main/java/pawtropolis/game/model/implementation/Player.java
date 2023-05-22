package pawtropolis.game.model.implementation;

import pawtropolis.game.model.abstractation.Entity;

public class Player extends Entity {

    private static final int DEFAULT_BAG_CAPACITY = 10;

    //Attributes
    private Bag bag;

    //Constructor
    public Player(String name, int healthPoints) {

        super(name, healthPoints);
        this.bag = new Bag(DEFAULT_BAG_CAPACITY);

    }

    //Other methods
    public boolean pickupItem(Item item) {

        return bag.addItem(item);

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
