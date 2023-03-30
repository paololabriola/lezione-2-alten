package pawtropolis.game.model.implementation;

import java.util.Collection;

public class Bag {

    //Attributes
    private int capacity;
    private int availableSlots;
    private Collection<Item> items;

    //Constructor
    public Bag(int capacity) {

        this.capacity = capacity;
        this.availableSlots = capacity;

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

    public int getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(int availableSlots) {
        this.availableSlots = availableSlots;
    }

    //Other methods
    public boolean isThereEnoughSlots(Item item){

        if(availableSlots >= item.getRequiredSlots())
            return true;
        else
            return false;

    }

}
