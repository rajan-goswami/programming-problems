package org.helios.epi.chapter7.problem6;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WordsReversal {
  /**
   * Reverses words in a string E.g. "Alice likes Bob" -> "Bob likes Alice"
   *
   * <p>Time Complexity - O(n), Space Complexity O(1)
   *
   * @param input
   */
  public static void reverseWords(char[] input) {
    // Reverse whole string first
    reverse(input, 0, input.length - 1);

    int start = 0, end;
    while ((end = findChar(input, ' ', start)) != -1) {
      // Reverse each word
      reverse(input, start, end - 1);
      start = end + 1;
    }

    // Last word case
    reverse(input, start, input.length - 1);
  }

  private static void reverse(char[] input, int startIndex, int endIndex) {
    if (startIndex >= endIndex) {
      return;
    }

    while (startIndex < endIndex) {
      char temp = input[startIndex];
      input[startIndex] = input[endIndex];
      input[endIndex] = temp;
      startIndex++;
      endIndex--;
    }
  }

  private static int findChar(char[] chars, char c, int start) {
    while (start < chars.length) {
      if (chars[start] == c) {
        return start;
      }
      start++;
    }
    return -1;
  }
}
