package org.helios.epi.chapter5.problem1;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ParityCalculator {

  /**
   * Calculate parity.
   *
   * <p>Time Complexity O(k) where k is number of set bits in a given number n
   *
   * @param x
   * @return
   */
  public static short calculateParity(long x) {
    short result = 0;
    while (x != 0) {
      result ^= 1;
      x &= (x - 1); // Drops the lowest set bit of x
    }
    return result;
  }
}
