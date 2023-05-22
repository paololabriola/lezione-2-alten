package pawtropolis.game;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pawtropolis.game.command.CommandFactory;
import pawtropolis.game.command.domain.Command;
import pawtropolis.game.console.InputController;
import pawtropolis.game.model.implementation.Player;
import pawtropolis.map.MapController;
import pawtropolis.map.model.Direction;
import pawtropolis.map.model.Room;

@Component
public class GameController {
    private final MapController mapController;
    private boolean gameEnded;
    @Getter
    private Player player;
    @Autowired
    private GameController(MapController mapController) {
        this.mapController = mapController;
        this.gameEnded = false;
    }
    public Room getCurrentRoom() {
        return mapController.getCurrentRoom();
    }
    public boolean changeRoom(Direction direction) {
        return mapController.changeRoom(direction);
    }
    public void exitGame() {
        this.gameEnded = true;
    }
    public void runGame() {
        System.out.println("Welcome to Pawtropolis OwO");
        System.out.println("Insert player's name: ");
        String playerName = InputController.readString();
        player = new Player(playerName, 20);

        while(!gameEnded) {
            System.out.println("What are you going to do " + playerName + "?");
            System.out.print(">");

            String input = InputController.readString();
            Command command = CommandFactory.makeCommandFromString(input);
            command.execute();
        }
    }
}
