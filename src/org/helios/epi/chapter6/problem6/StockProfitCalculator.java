package org.helios.epi.chapter6.problem6;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StockProfitCalculator {
  public static double calculateMaxProfit(double[] stockPrices) {
    double minPrice = Double.MAX_VALUE;
    double maxProfit = 0.0;

    for (int i = 0; i < stockPrices.length; ++i) {
      minPrice = Math.min(minPrice, stockPrices[i]);
      maxProfit = Math.max(maxProfit, stockPrices[i] - minPrice);
    }

    return maxProfit;
  }
}
