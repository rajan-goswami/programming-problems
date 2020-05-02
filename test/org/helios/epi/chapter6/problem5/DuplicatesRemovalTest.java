package org.helios.epi.chapter6.problem5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class DuplicatesRemovalTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void removeRepeatedFromSorted_Success_NumberArray() {
    int[] input = new int[] {2, 2, 3, 3, 3, 5, 6, 7, 9, 9};
    int uniqueEntries = DuplicatesRemoval.removeRepeatedFromSorted(input);
    System.out.println(Arrays.toString(input));
    Assert.assertEquals(6, uniqueEntries);
  }
}
