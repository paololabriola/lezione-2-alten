package pawtropolis.game.command.domain;

import pawtropolis.game.GameController;

public class BagCommand extends Command{
    public BagCommand(GameController gameController) {
        super(gameController);
    }
    @Override
    protected void execute() {
        gameController.getPlayer().showItemsInBag();
    }

    @Override
    public String getTriggerName() {
        return "bag";
    }
}
