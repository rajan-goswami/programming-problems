package org.helios.epi.chapter5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountBitsTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testCountBits_Success_PositiveNumber() {
    long input = 0b101010101010101010101010101010111L;
    short numBits = CountBits.countBits(input);
    Assert.assertEquals(18, numBits);
  }
}