package pawtropolis.game.command.domain;

import pawtropolis.game.GameController;
import pawtropolis.map.model.Direction;

public class GoCommand extends ParametrizedCommand {
    public GoCommand(GameController gameController) {
        super(gameController);
    }

    public GoCommand(GameController gameController, String parameter) {
        super(gameController, parameter);
    }

    @Override
    protected void execute() {
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

    }
    @Override
    public String getTriggerName() {
        return "go";
    }
}
