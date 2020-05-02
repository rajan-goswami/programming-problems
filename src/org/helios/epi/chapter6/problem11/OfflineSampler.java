package org.helios.epi.chapter6.problem11;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OfflineSampler {
  /**
   * Create a random subset of size k (sampling) from a given numbers list
   *
   * <p>Time Complexity - O(n), Space Complexity - O(1)
   *
   * @param numbers Input list of numbers
   * @param k sample size
   */
  public static void sample(List<Integer> numbers, int k) {
    Random gen = new Random();
    for (int i = 0; i < k; i++) {
      Collections.swap(numbers, i, i + gen.nextInt(numbers.size() - i));
    }
  }
}
