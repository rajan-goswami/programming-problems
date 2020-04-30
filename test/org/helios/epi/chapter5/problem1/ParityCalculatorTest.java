package org.helios.epi.chapter5.problem1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParityCalculatorTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testParityCalculator_Success_PositiveNumber() {
    long input = 0b101010101010101010101010101010111L;
    short parity = ParityCalculator.calculateParity(input);
    Assert.assertEquals(0, parity);
  }
}
