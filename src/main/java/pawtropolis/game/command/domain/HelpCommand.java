package pawtropolis.game.command.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pawtropolis.game.GameController;
@Component
public class HelpCommand extends Command {
    @Autowired
    public HelpCommand(GameController gameController) {
        super(gameController);
    }
    @Override
    public boolean execute() {
        System.out.println("The possible commands are: bag, look, go <direction>, get <item>, drop <item>, exit.");
        return true;
    }
    @Override
    public String getTriggerName() {
        return "help";
    }
}
