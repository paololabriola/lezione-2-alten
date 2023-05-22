package pawtropolis.game.command.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pawtropolis.game.GameController;
@Component
public class UnknownCommand extends  Command {
    @Autowired
    public UnknownCommand(GameController gameController) {
        super(gameController);
    }
    @Override
    public boolean execute() {
        System.out.println("The command does not exist.");
        return true;
    }
    @Override
    public String getTriggerName() {
        return null;
    }
}
