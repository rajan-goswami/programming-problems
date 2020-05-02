package org.helios.epi.chapter6.problem6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StockProfitCalculatorTest {

  @Before
  public void setUp() throws Exception {}

  @Test
  public void calculateMaxProfit() {
    double[] stockPrices = new double[] {310, 315, 275, 295, 260, 270, 290, 230, 255, 250};
    double maxProfit = StockProfitCalculator.calculateMaxProfit(stockPrices);
    Assert.assertEquals(30, maxProfit, 0);
  }
}
