package pawtropolis.game.command.domain;

import pawtropolis.game.GameController;

public class UnknownCommand extends  Command {
    public UnknownCommand(GameController gameController) {
        super(gameController);
    }
    @Override
    public void execute() {
        System.out.println("Unknown command");
    }
    @Override
    public String getTriggerName() {
        return null;
    }
}
