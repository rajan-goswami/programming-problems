package org.helios.epi.chapter6.problem3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IntegerMultiplicatorTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testMultiply_Success_TwoPositiveNumbers() {
    List<Integer> number1 = Arrays.asList(3, 7, 2, 4);
    List<Integer> number2 = Arrays.asList(2, 8, 7, 9, 8, 8);

    List<Integer> result = IntegerMultiplicator.multiply(number1, number2);
    Assert.assertEquals(Arrays.asList(1, 0, 7, 2, 4, 6, 7, 3, 1, 2), result);
  }
}
