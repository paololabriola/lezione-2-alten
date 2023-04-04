package pawtropolis.game;

import pawtropolis.game.console.InputController;
import pawtropolis.game.model.implementation.Player;
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
            System.out.println("Where are you going to go?");
            System.out.print(">");
            input = InputController.readString();
            String commandFromString = InputController.getCommandFromString(input);
            String commandObject = InputController.getCommandObjectFromString(input);

            switch (commandFromString) {

                default:
                    System.out.println("Command \"" + commandFromString + "\" doesn't exist. Try again with an existing command.");

                case "get":
                    currentRoom.removeItem(commandObject);
                    player.pickupItem(currentRoom.findItemByName(commandObject));

                case "exit":
                    gameEnded = true;
                    break;

            }

        }

    }

}
