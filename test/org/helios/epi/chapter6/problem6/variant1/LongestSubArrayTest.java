package org.helios.epi.chapter6.problem6.variant1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestSubArrayTest {

  @Before
  public void setUp() throws Exception {}

  @Test
  public void findLongestLengthOfEqualEntries_Success_HavingEqualEntries() {
    int[] input1 = new int[] {1, 1, 1, 4, 5, 6, 7, 6, 6, 6, 6, 2, 2, 2};
    int longestEqualSubArrayLength = LongestSubArray.lengthOfEqualEntries(input1);
    Assert.assertEquals(4, longestEqualSubArrayLength);

    int[] input2 = new int[] {1, 1, 1, 4, 5, 6, 7, 6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2};
    longestEqualSubArrayLength = LongestSubArray.lengthOfEqualEntries(input2);
    Assert.assertEquals(7, longestEqualSubArrayLength);
  }

  @Test
  public void findLongestLengthOfEqualEntries_Success_NotHavingEqualEntries() {
    int[] input = new int[] {1, 4, 5, 6, 7};
    int longestEqualSubArrayLength = LongestSubArray.lengthOfEqualEntries(input);
    Assert.assertEquals(1, longestEqualSubArrayLength);
  }
}
