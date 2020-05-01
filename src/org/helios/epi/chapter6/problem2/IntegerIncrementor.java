package org.helios.epi.chapter6.problem2;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

// Increment arbitrary-precision integer
// Digits of integer is represented by array or List with each element representing single digit
// E.g. Integer 128 -> [1,2,3]
// E.g. Integer -128 -> [-1, 2, 8]
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IntegerIncrementor {
  /**
   * Perform increment by 1 to arbitrary-precision positive/negative number
   *
   * <p>Time complexity - O(n), Space complexity O(1)
   *
   * @param number Arbitrary precision number, Do not supply unmodifiable list
   */
  public static void plusOne(List<Integer> number) {
    if (number.get(0) < 0) {
      plusOneNegative(number);
    } else {
      plusOnePositive(number);
    }
    return;
  }

  private static void plusOnePositive(List<Integer> number) {
    int n = number.size() - 1;
    number.set(n, number.get(n) + 1);
    for (int i = n; i > 0 && number.get(i) == 10; i--) {
      number.set(i, 0);
      number.set(i - 1, number.get(i - 1) + 1);
    }

    // Case for carry in MSB
    if (number.get(0) == 10) {
      number.set(0, 0);
      number.add(0, 1); // Add carry at 0th index
    }
    return;
  }

  // Examples:
  //
  // -20 + 1 = -19
  //
  // -200 + 1 = -199
  //
  // -206 + 1 = -205
  //
  // -2010 + 1 = -2009
  //
  // -1000 + 1 = -999
  private static void plusOneNegative(List<Integer> number) {
    int n = number.size() - 1;

    number.set(0, Math.abs(number.get(0)));
    number.set(n, number.get(n) == 0 ? 10 : number.get(n) - 1);

    // Iterations covering cases for borrow
    for (int i = n; (i > 0) && number.get(i) == 10; i--) {
      number.set(i, 9);
      if (number.get(i - 1) == 0) {
        number.set(i - 1, 10);
      } else {
        number.set(i - 1, number.get(i - 1) - 1);
      }
    }

    // Case for borrow at most significant digit
    if (number.get(0) == 0 && n > 0) {
      number.remove(0);
    }
    // Change sign back to negative for most significant digit
    if (number.get(0) > 0) {
      number.set(0, -1 * number.get(0));
    }
    return;
  }
}
