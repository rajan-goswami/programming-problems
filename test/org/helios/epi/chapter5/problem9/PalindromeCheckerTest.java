package org.helios.epi.chapter5.problem9;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeCheckerTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testPalindromeNumber_True_GivenPalindrome() {
    long x = 5987667895L;
    boolean isPalindrome = PalindromeChecker.isPalindromeNumber(x);
    Assert.assertEquals(true, isPalindrome);
  }

  @Test
  public void testPalindromeNumber_False_GivenNonPalindrome() {
    long x = 59876695L;
    boolean isPalindrome = PalindromeChecker.isPalindromeNumber(x);
    Assert.assertEquals(false, isPalindrome);
  }
}
