package org.helios.epi.chapter6.problem5;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DuplicatesRemoval {
  /**
   * Remove duplicates from sorted integer array. Remaining elements should be shifted left to fill
   * the emptied indices
   *
   * <p>Time Complexity O(n), Space Complexity O(1)
   *
   * @param numberArray
   * @return number of unique entries in array after removing duplicates
   */
  public static int removeRepeatedFromSorted(int[] numberArray) {
    if (numberArray.length == 0) {
      return 0;
    }

    int writeIndex = 1;
    for (int i = 1; i < numberArray.length; ++i) {
      if (numberArray[i - 1] != numberArray[i]) {
        numberArray[writeIndex++] = numberArray[i];
      }
    }

    // Zero out remaining entries
    for (int i = writeIndex; i < numberArray.length; ++i) {
      numberArray[i] = 0;
    }

    return writeIndex;
  }
}
