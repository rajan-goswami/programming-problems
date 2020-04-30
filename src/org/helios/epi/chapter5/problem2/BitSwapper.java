package org.helios.epi.chapter5.problem2;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BitSwapper {

  /**
   * Swap ith & jth bits of a number x
   *
   * <p>Time complexity O(1)
   *
   * @param x long number
   * @param i bit position
   * @param j bit position
   * @return Number after swapping bits
   */
  public static long swapBits(long x, int i, int j) {
    // Check if ith & jth bit differ
    if (((x >>> i) & 1) != ((x >>> j) & 1)) {
      // In order to swap differing ith & jth bits, perform flip operation
      long bitMask = (1L << i) | (1L << j);
      x ^= bitMask;
    }
    return x;
  }
}
