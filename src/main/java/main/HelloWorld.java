package main;

import org.apache.commons.lang3.StringUtils;
import util.Input;

public class HelloWorld {
    public static void main(String[] args) {
        String userInput = Input.getString("Please enter something");

        System.out.printf("You entered: \"%s\".\n", userInput);
        if (!StringUtils.isNumeric(userInput)) {
            System.out.printf("\"%s\" is not a number.\n", userInput);
        } else {
            System.out.printf("\"%s\" is a number.\n", userInput);
        }

        System.out.printf("Flipped Case: \"%s\".\n", StringUtils.swapCase(userInput));
        System.out.printf("Reversed: \"%s\".\n", StringUtils.reverse(userInput));


    }
}
