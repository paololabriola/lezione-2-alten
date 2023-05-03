package pawtropolis.game.command;

import pawtropolis.game.GameController;
import pawtropolis.game.command.domain.Command;
import pawtropolis.game.command.domain.ParametrizedCommand;
import pawtropolis.game.command.domain.UnknownCommand;
import pawtropolis.game.util.ClassLoaderUtils;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CommandFactory {
    private static final String COMMANDS_PACKAGE = "pawtropolis.game.command.domain";
    private static CommandFactory instance;
    private final Map<String, Command> commands;
    private CommandFactory() {
        Set<Class<? extends Command>> commandsClasses = ClassLoaderUtils.findAllClassesInPackageBySuperType(COMMANDS_PACKAGE, Command.class);
        GameController gameController = GameController.getInstance();
        commands = commandsClasses.stream()
                .map(c -> ClassLoaderUtils.makeInstanceFromClass(c, gameController))
                .filter(Predicate.not(Objects::isNull))
                .collect(Collectors.toMap(Command::getTriggerName, Function.identity()));
    }
    public static CommandFactory getInstance() {
        if (instance == null) {
            instance = new CommandFactory();
        }
        return instance;
    }
    public Command makeCommandFromString(String input) {
        String[] inputStrings = input.split(" ");
        Command command = commands.get(inputStrings[0].toLowerCase());
        if (command == null) {
            return new UnknownCommand(GameController.getInstance());
        }
        if (command instanceof ParametrizedCommand) {
            ((ParametrizedCommand) command).setParameters(inputStrings[1].toLowerCase());
        }
        return command;
    }
}
