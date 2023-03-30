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

}
