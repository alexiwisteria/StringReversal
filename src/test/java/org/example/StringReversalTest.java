package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains unit tests for the StringReversal class methods:
 * 1. stringToArray() - Converts a string to an array of words.
 * 2. reverseArray() - Reverses the array of words in place.
 * 3. arrayToString() - Converts an array of words back into a single string.
 */
class StringReversalTest {

    /**
     * Tests the stringToArray method, which converts a string into an array of words.
     * Verifies that the method correctly splits the string into words and handles different input cases.
     */
    @Test
    void stringToArray() {
        // Test case 1: A regular sentence split into words
        String input = "Alexis is a good student";
        String[] expected = {"Alexis", "is", "a", "good", "student"};

        assertArrayEquals(expected, StringReversal.stringToArray(input),
                "The string should be correctly split into an array of words.");

        // Test case 2: Single word input
        String singleWord = "Hello";
        String[] expectedSingle = {"Hello"};

        assertArrayEquals(expectedSingle, StringReversal.stringToArray(singleWord),
                "The string with one word should return an array with one element.");
    }

    /**
     * Tests the reverseArray method, which reverses the order of words in the array in place.
     * Verifies that the method correctly reverses the entire array and handles single-element arrays.
     */
    @Test
    void reverseArray() {
        // Test case 1: Reverse a full array of words
        String[] inputArray = {"Alexis", "is", "a", "good", "student"};
        String[] expectedReversed = {"student", "good", "a", "is", "Alexis"};

        // Call reverseArray method to reverse the array
        StringReversal.reverseArray(inputArray, 0, inputArray.length - 1);

        assertArrayEquals(expectedReversed, inputArray,
                "The array should be reversed in place.");

        // Test case 2: Reverse an array with one element
        String[] singleElementArray = {"Hello"};
        String[] expectedSingle = {"Hello"};

        // Reverse should do nothing in this case
        StringReversal.reverseArray(singleElementArray, 0, singleElementArray.length - 1);

        assertArrayEquals(expectedSingle, singleElementArray,
                "An array with one element should remain unchanged.");
    }

    /**
     * Tests the arrayToString method, which converts an array of words back into a single string.
     * Verifies that the method correctly handles normal arrays and single-element arrays.
     */
    @Test
    void arrayToString() {
        // Test case 1: Convert a reversed array back to a string
        String[] inputArray = {"student", "good", "a", "is", "Alexis"};
        String expectedString = "student good a is Alexis";

        assertEquals(expectedString, StringReversal.arrayToString(inputArray),
                "The array should be correctly converted back to a string.");

        // Test case 2: Convert a single-element array to a string
        String[] singleElementArray = {"Hello"};
        String expectedSingle = "Hello";

        assertEquals(expectedSingle, StringReversal.arrayToString(singleElementArray),
                "A single-element array should be correctly converted to a string.");
    }
}
