package pawtropolis.game.command.domain;

import pawtropolis.game.GameController;

public class LookCommand extends Command {
    public LookCommand(GameController gameController) {
        super(gameController);
    }
    @Override
    protected void execute() {
        gameController.getCurrentRoom().getDescription();
    }
    @Override
    public String getTriggerName() {
        return "look";
    }
}
