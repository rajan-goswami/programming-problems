package org.helios.epi.chapter6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class EvenOddSeparatorTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testEventOddSeparator_Success_NumberArray() {
    int[] a = new int[] {3, 4, 7, 6, 2, 10, 9, 11, 6};
    int[] expected = new int[] {6, 4, 10, 6, 2, 9, 11, 7, 3};

    EvenOddSeparator.separate(a);
    Assert.assertEquals(true, Arrays.equals(expected, a));
  }

  @Test
  public void testEventOddSeparator_Success_EmptyArray() {
    int[] a = new int[] {};
    int[] expected = new int[] {};

    EvenOddSeparator.separate(a);
    Assert.assertEquals(true, Arrays.equals(expected, a));
  }
}
