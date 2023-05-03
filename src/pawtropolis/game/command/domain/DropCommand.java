package pawtropolis.game.command.domain;

import pawtropolis.game.GameController;
import pawtropolis.game.model.implementation.Item;

public class DropCommand extends ParametrizedCommand {
    public DropCommand(GameController gameController) {
        super(gameController);
    }
    public DropCommand(GameController gameController, String parameter) {
        super(gameController, parameter);
    }

    @Override
    protected void execute() {
            Item droppedItem = gameController.getPlayer().dropItem(parameter);
            if(droppedItem != null) {
                gameController.getCurrentRoom().addItem(droppedItem);
            } else {
                System.out.println("Item not present in bag.");
            }
    }
    @Override
    public String getTriggerName() {
        return "drop";
    }
}
