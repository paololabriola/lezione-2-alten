package pawtropolis.game.model.implementation;

import java.util.Collection;
import java.util.Iterator;

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

        return availableSlots >= item.getRequiredSlots();

    }

    public void addItem(Item item) {

        if(isThereEnoughSlots(item)) {

            items.add(item);
            availableSlots -= item.getRequiredSlots();
            System.out.println("Item successfully added to the bag.");

        } else
            System.out.println("Bag is full, the item couldn't be added to the inventory.");

    }

    public void removeItem(Item item) {

        if(items.remove(item)) {

            availableSlots += item.getRequiredSlots();
            System.out.println("Item successfully removed from the bag.");

        } else
            System.out.println("Item not found in bag.");

    }

    public void showItems() {

        Iterator<Item> itemsIterator = items.iterator();

        if(items.isEmpty()) {

            System.out.println("The bag is Empty.");

        } else {

            System.out.println("The bag contains following items: ");
            while(itemsIterator.hasNext()) {

                System.out.println(itemsIterator.next().getName() + ", ");

            }
            System.out.println(itemsIterator.next().getName() + ".");

        }


    }

}
