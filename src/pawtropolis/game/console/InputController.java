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

       char[] inputToChar = input.toCharArray();
       char[] command = new char[inputToChar.length];
       int count = 0;

        for(char c: inputToChar) {

            if(c == ' ')
                break;
            else {

                command[count] = c;
                count++;

            }

        }

        return Arrays.toString(command);

    }

    public static String getCommandObjectFromString(String input) {

        String[] inputStrings = input.split(" ");

        return inputStrings[1];

    }

}
