package org.helios.epi.chapter6.problem6.variant1;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LongestSubArray {
  /**
   * Variant: Write a program that takes an array of integers and finds the length of a longest
   * subarray all of whose entries are equal.
   *
   * <p>Time Complexity O(n), Space Complexity O(1)
   *
   * @param numberArray
   * @return Length of longest sub array length having equal entries
   */
  public static int lengthOfEqualEntries(int[] numberArray) {
    if (numberArray.length == 0) {
      return 0;
    }

    int longestLength = 1;
    int currentLength = 1;
    for (int i = 0; i < numberArray.length - 1; ++i) {
      if (numberArray[i] == numberArray[i + 1]) {
        currentLength++;
        longestLength = Math.max(longestLength, currentLength);
      } else {
        currentLength = 1;
      }
    }
    return longestLength;
  }
}
