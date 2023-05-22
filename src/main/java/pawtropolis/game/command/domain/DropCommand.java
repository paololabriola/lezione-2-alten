package pawtropolis.game.command.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pawtropolis.game.GameController;
import pawtropolis.game.model.implementation.Item;
@Component
public class DropCommand extends ParametrizedCommand {
    @Autowired
    public DropCommand(GameController gameController) {
        super(gameController);
    }
    @Override
    public boolean execute() {
        if(!super.execute()) {
            return false;
        }
            Item droppedItem = gameController.getPlayer().dropItem(parameter);
            if(droppedItem != null) {
                gameController.getCurrentRoom().addItem(droppedItem);
            } else {
                System.out.println("Item not present in bag.");
            }
            return true;
    }
    @Override
    public String getTriggerName() {
        return "drop";
    }
}
