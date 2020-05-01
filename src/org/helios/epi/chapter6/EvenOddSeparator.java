package org.helios.epi.chapter6;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EvenOddSeparator {
  /**
   * Reorder entries of number array such that even numbers appear firsts
   *
   * <p>Partition the array into 3 - Even, Unclassified & Odd and then iterate to move elements into
   * respective partition. Time Complexity O(n), Space Complexity O(1)
   *
   * @param a input array
   */
  public static void separate(int[] a) {
    if (a == null) {
      return;
    }

    int nextEven = 0;
    int nextOdd = a.length - 1;

    while (nextEven < nextOdd) {
      if (a[nextEven] % 2 == 0) {
        nextEven++;
      } else {
        int temp = a[nextEven];
        a[nextEven] = a[nextOdd];
        a[nextOdd--] = temp;
      }
    }
  }
}
