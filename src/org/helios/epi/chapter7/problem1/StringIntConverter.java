package org.helios.epi.chapter7.problem1;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.lang.reflect.MalformedParametersException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StringIntConverter {
  /**
   * Convert an integer into String
   *
   * @param number Positive/Negative number
   * @return String
   */
  public static String intToString(int number) {
    boolean isNegative = number < 0 ? true : false;

    StringBuilder b = new StringBuilder();
    do {
      b.append((char) ('0' + Math.abs(number % 10)));
      number /= 10;
    } while (number != 0);

    if (isNegative) {
      b.append('-');
    }

    b.reverse();
    return b.toString();
  }

  /**
   * Convert a String into integer
   *
   * @param numberStr String of digits
   * @return integer
   */
  public static int stringToInt(String numberStr) {
    int result = 0;
    for (int i = numberStr.charAt(0) == '-' ? 1 : 0; i < numberStr.length(); ++i) {
      final int digit = numberStr.charAt(i) - '0';
      if (digit < 0 || digit > 9) {
        throw new MalformedParametersException("Invalid number string provided");
      }
      result = result * 10 + digit;
    }
    return numberStr.charAt(0) == '-' ? -result : result;
  }
}
