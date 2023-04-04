package pawtropolis.game.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputController {

    private InputController() {
    }

    public static String readString() {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader inputReader = new BufferedReader(input);
        try {

            return inputReader.readLine();

        } catch (IOException e) {

            System.err.println("Error while reading user input");
            return "";

        }

    }

    public static String getCommandFromString(String input) {

        String[] inputStrings = input.split(" ");

        return inputStrings[0];

    }

    public static String getCommandObjectFromString(String input) {

        String[] inputStrings = input.split(" ");

        return inputStrings[1];

    }

}
