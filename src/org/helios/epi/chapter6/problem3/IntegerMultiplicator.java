package org.helios.epi.chapter6.problem3;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IntegerMultiplicator {
  public static List<Integer> multiply(List<Integer> number1, List<Integer> number2) {
    final int sign = (number1.get(0) < 0) ^ (number2.get(0)) < 0 ? -1 : 1;

    // Perform multiplication as 2 positive integers
    number1.set(0, Math.abs(number1.get(0)));
    number2.set(0, Math.abs(number2.get(0)));

    List<Integer> result = new ArrayList<>(Collections.nCopies(number1.size() + number2.size(), 0));

    // Perform digit multiplication & addition at the same time in a single pass
    for (int i = number1.size() - 1; i >= 0; --i) {
      for (int j = number2.size() - 1; j >= 0; --j) {
        result.set(i + j + 1, result.get(i + j + 1) + number1.get(i) * number2.get(j));
        result.set(i + j, result.get(i + j) + result.get(i + j + 1) / 10);
        result.set(i + j + 1, result.get(i + j + 1) % 10);
      }
    }

    // Computed result may have leading zeros, we need to remove them
    int firstNonZero = 0;
    while (firstNonZero < result.size() && result.get(firstNonZero) == 0) {
      firstNonZero++;
    }

    result = result.subList(firstNonZero, result.size());
    if (result.isEmpty()) {
      return Arrays.asList(0); // If one of the operand was 0
    }

    result.set(0, sign * result.get(0)); // Put back sign
    return result;
  }
}
