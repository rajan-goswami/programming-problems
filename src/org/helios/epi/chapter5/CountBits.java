package org.helios.epi.chapter5;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CountBits {
  /**
   * Count set bits in a given number
   *
   * <p>Time Complexity O(n), where n is word size
   *
   * @param x
   * @return set bit count
   */
  public static short countBits(long x) {
    short numBits = 0;
    while (x != 0) {
      numBits += x & 1;
      x >>>= 1;
    }
    return numBits;
  }
}
