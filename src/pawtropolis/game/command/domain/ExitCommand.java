package pawtropolis.game.command.domain;

import pawtropolis.game.GameController;

public class ExitCommand extends Command {
    public ExitCommand(GameController gameController) {
        super(gameController);
    }

    @Override
    protected void execute() {
        gameController.exitGame();
    }
    @Override
    public String getTriggerName() {
        return "exit";
    }
}
