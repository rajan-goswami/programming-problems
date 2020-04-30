package org.helios.epi.chapter5.problem9;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.helios.epi.chapter5.problem8.DigitsReverser;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PalindromeChecker {
  public static boolean isPalindromeNumber(long x) {
    if (x < 0) {
      return false;
    }

    long reverse = DigitsReverser.reverse(x);
    return Long.compare(reverse, x) == 0;
  }
}
