package org.helios.epi.chapter6.problem5;

import org.helios.epi.chapter6.problem5.variant1.KeyRemoval;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KeyRemovalTest {

  @Before
  public void setUp() throws Exception {}

  @Test
  public void removeKeyOccurrences_Success_IntegerArray() {
    int[] input = new int[] {5, 2, 3, 5, 6, 7, 8, 9, 5};
    int key = 5;

    int entries = KeyRemoval.removeKeyOccurrences(input, key);
    Assert.assertEquals(6, entries);
  }
}
