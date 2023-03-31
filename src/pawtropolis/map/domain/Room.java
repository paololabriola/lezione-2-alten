package pawtropolis.map.domain;

import pawtropolis.game.model.implementation.Item;
import pawtropolis.zoo.model.abstractation.Animal;

import java.util.Collection;

public class Room {

    //Attributes
    private String name;
    private Collection<Item> items;
    private Collection<Animal> animals;

    //Constructor

    public Room(String name, Collection<Item> items, Collection<Animal> animals) {

        this.name = name;
        this.items = items;
        this.animals = animals;

    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Item> getItems() {
        return items;
    }

    public void setItems(Collection<Item> items) {
        this.items = items;
    }

    public Collection<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Collection<Animal> animals) {
        this.animals = animals;
    }

    //Other methods
    public void removeItem(Item item) {

        if(!items.remove(item))
            System.out.println("The item is not in the room.");

    }

}
