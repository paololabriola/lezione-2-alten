package pawtropolis.game.command.domain;

import pawtropolis.game.GameController;

public abstract class ParametrizedCommand extends Command {
    protected String parameter;
    protected ParametrizedCommand(GameController gameController) {
        super(gameController);
        this.parameter = "";
    }
    protected ParametrizedCommand(GameController gameController, String parameter) {
        this(gameController);
        if (parameter != null) {
            this.parameter = parameter;
        }
    }
    public String getParameter() {
        return parameter;
    }
    public void setParameters(String parameter) {
        this.parameter = parameter;
    }

    @Override
    protected void execute() {
        if (parameter == null || parameter.isEmpty()) {
            System.out.println("Missing parameter for command.");
        }
    }
}
