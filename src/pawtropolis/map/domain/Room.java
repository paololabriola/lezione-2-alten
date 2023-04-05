package pawtropolis.map.domain;

import pawtropolis.game.model.abstractation.Entity;
import pawtropolis.game.model.implementation.Item;

import java.util.*;

public class Room {

    //Attributes
    private String name;
    private Collection<Item> items;
    private Collection<? extends Entity> npcs;
    private Map<Direction, Room> linkedRooms;

    //Constructor

    public Room(String name, Collection<Item> items, Collection<? extends Entity> npcs) {

        this.name = name;
        this.items = items;
        this.npcs = npcs;
        this.linkedRooms = new EnumMap<>(Direction.class);

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

    public Collection<? extends Entity> getNpcs() {
        return npcs;
    }

    public void setNpcs(Collection<? extends Entity> npcs) {
        this.npcs = npcs;
    }

    public Map<Direction, Room> getLinkedRooms() {
        return linkedRooms;
    }

    public void setLinkedRooms(Map<Direction, Room> linkedRooms) {
        this.linkedRooms = linkedRooms;
    }

    //Other methods
    public void removeItem(String itemName) {

        Item item = findItemByName(itemName);

        if(items.remove(item))
            System.out.println("Item successfully removed from the room.");
        else
            System.out.println("The item is not in the room.");

    }

    public void addItem(Item item) {

        items.add(item);
        System.out.println("Item successfully added from the room.");

    }

    public Item findItemByName(String itemName) {

        for (Item item : items) {

            if (item.getName().equals(itemName))
                return item;

        }

        System.out.println("Item not found in the Room.");
        return null;

    }

    public void showItems() {

        Iterator<Item> itemsIterator = items.iterator();

        if(items.isEmpty()) {

            System.out.println("There is no item in the Room.");

        } else {

            while(itemsIterator.hasNext()) {

                System.out.print(itemsIterator.next().getName());

                if(itemsIterator.hasNext()) {
                    System.out.print(", ");
                }

            }

            System.out.println(".");

        }

    }

    public void showNPCs() {

        Iterator<? extends Entity> npcsIterator = npcs.iterator();

        if(npcs.isEmpty()) {

            System.out.println("There is no NPC in the room.");

        }  else {

            while(npcsIterator.hasNext()) {

                System.out.print(npcsIterator.next().getName());

                if(npcsIterator.hasNext()) {
                    System.out.print(", ");
                }

            }

            System.out.println(".");

        }

    }

    public void getRoomDescription() {

        System.out.println("You are in " + name + ".");

        System.out.println("Items: ");
        showItems();

        System.out.println("NPC: ");
        showNPCs();

    }

    public void linkRoom(Direction direction, Room room) {
        linkedRooms.put(direction, room);
        room.linkedRooms.put(direction.getOppositeDirection(), this);
    }

    public void unlinkRoom(Direction direction) {
        Room linkedRoom = linkedRooms.get(direction);
        if (linkedRoom != null) {
            linkedRoom.linkedRooms.remove(direction.getOppositeDirection());
            linkedRooms.remove(direction);
        }
    }

    public Room getLinkedRoom(Direction direction) {
        return linkedRooms.get(direction);
    }

}

