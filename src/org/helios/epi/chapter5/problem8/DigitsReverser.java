package org.helios.epi.chapter5.problem8;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DigitsReverser {
  /**
   * Time complexity O(n)
   *
   * @param x input number
   * @return number having its digits in reverse order
   */
  public static long reverse(long x) {
    long result = 0;
    long xRemaining = Math.abs(x);
    while (xRemaining != 0) {
      result = result * 10 + xRemaining % 10;
      xRemaining /= 10;
    }
    return x < 0 ? -result : result;
  }
}
