package org.helios.epi.chapter6.problem5.variant1;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class KeyRemoval {
  /**
   * Remove all occurrences of keys from a given number array. Shift remaining entries left, and
   * zero out removed keys at the end
   *
   * <p>Time Complexity O(n), Space Complexity O(1)
   *
   * @param numberArray
   * @param key
   * @return Returns number of entries after removing keys
   */
  public static int removeKeyOccurrences(int[] numberArray, int key) {
    if (numberArray.length == 0) {
      return 0;
    }

    int writeIndex = 0;
    for (int i = 0; i < numberArray.length; ++i) {
      if (numberArray[i] != key) {
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
