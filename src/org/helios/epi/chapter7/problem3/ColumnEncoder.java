package org.helios.epi.chapter7.problem3;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.lang.reflect.MalformedParametersException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ColumnEncoder {
  /**
   * Encode spreadsheet column into number e.g. A -> 1, ZZ -> 702
   *
   * <p>Time Complexity - O(n), Space Complexity O(1)
   *
   * @param column Spreadsheet column name
   * @return encoded number
   */
  public static long encodeSpreadsheetColumn(String column) {
    long result = 0;

    // To perform calculation considering Upper case
    column = column.toUpperCase();

    for (int i = 0; i < column.length(); ++i) {
      char code = (char) (column.charAt(i) - 'A');
      if (code < 0 || code > 26) {
        throw new MalformedParametersException("Invalid spreadsheet column name provided");
      }

      result = (result * 26) + code + 1;
    }
    return result;
  }
}
