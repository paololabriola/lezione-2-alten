package pawtropolis.game.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pawtropolis.game.command.domain.Command;
import pawtropolis.game.command.domain.ParametrizedCommand;

import java.util.*;

@Component
public class CommandFactory {
    private static final Map<String, Command> commands = new HashMap<>();
    @Autowired
    private CommandFactory(List<Command> commandList) {
        commandList.forEach(command -> commands.put(command.getTriggerName(), command));
    }
    public static Command makeCommandFromString(String input) {
        String[] inputStrings = input.split(" ");
        Command command = commands.get(inputStrings[0].toLowerCase());
        if(command == null) {
            command = commands.get(null);
        }
        if (command instanceof ParametrizedCommand parametrizedCommand) {
            boolean hasParameter = inputStrings.length > 1 && inputStrings[1] != null;
            String parameter = hasParameter ? inputStrings[1].toLowerCase() : null;
            parametrizedCommand.setParameters(parameter);
        }
        return command;
    }
}
