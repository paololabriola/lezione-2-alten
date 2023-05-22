package pawtropolis.game.command.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pawtropolis.game.GameController;
@Component
public class ExitCommand extends Command {
    @Autowired
    public ExitCommand(GameController gameController) {
        super(gameController);
    }

    @Override
    public boolean execute() {
        gameController.exitGame();
        return true;
    }
    @Override
    public String getTriggerName() {
        return "exit";
    }
}
