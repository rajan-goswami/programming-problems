package org.helios.epi.chapter5.problem2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BitSwapperTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testSwapBits_Success_PositiveNumber() {
    long input = 0b101010101010101010101010101010111L;
    long swapped = BitSwapper.swapBits(input, 5, 8);
    Assert.assertEquals(0b101010101010101010101010001110111L, swapped);
  }
}
