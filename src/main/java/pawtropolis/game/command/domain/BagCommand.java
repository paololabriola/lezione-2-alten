package pawtropolis.game.command.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pawtropolis.game.GameController;
@Component
public class BagCommand extends Command{
    @Autowired
    public BagCommand(GameController gameController) {
        super(gameController);
    }
    @Override
    public boolean execute() {
        gameController.getPlayer().showItemsInBag();
        return true;
    }
    @Override
    public String getTriggerName() {
        return "bag";
    }
}