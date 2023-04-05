package pawtropolis.game;

import pawtropolis.game.console.InputController;
import pawtropolis.game.model.implementation.Item;
import pawtropolis.game.model.implementation.Player;
import pawtropolis.map.domain.Direction;
import pawtropolis.map.domain.Room;

public class GameController {

    //Attributes
    private final Room entry;
    private final Player player;

    //Constructor
    public GameController(Room entry, Player player) {

        this.entry = entry;
        this.player = player;

    }

    //Other methods
    public void runGame() {

        Room currentRoom = entry;
        boolean gameEnded = false;

        while(!gameEnded) {

            String input;
            System.out.println("What are you going to do?");
            System.out.println("Type \"help\" to know the possible commands.");
            System.out.print(">");
            input = InputController.readString();
            String commandFromString = InputController.getCommandFromString(input);
            String commandObject = InputController.getCommandObjectFromString(input);

            switch (commandFromString) {

                case "go" -> {
                    assert commandObject != null;
                    Direction direction = Direction.valueOf(commandObject.toUpperCase());
                    Room nextRoom = currentRoom.getLinkedRoom(direction);
                    if (nextRoom != null) {
                        System.out.println("Moving to " + direction.getName() + " room: " + nextRoom.getName());
                        nextRoom.getRoomDescription();
                        currentRoom = nextRoom;
                    } else {
                        System.out.println("There is no room in that direction.");
                    }
                }

                case "bag" -> player.getBag().showItems();

                case "look" -> currentRoom.getRoomDescription();

                case "get" -> {
                    player.pickupItem(currentRoom.findItemByName(commandObject));
                    currentRoom.removeItem(commandObject);
                }

                case "drop" -> {
                    Item droppedItem = player.dropItem(commandObject);
                    currentRoom.addItem(droppedItem);
                }

                case "help" ->
                        System.out.println("Commands are: go <direction>, bag, look, get <item>, drop <item>, exit.");

                case "exit" -> gameEnded = true;

                default ->
                        System.out.println("Command \"" + commandFromString + "\" doesn't exist. Try again with an existing command.");

            }

        }

    }

}
