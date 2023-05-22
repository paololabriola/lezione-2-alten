package pawtropolis.game.command.domain;

import pawtropolis.game.GameController;

public abstract class Command {
    protected final GameController gameController;
    protected Command(GameController gameController) {
        this.gameController = gameController;
    }
    public abstract boolean execute();
    public abstract String getTriggerName();
}
