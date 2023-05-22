package pawtropolis.game.command.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pawtropolis.game.GameController;
@Component
public class LookCommand extends Command {
    @Autowired
    public LookCommand(GameController gameController) {
        super(gameController);
    }
    @Override
    public boolean execute() {
        gameController.getCurrentRoom().getDescription();
        return true;
    }
    @Override
    public String getTriggerName() {
        return "look";
    }
}
