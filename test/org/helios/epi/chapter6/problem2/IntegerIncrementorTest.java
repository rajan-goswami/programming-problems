package org.helios.epi.chapter6.problem2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerIncrementorTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void plusOne_Success_PositiveNumber() {
    List<Integer> number1 = Arrays.asList(1, 2, 8);
    List<Integer> number2 = Arrays.asList(1, 2, 9);
    List<Integer> number3 =
        new ArrayList<Integer>() {
          {
            add(9);
            add(9);
          }
        };

    IntegerIncrementor.plusOne(number1);
    Assert.assertEquals(Arrays.asList(1, 2, 9), number1);

    IntegerIncrementor.plusOne(number2);
    Assert.assertEquals(Arrays.asList(1, 3, 0), number2);

    IntegerIncrementor.plusOne(number3);
    Assert.assertEquals(Arrays.asList(1, 0, 0), number3);
  }

  @Test
  public void plusOne_Success_NegativeNumber() {
    List<Integer> number1 = Arrays.asList(-1, 2, 8);
    List<Integer> number2 = Arrays.asList(-1, 2, 9);
    List<Integer> number3 =
        new ArrayList<Integer>() {
          {
            add(-1);
            add(0);
            add(0);
          }
        };

    IntegerIncrementor.plusOne(number1);
    Assert.assertEquals(Arrays.asList(-1, 2, 7), number1);

    IntegerIncrementor.plusOne(number2);
    Assert.assertEquals(Arrays.asList(-1, 2, 8), number2);

    IntegerIncrementor.plusOne(number3);
    Assert.assertEquals(Arrays.asList(-9, 9), number3);
  }

  @Test
  public void plusOne_Success_Zero() {
    List<Integer> number1 = Arrays.asList(0);

    IntegerIncrementor.plusOne(number1);
    Assert.assertEquals(Arrays.asList(1), number1);
  }
}
