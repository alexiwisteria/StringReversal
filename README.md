# Code Challenge: String Reversal

### Challenge Overview
This code challenge involves reversing the order of words in a sentence. The solution requires converting the input string into an array of words, reversing the array, and then converting it back into a string. The purpose of this challenge is to demonstrate the ability to manipulate strings and arrays, as well as work with recursion and iterative solutions.

### Challenge Breakdown:
- **Input**: A sentence as a string (e.g., `"Alexis is a good student"`).
- **Output**: The sentence with the words reversed (e.g., `"student good a is Alexis"`).

### Solution Approach

#### Steps to Solve:
1. **Convert String to Array**:
   The first step splits the string into an array of words using spaces as delimiters.

2. **Reverse the Array**:
   The array of words is reversed in place, ensuring that the order of words is swapped correctly.

3. **Convert Array Back to String**:
   The final step joins the reversed array of words back into a single string.

### Knowledge Demonstrated:

- **String Manipulation**:
  Demonstrated the ability to break down a sentence into individual components (words) and recombine them. This is fundamental in working with text data.

- **Array Operations**:
  Reversed an array in place using a two-pointer technique. This shows understanding of basic data structures and their manipulation.

- **Problem Solving**:
  This challenge showcases structured problem-solving skills. Breaking down a complex problem (reversing a sentence) into smaller, manageable parts (array conversion, reversal, and reassembly) is key in software development.

---

### Code Implementation

```java
package org.example;

public class Main {

    public static void main(String[] args) {
        String input = "Alexis is a good student";

        // Step 1: Convert the input string into an array of words
        String[] wordsArray = StringReversal.stringToArray(input);
        
        // Step 2: Reverse the array of words
        StringReversal.reverseArray(wordsArray, 0, wordsArray.length - 1);
        
        // Step 3: Convert the reversed array back to a single string
        String reversedString = StringReversal.arrayToString(wordsArray);

        // Output the final result
        System.out.println(reversedString);
    }
}
```

### Explanation of Methods

1. **`stringToArray(String str)`**:
    - Converts the input string to an array of words.
    - Uses Java's `split()` method, which shows familiarity with core string operations.

2. **`reverseArray(String[] array, int start, int end)`**:
    - Reverses the array of words in place by swapping elements.
    - Demonstrates understanding of basic algorithms (two-pointer technique) and memory-efficient operations.

3. **`arrayToString(String[] array)`**:
    - Reassembles the words into a single string by joining them with spaces.
    - Demonstrates the ability to work with array-to-string transformations, an important aspect in many real-world applications.

---

### Testing

The solution was rigorously tested using **JUnit 5** to ensure correctness. The tests verified:
- Proper splitting of strings into arrays.
- Accurate reversal of the word order in the array.
- Correct conversion of the reversed array back to a sentence.

#### Sample Tests
```java
@Test
void stringToArray() {
    String input = "Alexis is a good student";
    String[] expected = {"Alexis", "is", "a", "good", "student"};
    assertArrayEquals(expected, StringReversal.stringToArray(input));
}

@Test
void reverseArray() {
    String[] inputArray = {"Alexis", "is", "a", "good", "student"};
    String[] expectedReversed = {"student", "good", "a", "is", "Alexis"};
    StringReversal.reverseArray(inputArray, 0, inputArray.length - 1);
    assertArrayEquals(expectedReversed, inputArray);
}

@Test
void arrayToString() {
    String[] inputArray = {"student", "good", "a", "is", "Alexis"};
    String expected = "student good a is Alexis";
    assertEquals(expected, StringReversal.arrayToString(inputArray));
}
```

---

### Skills Demonstrated

1. **Core Java Programming**:
    - Use of fundamental Java constructs like arrays, strings, and loops to manipulate data.
    - Familiarity with Java standard library functions (like `split()` and `join()`).

2. **Algorithm Design**:
    - Demonstrated knowledge of reversing an array using an efficient two-pointer approach, which minimizes memory overhead.
    - Solving the problem in a step-by-step structured approach.

3. **Unit Testing**:
    - Implemented comprehensive unit tests using JUnit 5 to ensure the robustness of the solution.
    - Understanding of test-driven development principles to validate code correctness.

4. **Code Efficiency**:
    - The array reversal is done in-place, which means no additional memory is used for a new array. This is an example of space-efficient programming.

---

### Conclusion

This code challenge successfully demonstrates proficiency in:
- String manipulation.
- Array handling.
- Writing clean, modular code.
- Implementing testable solutions with JUnit.

The approach and solution reflect my ability to solve problems in a structured, efficient, and well-tested manner, all key qualities in software engineering.

---

Feel free to reach out if you have any questions or suggestions for further improvements!

---

### Contact
For inquiries or more information, please contact me via https://www.linkedin.com/in/alexisbinch/.

---
## Acknowledgments
Portions of the README content, Javadocs, and comments were generated with the assistance of [ChatGPT](https://chat.openai.com), an AI language model. The content was reviewed and edited to ensure accuracy and relevance.