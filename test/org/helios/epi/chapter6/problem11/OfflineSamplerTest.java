package org.helios.epi.chapter6.problem11;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class OfflineSamplerTest {

  @Before
  public void setUp() throws Exception {}

  @Test
  public void testSample_Success_PositiveK() {
    List<Integer> input = Arrays.asList(4, 5, 6, 7, 8, 1, 3, 4, 6);
    int k = 5;
    OfflineSampler.sample(input, k);
    System.out.println(input);
  }
}
