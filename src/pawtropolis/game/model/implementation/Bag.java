package pawtropolis.game.model.implementation;

import java.util.Collection;

public class Bag {

    //Attributes
    private int capacity;
    private Collection<Item> items;

    //Constructor
    public Bag(int capacity, Collection<Item> items) {

        this.capacity = capacity;
        this.items = items;

    }

    //Getters and setters
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Collection<Item> getItems() {
        return items;
    }

    public void setItems(Collection<Item> items) {
        this.items = items;
    }

}
