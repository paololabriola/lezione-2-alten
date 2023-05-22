package pawtropolis.game.command.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pawtropolis.game.GameController;
import pawtropolis.game.model.implementation.Item;
@Component
public class GetCommand extends ParametrizedCommand {
    @Autowired
    public GetCommand(GameController gameController) {
        super(gameController);
    }

    @Override
    public boolean execute() {
        if(!super.execute()) {
            return false;
        }
        String itemName = parameter;
        Item item = gameController.getCurrentRoom().findItemByName(itemName);
        if(item != null) {
            gameController.getPlayer().pickupItem(item);
            gameController.getCurrentRoom().removeItem(item);
        } else {
            System.out.println("Item not found in current room.");
        }
        return true;
    }
    @Override
    public String getTriggerName() {
        return "get";
    }
}
