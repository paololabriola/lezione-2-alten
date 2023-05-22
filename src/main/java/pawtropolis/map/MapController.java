package pawtropolis.map;

import org.springframework.stereotype.Component;
import pawtropolis.game.model.implementation.Item;
import pawtropolis.map.model.Direction;
import pawtropolis.map.model.Room;
import pawtropolis.zoo.model.implementation.Tiger;

import java.util.ArrayList;
import java.util.List;

@Component
public class MapController {
    private Room currentRoom;
    private MapController() {
        currentRoom = createMap();
    }
    public Room getCurrentRoom() {
        return currentRoom;
    }
    public boolean changeRoom(Direction direction) {
        Room nextRoom = currentRoom.getLinkedRoom(direction);
        if (nextRoom != null) {
            currentRoom = nextRoom;
            return true;
        }
        return false;
    }
    private static Room createMap() {
        Room entrance = new Room("Zoo Entrance");
        Room garden = new Room("Northern garden");
        garden.addItem(new Item("sword", "A long sword", 5));
        entrance.linkRoom(Direction.NORTH, garden);

        Room tigerExhibit = new Room("Tiger exhibit");
        tigerExhibit.addItem(new Item("shield", "A rounded wooden shield", 5));
        tigerExhibit.linkRoom(Direction.EAST, garden);
        Tiger tiger1 = new Tiger("Tigro", 10, "Honey", 3, 100.00, 1.50, 1.0);
        List<Tiger> tigers = new ArrayList<>();
        tigers.add(tiger1);
        tigerExhibit.setNpcs(tigers);

        return entrance;
    }
}
