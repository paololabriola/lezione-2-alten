package pawtropolis.game.command.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pawtropolis.game.GameController;
import pawtropolis.map.model.Direction;
@Component
public class GoCommand extends ParametrizedCommand {
    @Autowired
    public GoCommand(GameController gameController) {
        super(gameController);
    }
    @Override
    public boolean execute() {
        if(!super.execute()) {
            return false;
        }
        try {
            Direction direction = Direction.valueOf(parameter.toUpperCase());
            if(gameController.changeRoom(direction)) {
                System.out.println("Moving to " + direction.getName() + " room: " + gameController.getCurrentRoom().getName());
                gameController.getCurrentRoom().getDescription();
            } else {
                System.out.println("There is no room in that direction.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("You must select a valid direction.");
        }
        return true;
    }
    @Override
    public String getTriggerName() {
        return "go";
    }
}
