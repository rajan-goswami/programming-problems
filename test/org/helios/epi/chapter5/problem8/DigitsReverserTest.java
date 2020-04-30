package org.helios.epi.chapter5.problem8;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DigitsReverserTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testReverseDigits_Success_PositiveNumber() {
    long x = 113456L;
    long reverse = DigitsReverser.reverse(x);
    Assert.assertEquals(654311L, reverse);
  }
}
