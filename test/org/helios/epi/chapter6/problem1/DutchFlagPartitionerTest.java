package org.helios.epi.chapter6.problem1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.helios.epi.chapter6.problem1.DutchFlagPartitioner.FlagColor;

public class DutchFlagPartitionerTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testPartition_Success_ThreeColorBands() {
    List<FlagColor> colorBands =
        Arrays.asList(
            FlagColor.BLUE,
            FlagColor.RED,
            FlagColor.RED,
            FlagColor.BLUE,
            FlagColor.WHITE,
            FlagColor.RED,
            FlagColor.WHITE,
            FlagColor.WHITE,
            FlagColor.BLUE);

    List<FlagColor> dutchFlag =
        Arrays.asList(
            FlagColor.RED,
            FlagColor.RED,
            FlagColor.RED,
            FlagColor.WHITE,
            FlagColor.WHITE,
            FlagColor.WHITE,
            FlagColor.BLUE,
            FlagColor.BLUE,
            FlagColor.BLUE);
    DutchFlagPartitioner.partition(4, colorBands);

    Assert.assertEquals(dutchFlag, colorBands);
  }
}
