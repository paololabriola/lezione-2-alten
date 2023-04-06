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

                    if(commandObject != null) {

                        try {

                            Direction direction = Direction.valueOf(commandObject.toUpperCase());
                            Room nextRoom = currentRoom.getLinkedRoom(direction);
                            if (nextRoom != null) {
                                System.out.println("Moving to " + direction.getName() + " room: " + nextRoom.getName());
                                nextRoom.getRoomDescription();
                                currentRoom = nextRoom;
                            } else {
                                System.out.println("There is no room in that direction.");
                            }

                        } catch (IllegalArgumentException e) {
                            System.out.println("You must select a valid direction.");
                        }

                    }else
                        System.out.println("You must select a direction.");

                }

                case "bag" -> player.getBag().showItems();

                case "look" -> currentRoom.getRoomDescription();

                case "get" -> {

                    if(commandObject != null) {

                        if(player.pickupItem(currentRoom.findItemByName(commandObject)))
                            currentRoom.removeItem(commandObject);

                    } else
                        System.out.println("You must select an item.");

                }

                case "drop" -> {

                    if(commandObject != null) {

                        Item droppedItem = player.dropItem(commandObject);

                        if(droppedItem != null)
                            currentRoom.addItem(droppedItem);

                    } else
                        System.out.println("You must select an item.");

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
