package pawtropolis.game.model.implementation;

import java.util.List;

public class Bag {

    //Attributes
    private int capacity;
    private List<Item> items;

    //Constructor
    public Bag(int capacity, List<Item> items) {

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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
