package pawtropolis.game;

import pawtropolis.game.command.CommandFactory;
import pawtropolis.game.command.domain.Command;
import pawtropolis.game.console.InputController;
import pawtropolis.game.model.implementation.Player;
import pawtropolis.map.MapController;
import pawtropolis.map.model.Direction;
import pawtropolis.map.model.Room;

import lombok.Getter;

public class GameController {

    //Attributes
    private static GameController instance;
    private final MapController mapController;
    private boolean gameEnded;
    @Getter
    private Player player;

    //Constructor
    private GameController() {
        this.mapController = new MapController();
        this.gameEnded = false;
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public Room getCurrentRoom() {
        return mapController.getCurrentRoom();
    }

    //Other methods
    public boolean changeRoom(Direction direction) {
        return mapController.changeRoom(direction);
    }
    public void exitGame() {
        this.gameEnded = true;
    }
    public void runGame() {
        CommandFactory commandFactory = CommandFactory.getInstance();

        System.out.println("Welcome to Pawtropolis OwO\n");
        System.out.println("Insert player's name: ");
        String playerName = InputController.readString();
        player = new Player(playerName, 20);

        while(!gameEnded) {
            System.out.println("What are you going to do " + playerName + "?");
            System.out.print(">");

            String input = InputController.readString();
            Command command = commandFactory.makeCommandFromString(input);
            command.run();
        }
    }
}
