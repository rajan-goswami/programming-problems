package org.helios.epi.chapter7.problem6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class WordsReversalTest {

  @Before
  public void setUp() throws Exception {}

  @Test
  public void reverseWords_Success_ValidString() {
    char[] input =
        new char[] {'A', 'l', 'i', 'c', 'e', ' ', 'l', 'i', 'k', 'e', 's', ' ', 'B', 'o', 'b'};
    char[] expected =
        new char[] {'B', 'o', 'b', ' ', 'l', 'i', 'k', 'e', 's', ' ', 'A', 'l', 'i', 'c', 'e'};
    WordsReversal.reverseWords(input);
    Assert.assertTrue(Arrays.equals(expected, input));
  }
}
