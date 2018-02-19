package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
       return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();


    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
       StringBuilder reverse = new StringBuilder(str);
       return reverse.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder reversed = new StringBuilder(str);
        String newReversed = reversed.reverse().toString();
        return newReversed.substring(0, 1).toUpperCase() + newReversed.substring(1).toLowerCase();
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] charString = str.toCharArray();
        for (int i = 0; i < charString.length; i++){

            if (Character.isUpperCase(charString[i])){
                charString[i] = Character.toLowerCase(charString[i]);
            }
            else if (Character.isLowerCase(charString[i])){
                charString[i] = Character.toUpperCase(charString[i]);
            }
        }
        return new String(charString);
    }
}
