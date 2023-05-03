package pawtropolis.game.command.domain;

import pawtropolis.game.GameController;
import pawtropolis.game.model.implementation.Item;

public class GetCommand extends ParametrizedCommand {
    public GetCommand(GameController gameController) {
        super(gameController);
    }

    public GetCommand(GameController gameController, String parameter) {
        super(gameController, parameter);
    }
    @Override
    protected void execute() {
        String itemName = parameter;
        Item item = gameController.getCurrentRoom().findItemByName(itemName);
        if(item != null) {
            gameController.getPlayer().pickupItem(item);
            gameController.getCurrentRoom().removeItem(item);
        } else {
            System.out.println("Item not found in current room.");
        }
    }
    @Override
    public String getTriggerName() {
        return "get";
    }
}
