package pawtropolis.game.command.domain;

import pawtropolis.game.GameController;

public class HelpCommand extends Command {
    public HelpCommand(GameController gameController) {
        super(gameController);
    }
    @Override
    public void execute() {
        System.out.println("The possible commands are: bag, look, go <direction>, get <item>, drop <item>, exit.");
    }
    @Override
    public String getTriggerName() {
        return "help";
    }
}
