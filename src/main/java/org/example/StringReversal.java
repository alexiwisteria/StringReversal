package org.example;

/**
 * The StringReversal class provides methods to manipulate strings by splitting them into arrays,
 * reversing the array using recursion, and converting the array back into a string.
 * <p>
 * This process consists of three main steps:
 * 1. Splitting a given string into an array of words.
 * 2. Reversing the array using a recursive method.
 * 3. Joining the reversed array back into a single string.
 * </p>
 * <p>
 * Note: The overall logic for this method is my own. However, assistance with refining some
 * syntax was provided by ChatGPT, an AI language model. Comments were generated with the
 * assistance of ChatGPT, and then reviewed and edited.
 * </p>
 *
 */
public class StringReversal {

    /**
     * Converts the input string into an array of words.
     * The method trims any leading or trailing whitespace and splits the string based on
     * one or more spaces between words.
     *
     * @param input The string to be converted into an array.
     * @return An array of words from the input string.
     *
     * @implNote We use `trim()` to remove unnecessary whitespace at the start or end,
     * and `split("\\s+")` ensures the string is split by any amount of whitespace between words.
     */
    public static String[] stringToArray(String input) {
        return input.trim().split("\\s+");
    }

    /**
     * Recursively reverses the array of words in place.
     * This method swaps the words at the start and end indexes, and then makes a recursive call
     * to handle the sub-array by incrementing the start index and decrementing the end index.
     *
     * @param words The array of words to be reversed.
     * @param start The starting index (initially 0).
     * @param end   The ending index (initially words.length - 1).
     *
     * @implNote The base case for the recursion occurs when the start index is greater than or equal
     * to the end index, meaning the entire array has been reversed.
     */
    public static void reverseArray(String[] words, int start, int end) {
        if (start >= end) {
            return;  // Base case: When start meets or exceeds end, the recursion stops.
        }
        // Swap the elements at the start and end.
        String temp = words[start];
        words[start] = words[end];
        words[end] = temp;

        // Recursive call to reverse the next part of the array.
        reverseArray(words, start + 1, end - 1);
    }

    /**
     * Converts the array of words back into a single string.
     * This method joins the elements of the array using a space separator, creating a single
     * string with words in their reversed order.
     *
     * @param words The array of words to be joined into a string.
     * @return A single string with all the words joined by spaces.
     *
     * @implNote The `String.join(" ", words)` efficiently combines the array elements with
     * a space between each word, returning the final result.
     */
    public static String arrayToString(String[] words) {
        return String.join(" ", words);
    }
}
