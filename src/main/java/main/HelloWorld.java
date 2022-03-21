package main;

import org.apache.commons.lang3.StringUtils;
import util.Input;

public class HelloWorld {
    public static void main(String[] args) {
        String userInput = Input.getString("Please enter a string");

        System.out.println("Is this a number?");
        System.out.println(StringUtils.isNumeric(userInput));
        System.out.println("Your input case swapped");
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println("Your input reversed");
        System.out.println(StringUtils.reverse(userInput));
    }
}
